package com.employeewage;


public class EmployeeWageComputation
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome Employee Wage Computation Problem" );
        final int FULL_TIME = 2;
        final int PART_TIME = 1;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 30;
        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++) {
            int workingHours = 0;
            int empType = (int) (Math.random() * 10) % 3;

            switch (empType) {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
            }
            int wage = workingHours * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}
