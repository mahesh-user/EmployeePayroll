package com.bridgelabz;

public interface EmpWage {
    void addCompanyDetails(String company, int numOfWorkingDays, int isFullTime, int isPartTime, int wagePerHour);
    void computeEmpWage();
    int empMonthlyWage(ComputationOfEmpWage computationOfEmpWage);
    int getTotalEmpWage(String company);
}
