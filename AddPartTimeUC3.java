package com.bridgelabz.EmpWageBuilder_Day_8;

public class AddPartTimeUC3 {
    static final int IS_FULL_TIME = 1;
    static final int WAGE_PER_HRS = 20;
    static final int IS_PART_TIME = 2;
    
    public static void EmpCheck() {
    	int empHrs = 0;
    	int empwage = 0;

    	double empCheck = Math.floor(Math.random() * 10) % 3;
    	 if (empCheck == IS_FULL_TIME)
    		 empHrs = 8;
    	 else if (empCheck == IS_PART_TIME)
    		 empHrs = 8;
    		else
    		 empHrs = 0;
    empwage = empHrs * WAGE_PER_HRS;
    System.out.println("Employee wage : " + empwage);
    }
    
    public static void main(String[] args) {
    	AddPartTimeUC3 object = new AddPartTimeUC3();
        object.EmpCheck();
    }
}
