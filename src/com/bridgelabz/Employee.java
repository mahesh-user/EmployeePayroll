package com.bridgelabz;

import java.util.Random;

public class Employee {
    public void result() {
        Random name = new Random();
        int b = name.nextInt(2);
        int check = 0;
        if (check == 1) {
            System.out.println(" employee is present");

        } else {
            System.out.println("employee is absent");

        }
    }

    public void salary() {
        Random name = new Random();
        int check = name.nextInt(3);
        final int Present = 1;
        final int Absent = 0;
        final int FULLTIME = 8;
        final int PARTTIME  = 4;
        final int WagePerHour = 20;
        final int NoOfWorkingDays = 20;
        int DailyWage = 0;
        int MonthlyWage = 0;
        int TotalHours = 0;
        int Hours = 0;
        if (NoOfWorkingDays < 100 && TotalHours < 100) {
            switch (check) {
                case Present: {
                    System.out.println("Employee is present");
                    DailyWage = FULLTIME * WagePerHour;
                    Hours = FULLTIME;
                    break;

                }
                case Absent: {
                    System.out.println("Employee is Absent");
                    break;
                }
                default: {
                    System.out.println("Employee is part time ");
                    DailyWage = PARTTIME  * WagePerHour;
                    Hours = PARTTIME ;
                    break;
                }

            }
            MonthlyWage = DailyWage + MonthlyWage;
            TotalHours = Hours + TotalHours;

        }
        MonthlyWage = DailyWage * NoOfWorkingDays;
        System.out.println("Daily wage : " + DailyWage);
        System.out.println("Monthly wage : " + MonthlyWage);

    }
}
