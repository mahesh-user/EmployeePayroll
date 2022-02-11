package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


    public class EmpWageBuilderArray implements EmpWage {
        ArrayList<ComputationOfEmpWage> companyDetailsList = new ArrayList<>();

        public void addCompanyDetails(String company, int numOfWorkingDays, int isFullTime, int isPartTime, int wagePerHour) {
            ComputationOfEmpWage computationOfEmpWage = new ComputationOfEmpWage(company, numOfWorkingDays, isFullTime, isPartTime, wagePerHour);
            companyDetailsList.add(computationOfEmpWage);
        }
        public void computeEmpWage(){

            for (int i=0;i<companyDetailsList.size();i++){
                ComputationOfEmpWage computationOfEmpWage = companyDetailsList.get(i);
                int wage = this.empMonthlyWage(computationOfEmpWage);
                System.out.println(companyDetailsList.get(i).companyName + " monthly wage of the Employee : " + wage);
            }
        }

        public int empMonthlyWage(ComputationOfEmpWage computationOfEmpWage) {
            final int IS_PRESENT = 1;
            final int IS_ABSENT = 0;
            int dailyWage = 0;
            int monthlyWage = 0;
            int totalHours =0;
            int hours = 0;
            for (int i = 0; i<= computationOfEmpWage.numOfWorkingDays && totalHours<=100; i++){
                Random random = new Random();
                int empCheck = random.nextInt(3);
                switch (empCheck) {
                    case IS_PRESENT: {
                        hours = computationOfEmpWage.isFullTime;
                        break;
                    }
                    case IS_ABSENT: {
                        hours = hours;
                        break;
                    }
                    default: {
                        hours = computationOfEmpWage.isPartTime;
                        break;
                    }
                }
                dailyWage = hours*computationOfEmpWage.wagePerHour;
                totalHours += hours;
            }
            return monthlyWage = computationOfEmpWage.numOfWorkingDays * totalHours;
            //System.out.println("company name : " + computationOfEmpWage.companyName + " Monthly salary : " +monthlyWage + " Total Hours : " +totalHours);
        }

}
