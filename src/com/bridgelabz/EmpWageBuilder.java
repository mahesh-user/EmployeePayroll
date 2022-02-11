package com.bridgelabz;

public class EmpWageBuilder {
    public static void main(String[] args) {
        EmpWage empWageBuilderArray =new EmpWageBuilderArray();
        empWageBuilderArray.addCompanyDetails("reliance",30,8,4,20);
        empWageBuilderArray.addCompanyDetails("Dmart",30,8,4,30);
        empWageBuilderArray.addCompanyDetails("Jio",20,8,4,25);
        empWageBuilderArray.computeEmpWage();
    }

}
