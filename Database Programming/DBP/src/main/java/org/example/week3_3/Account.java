package org.example.week3_3;

public class Account {
    String accountNumber;
    String branchName;
    int balance;

    public Account(String accountNumber, String branchName, int balance) {
        this.accountNumber = accountNumber;
        this.branchName = branchName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accountNumber + "," + branchName + "," + balance;
    }
}
