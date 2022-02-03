package com.bridgelabz;

import java.util.Random;

public class Employee {
    public void  result() {
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
         final int Present=1;
         final int Absent=0;
         final int Fulltime=8;
         final int Parttime=4;
         final int WagePerHour=20;
         final int NoOfWorkingDays = 20;
         int DailyWage=0;
        int monthlyWage = 0;
            switch (check) {
                case Present: {
                    System.out.println("Employee is present");
                    DailyWage = Fulltime * WagePerHour;
                    break;

                }
                case Absent: {
                    System.out.println("Employee is Absent");
                    break;
                }
                default: {
                    System.out.println("Employee is part time ");
                    DailyWage = Parttime * WagePerHour;
                    break;
                }
            }
        monthlyWage=DailyWage*NoOfWorkingDays;
            System.out.println("Daily wage : " + DailyWage);
        System.out.println("Monthly wage : " + monthlyWage );
        }

    }


