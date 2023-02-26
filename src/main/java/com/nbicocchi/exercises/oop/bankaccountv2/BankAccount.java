package com.nbicocchi.exercises.oop.bankaccountv2;

public interface BankAccount {
    String getIBAN();

    String getCountry();

    void deposit(double amount);

    double withdraw(double amount);

    void transfer(BankAccount other, double amount);

    void addAnnualInterest();
}
