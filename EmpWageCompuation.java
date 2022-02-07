package com.bridgeabz.day9;

//Day9
public class EmpWageCompuation {

	public static  final int isFULL_TIME=1;
	public static  final int isPART_TIME=2;
	public  int maxWorkingHrs;
	public  int numOfWorkingDays;
	public  int empRatePerHr;
	public   String companyName;
	
	public EmpWageCompuation(String companyNam,int empRtPerHr,int numOfWorkDays,int maxWorkHrs) {
		maxWorkingHrs=maxWorkHrs;
		numOfWorkingDays=numOfWorkDays;
		empRatePerHr=empRtPerHr;
		companyName=companyNam;
	}
	
	public void EmpWageCompute()
	{
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		while (totalEmpHrs <= maxWorkingHrs &&  totalWorkingDays < numOfWorkingDays)
		{
			totalWorkingDays++;
			int empstatus=(int) Math.floor(Math.random()*10) % 3;
			switch (empstatus)
			{
			case isFULL_TIME:
				empHrs=8;
				break;
			case isPART_TIME:
				empHrs=4;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * empRatePerHr;
			totalEmpWage += empWage;
			System.out.println("DAY"+totalWorkingDays);
			System.out.println("Emp Hrs is:"+empHrs);
			System.out.println("Emp Wage  is:"+empWage);
		}
		System.out.print("\nTotal Employee Working Hrs is:"+totalEmpHrs);
		System.out.print("\nTotal Employee Working Days is:"+totalWorkingDays);
		System.out.println("\nMonthly Employee Wage is:"+totalEmpWage);
	}
	public static void main(String[] args)
	{
		 EmpWageCompuation empObj1 = new   EmpWageCompuation("Dmart",20,30,100);
		 EmpWageCompuation empObj2 = new   EmpWageCompuation("Reliance",10,30,100);
		 System.out.println("Wage Calculation for Dmart Employee");
		 empObj1.EmpWageCompute();
		 System.out.println("\nWage Calculation for Reliance Employee");
		 empObj2.EmpWageCompute();
	}
}