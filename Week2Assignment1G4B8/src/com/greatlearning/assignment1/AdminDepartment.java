//#by Chandan_Jyoti_Sarma_Admin_Module


package com.greatlearning.assignment1;
//import java.util.Date;
//import java.text.Format;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;

public class AdminDepartment extends SuperDepartment{

	public String departmentName() {
		String deptName="Wellcome to Admin Department";
		System.out.println(deptName);
		return null;
	}
	public String getsTodaysWork() {
		String todayWork="Complete your document submission";
		System.out.println(todayWork);
		return null;
	}
	public String getWorkDeadline() {
		String workDeadline="Complete by EOD";
		System.out.println(workDeadline);
		return null;
	}
	public String getHoliday() {
		
		
		/*THIS PART OF METHOD IS WRITTEN TO CALCULATE WHETHER IT WORKING DAY OF THE WEEK OR NOT
		String workDay="";
		int workFlag; //WEEKDAY FLAG
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-YYYY");
		System.out.println("Todays Working Date  :"+sdf.format(calendar.getTime()));
		
		 * NB: THIS PART OF THE CODE IS WRITTEN TO COMPARE THE SYS-DATE 
		 * AND TO FIND WHETHER IT WORKING DATE OR NOT
		 * 
		Format f_workDay = new SimpleDateFormat("EEEE");
		workDay = f_workDay.format(new Date());
		workFlag= calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("Today's Working Day  :"+workDay);
		if (workFlag==1) //WORKFLAG==1 IT IS SUNDAY
		{
			System.out.println("This is Holiday");
		}
		else //REMAINING WEEKDAY FROM MONDAY TO SATURDAY
		{	
			System.out.println("This is not Holiday");

		}*/
		String workDay="Today is not holiday";
		System.out.println(workDay);
		return null;

	}
	public static void main(String[] args) throws Exception {
		
		
		AdminDepartment admdept = new AdminDepartment();
		admdept.departmentName();
		admdept.getsTodaysWork();
		admdept.getWorkDeadline();
		admdept.getHoliday();
	}

}
