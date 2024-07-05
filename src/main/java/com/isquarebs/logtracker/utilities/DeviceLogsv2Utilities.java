package com.isquarebs.logtracker.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isquarebs.logtracker.entity.DeviceLogs;
import com.isquarebs.logtracker.entity.ResultStructure;
import com.isquarebs.logtracker.entity.ResultStructurev2;
import com.isquarebs.logtracker.entity.ResultStructurev3;

@Component
public class DeviceLogsv2Utilities {
	List<DeviceLogs> data=new ArrayList<>();
	
	
	public DeviceLogsv2Utilities() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LocalTime getTime(DeviceLogs devicelogs)
	{
		return LocalTime.of(devicelogs.getLogDate().getHour(), devicelogs.getLogDate().getMinute(),devicelogs.getLogDate().getSecond());
	}

	public LocalDate getDate(DeviceLogs devicelogs)
	{
		return LocalDate.of(devicelogs.getLogDate().getYear(), devicelogs.getLogDate().getMonthValue(),devicelogs.getLogDate().getDayOfMonth());
	}
	public LocalDate getDateFromLogdate(LocalDateTime logDate)
	{
		return LocalDate.of(logDate.getYear(), logDate.getMonthValue(),logDate.getDayOfMonth());
	}
	
	public List<Object> calcNoOfInOuts(List<DeviceLogs> data)
	{
		int noofin=0;
		int noofout=0;
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i).getC1().equals("in"))
				noofin++;
			else if(data.get(i).getC1().equals("out"))
				noofout++;
		}
		return Arrays.asList(noofin,noofout);
	}
	public boolean calcNoOfInOutsv2(List<DeviceLogs> data)
	{
		int noofin=0;
		int noofout=0;
		for(int i=0;i<data.size();i++)
		{
			LocalDate localdate=getDate(data.get(i));
			for(int j=0;j<data.size();j++)
			{
				if(!checkInOutByDate(data,localdate))
					return false;
			}
		}
		return true;
	}
	public List<Object> calcNoOfInOutsByDate(List<DeviceLogs> data,LocalDate localdate)
	{
		int noofin=0;
		int noofout=0;

		for(int i=0;i<data.size();i++)
		{
			if(getDate(data.get(i)).equals(localdate)) {
				if(data.get(i).getC1().equals("in"))
					noofin++;
				else if(data.get(i).getC1().equals("out"))
					noofout++;
			}
		}
		return Arrays.asList(noofin,noofout);
	}
	public boolean checkInOutEquality(int in,int out)
	{
		if(in==out)
			return true;
		else
			return false;
	}
	public boolean checkInOutByDate(List<DeviceLogs> data,LocalDate localdate)
	{
		//LocalDate errordate=LocalDate.of(0, 0, 0);
		for(int i=0;i<data.size();i++)
		{
			if(getDate(data.get(i)).equals(localdate))
			{
				List<Object> obj=calcNoOfInOutsByDate(data,localdate);
				if(checkInOutEquality((int)obj.get(0),(int)obj.get(1)))
						return true;
			}
		}
		return false;
	}
	public int returnnoofInOutByDate(List<DeviceLogs> data,LocalDate localdate)
	{
		//LocalDate errordate=LocalDate.of(0, 0, 0);
		List<Object> obj=new ArrayList<>();
		for(int i=0;i<data.size();i++)
		{
			if(getDate(data.get(i)).equals(localdate))
			{
				obj=calcNoOfInOutsByDate(data,localdate);
			}
		}
		return (int)obj.get(0)+(int)obj.get(1);
	}
	
	public LocalTime calculateDiff(DeviceLogs dt,DeviceLogs dt1)
	{
		LocalTime t=getTime(dt);
		LocalTime t1=getTime(dt1);

		System.out.println(t);
		System.out.println(t1);
		
		t1=t1.minusHours(t.getHour());
		t1=t1.minusMinutes(t.getMinute());
		t1=t1.minusSeconds(t.getSecond());
		
		System.out.println("TimeGap : "+t1);
		
		return t1;
	}
	public LocalTime calculateDiffv2(LocalTime t1,LocalTime t2)
	{		
		t2=t2.minusHours(t1.getHour());
		t2=t2.minusMinutes(t1.getMinute());
		t2=t2.minusSeconds(t1.getSecond());
		
		System.out.println("TimeGap : "+t2);
		
		return t2;
	}
	public List<ResultStructure> calcEmpTime(List<DeviceLogs> data)
	{
		List<ResultStructure> emp=new ArrayList<>();
		DeviceLogs dt;
		DeviceLogs dt1;
		LocalTime t;
		int date;
		LocalTime sum = LocalTime.of(0,0,0);
		LocalTime in = LocalTime.of(0,0,0);
		LocalTime out = LocalTime.of(0,0,0);
		
		in=getTime(data.get(0));
		for(int i=0;i<data.size()-1;i+=2)
		{
			//in=getTime(data.get(0));
			dt=data.get(i);
			date=dt.getLogDate().getDayOfMonth();
			
			dt1=data.get(i+1);
			t=calculateDiff(dt,dt1);
			sum=sum.plusHours(t.getHour());
			sum=sum.plusMinutes(t.getMinute());
			sum=sum.plusSeconds(t.getSecond());
			
			if(i+2==data.size())
			{
				out=getTime(data.get(i+1));
				emp.add(new ResultStructure(data.get(i).getUserid(),getDate(data.get(i)),in,out,sum));
				break;
			}
			else if(date!=data.get(i+2).getLogDate().getDayOfMonth())
			{

				out=getTime(data.get(i+1));
				emp.add(new ResultStructure(data.get(i).getUserid(),getDate(data.get(i)),in,out,sum));
				in=getTime(data.get(i+2));
				sum = LocalTime.of(0,0,0);
			}
	
		}
		return emp;
	}
	
	public List<ResultStructure> calcEmpTimev2(List<DeviceLogs> data)
	{
		List<Object> obj=calcNoOfInOuts(data);
		int noofin=(int) obj.get(0);
		int noofout=(int) obj.get(1);
		boolean equalityCheckResult=checkInOutEquality(noofin,noofout);
		List<ResultStructure> emp=new ArrayList<>();
		DeviceLogs dt;
		DeviceLogs dt1;
		LocalTime t;
		int date;
		int month;
		int date1;
		int month1;
		LocalTime sum = LocalTime.of(0,0,0);
		LocalTime in = LocalTime.of(0,0,0);
		LocalTime out = LocalTime.of(0,0,0);
		
		//in=getTime(data.get(0));
		if(calcNoOfInOutsv2(data))
		{
			in=getTime(data.get(0));
			for(int i=0;i<data.size()-1;i+=2)
			{
				//in=getTime(data.get(0));
				dt=data.get(i);
				date=dt.getLogDate().getDayOfMonth();
				month=dt.getLogDate().getMonthValue();
				
				dt1=data.get(i+1);
				t=calculateDiff(dt,dt1);
				sum=sum.plusHours(t.getHour());
				sum=sum.plusMinutes(t.getMinute());
				sum=sum.plusSeconds(t.getSecond());
				
				if(i+2==data.size())
				{
					out=getTime(data.get(i+1));
					emp.add(new ResultStructure(data.get(i).getUserid(),getDate(data.get(i)),in,out,sum));
					break;
				}
				else if(date!=data.get(i+2).getLogDate().getDayOfMonth() || month!=data.get(i+2).getLogDate().getMonthValue())
				{

					out=getTime(data.get(i+1));
					emp.add(new ResultStructure(data.get(i).getUserid(),getDate(data.get(i)),in,out,sum));
					in=getTime(data.get(i+2));
					sum = LocalTime.of(0,0,0);
				}
		
			}
			return emp;
		}
		else
		{
			in=getTime(data.get(0));
			//for(int i=0;i<data.size();i=i+2)
			int i=0;
			while(i<data.size())
			{
				dt=data.get(i);
				date=dt.getLogDate().getDayOfMonth();
				month=dt.getLogDate().getMonthValue();
				
				dt1=data.get(i+1);
				
				if(checkInOutByDate(data,getDate(data.get(i))))
				{
					t=calculateDiff(dt,dt1);
					sum=sum.plusHours(t.getHour());
					sum=sum.plusMinutes(t.getMinute());
					sum=sum.plusSeconds(t.getSecond());
					
					if(i+2==data.size())
					{
						out=getTime(data.get(i+1));
						emp.add(new ResultStructure(data.get(i).getUserid(),getDate(data.get(i)),in,out,sum));
						break;
					}
					else if(date!=data.get(i+2).getLogDate().getDayOfMonth() || month!=data.get(i+2).getLogDate().getMonthValue())
					{
						out=getTime(data.get(i+1));
						emp.add(new ResultStructure(data.get(i).getUserid(),getDate(data.get(i)),in,out,sum));
						in=getTime(data.get(i+2));
						sum = LocalTime.of(0,0,0);
					}
					/*else if()
					{
						
					}*/
					i=i+2;
				}
				else
				{
					emp.add(new ResultStructure(data.get(i).getUserid(),getDate(data.get(i)),LocalTime.of(0,0,0),LocalTime.of(0,0,0),LocalTime.of(0,0,0)));
					sum = LocalTime.of(0,0,0);
					//in= LocalTime.of(0,0,0);;
					//out= LocalTime.of(0,0,0);;
					int j=returnnoofInOutByDate(data,getDate(data.get(i)));
					i+=j;
				}
			}
			return emp;
		}
		
	}

	public List<ResultStructurev3> calcEmpTimev3(List<ResultStructure> res) {
		List<ResultStructurev3> rsv3=new ArrayList<>();
		LocalTime nonproductivetime;
		LocalTime fin;
		LocalTime lout;
		LocalTime productivetime;
		LocalTime zero=LocalTime.of(0, 0,0);
		for(int i=0;i<res.size();i++)
		{
			fin=res.get(i).getFirstintime();
			lout=res.get(i).getLastouttime();
			productivetime=res.get(i).getProductivetime();
			if(fin.equals(zero)||lout.equals(zero))
			{
				rsv3.add(new ResultStructurev3(res.get(i).getUserid(),res.get(i).getLocaldate(),fin,lout,productivetime,LocalTime.of(0,0,0)));
			}
			else
			{
				nonproductivetime=calculateDiffv2(productivetime,calculateDiffv2(fin,lout));
				rsv3.add(new ResultStructurev3(res.get(i).getUserid(),res.get(i).getLocaldate(),fin,lout,productivetime,nonproductivetime));
			}
		}
		
		return rsv3;
	}
}
