package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * using arraylist to store the company details
 * using hashmap to store the company name as key and company details as values
 */
public class EmpWageBuilderArray implements EmpWage {
    ArrayList<ComputationOfEmpWage> companyDetailsList = new ArrayList<>();
    Map<String,ComputationOfEmpWage> map = new HashMap<>();

    public void addCompanyDetails(String company, int numOfWorkingDays, int isFullTime, int isPartTime, int wagePerHour) {
        ComputationOfEmpWage computationOfEmpWage = new ComputationOfEmpWage(company, numOfWorkingDays, isFullTime, isPartTime, wagePerHour);
        companyDetailsList.add(computationOfEmpWage);
        map.put(company,computationOfEmpWage);
    }

    /**
     * this method is to calculate Employee wage for multiple companies
     */
    public void computeEmpWage(){

        for (int i=0;i<companyDetailsList.size();i++){
            ComputationOfEmpWage computationOfEmpWage = companyDetailsList.get(i);
            computationOfEmpWage.totalEmpWage = this.empMonthlyWage(computationOfEmpWage);
        }
    }

    /**
     * To calculate the employee wage
     * @param computationOfEmpWage
     * @return
     */
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
        return monthlyWage = computationOfEmpWage.wagePerHour*totalHours;
    }

    @Override
    public int getTotalEmpWage(String company) {
        return map.get(company).totalEmpWage;
    }

}
