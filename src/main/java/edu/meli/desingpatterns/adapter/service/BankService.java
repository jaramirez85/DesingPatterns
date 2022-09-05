package edu.meli.desingpatterns.adapter.service;

public class BankService {

    public BankData findByAccountNumber(int accountNumber) {

        if (accountNumber == 1) {
            return new BankData(accountNumber,"Nick", 12200,"saving");
        } else if (accountNumber == 2) {
            return new BankData(accountNumber,"Susan", 23440, "checking");
        } else if (accountNumber == 3) {
            return new BankData(accountNumber,"Jhon", 430, "checking");
        } else if (accountNumber == 4) {
            return new BankData(accountNumber,"Nath", 10, "saving");
        } else {
            return null;
        }
    }
}
