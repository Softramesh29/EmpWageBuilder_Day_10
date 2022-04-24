package com.bridgelabz.EmpWageBuilder_Day_8;

public class WageForMonthUC5 {
	 	static final int IS_FULL_TIME = 1;
	    static final int WAGE_PER_HRS = 20;
	    static final int IS_PART_TIME = 2;
	    static final int NUM_OF_WORKING_DAYS = 20;
	    
	    public static void CalMonthWage() {
	    	int empHrs = 0;
	    	int empWage = 0;
	    	int totalEmpwage = 0;
	    	
	    	for ( int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
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
	    	empWage = empHrs * WAGE_PER_HRS;
	    	totalEmpwage += empWage;
	    	System.out.println("Employee wage : " + empWage);
	    	}
	        System.out.println("Total emp wage : " + totalEmpwage);
	    }
	    
	    public static void main(String[] args) {
	    	WageForMonthUC5 object = new WageForMonthUC5();
	        object.CalMonthWage();
	    }
}
