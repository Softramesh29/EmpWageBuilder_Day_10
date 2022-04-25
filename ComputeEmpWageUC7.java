package com.bridgelabz.EmpWageBuilder_Day_8;

public class ComputeEmpWageUC7 {
	static final int IS_FULL_TIME = 1;
    static final int WAGE_PER_HRS = 20;
    static final int IS_PART_TIME = 2;
    static final int NUM_OF_WORKING_DAYS = 20;
    static final int MAX_HRS_PER_MONTH = 100;
    
    public static int ComputeEmpWage() {

    	int totalEmphrs = 0, totalWorkingdays =0;
    	
    	while (totalEmphrs <= MAX_HRS_PER_MONTH &&
    			totalWorkingdays < NUM_OF_WORKING_DAYS) {
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
    	int totalEmpWages = totalEmphrs * WAGE_PER_HRS;
		System.out.println("Total Emp Wage : " + totalEmpWages);
		return totalEmpWages;
   
    }
    
    public static void main(String[] args) {
    	ComputeEmpWage();
    }
}
