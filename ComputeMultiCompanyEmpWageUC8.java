package com.bridgelabz.EmpWageBuilder_Day_8;

public class ComputeMultiCompanyEmpWageUC8 {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
   
    public static int ComputeEmpWage(String Company, int empRatePerHrs, int numOfWorkingDays, int maxHrsPermonth) {

    	int totalEmphrs = 0, totalWorkingdays =0;
    	
    	while (totalEmphrs <= maxHrsPermonth &&
    			totalWorkingdays < numOfWorkingDays) {
    			int empHrs = 0;
    			totalWorkingdays++;
    	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    		switch (empCheck) {
    		case IS_FULL_TIME:
    			empHrs = 8;
    			break;
    		case IS_PART_TIME:
    			empHrs = 8;
    			break;
    		default:
    			empHrs = 0;
    		}	
    		totalEmphrs += empHrs;
			System.out.println("day# : " + totalWorkingdays + "Emp Hr : " + empHrs);
    	}
    	int totalEmpWages = totalEmphrs * empRatePerHrs;
		System.out.println("Total Emp Wage : " + totalEmpWages);
		return totalEmpWages;
   
    }
    
    public static void main(String[] args) {
    	System.out.println("Computing Employee wage for D_mart");
    	ComputeEmpWage("Dmart", 20, 2, 10 );
    	System.out.println("Computing Employee wage for Reliance");
    	ComputeEmpWage("Reliance", 20, 2, 10 );
    }
}
