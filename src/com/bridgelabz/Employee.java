package com.bridgelabz;

import java.util.Random;

public class Employee {
    public void result() {
        Random name = new Random();
        int check = name.nextInt(2);
        if (check == 1) {
            System.out.println(" employee is present");

        } else {
            System.out.println("employee is absent");

        }
    }

}
