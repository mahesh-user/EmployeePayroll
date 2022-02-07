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

    public static void multiplecompanies(int WagePerHour, int NoOfWorkingDays, int TotalHours, String companyName) {
        Random name = new Random();
        int check = name.nextInt(3);
        final int Present = 1;
        final int Absent = 0;
        final int Fulltime = 8;
        final int Parttime = 4;


        int DailyWage = 0;
        int MonthlyWage = 0;

        int Hours = 0;
        while (TotalHours <= 100 && NoOfWorkingDays <= 20) {
            switch (check) {
               case Present: {
                    System.out.println("Employee is present");
                    DailyWage = Fulltime * WagePerHour;
                    Hours = Fulltime;
                    break;

                }
                case Absent: {
//                    System.out.println("Employee is Absent");
                    break;
                }
                default: {
                   System.out.println("Employee is part time ");
                    DailyWage = Parttime * WagePerHour;
                    Hours = Parttime;
                    break;
                }

            }
            MonthlyWage = DailyWage + MonthlyWage;
            TotalHours = Hours + TotalHours;

        }
        MonthlyWage = DailyWage * NoOfWorkingDays;
        System.out.println("company name : " + companyName + "  DailyWage:  " + DailyWage + "  monthlywage:  " + MonthlyWage + " totalhours  " + TotalHours);

    }

}









