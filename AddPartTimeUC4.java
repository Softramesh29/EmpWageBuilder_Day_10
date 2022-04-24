package com.bridgelabz.EmpWageBuilder_Day_8;

public class AddPartTimeUC4 {
	 static final int IS_FULL_TIME = 1;
	    static final int WAGE_PER_HRS = 20;
	    static final int IS_PART_TIME = 2;
	    
	    public static void AddPartTime() {
	    	int empHrs = 0;
	    	int empwage = 0;

	    	int empCheck = (int)Math.floor(Math.random() * 10) % 3;
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
	    empwage = empHrs * WAGE_PER_HRS;
	    System.out.println("Employee wage : " + empwage);
	    }
	    
	    public static void main(String[] args) {
	    	AddPartTimeUC4 object = new AddPartTimeUC4();
	        object.AddPartTime();
	    }
}
