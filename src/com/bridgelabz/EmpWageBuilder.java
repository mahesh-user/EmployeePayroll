package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        EmpWageBuilderArray empWageBuilderArray =new EmpWageBuilderArray();
        empWageBuilderArray.addCompanyDetails("reliance",30,8,4,20);
        empWageBuilderArray.addCompanyDetails("Dmart",30,8,4,30);
        empWageBuilderArray.computeEmpWage();
    }
}
