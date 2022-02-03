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
        int WagePerHour = 20;
        int FullDayHour = 8;
        int PartTime = 4;
        int TotalWage;
        if (check == 1) {
            System.out.println(" employee is present");
            TotalWage = WagePerHour * FullDayHour;
            System.out.println("employee wage is " + TotalWage);
        } else if (check == 2) {
            System.out.println("employee is parttime");
            TotalWage = WagePerHour* PartTime;
            System.out.println("employee wage is " + TotalWage);
        } else {
            System.out.println("employee is absent");
            TotalWage = 0;
            System.out.println("employee wage is " + TotalWage);
        }


    }
}

