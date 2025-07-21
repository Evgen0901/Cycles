package ru.netology.services;

        
public class FreelanceService{

    public int calcMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int restMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                balance = balance - expenses;
                balance = balance / 3;
                restMonths++;
            } else {
                balance = balance + income;
                balance = balance -expenses;
            }
        }
        return restMonths;

    }
}
