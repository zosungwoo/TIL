package org.example;

public class Loan {
    String loanNumber;
    String branchName;
    int amount;

    public Loan(String loanNumber, String branchName, int amount) {
        this.loanNumber = loanNumber;
        this.branchName = branchName;
        this.amount = amount;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        /*
        return "Loan{" +
                "loanNumber='" + loanNumber + '\'' +
                ", branchName='" + branchName + '\'' +
                ", amount=" + amount +
                '}';
        */
        return loanNumber + "," + branchName + "," + amount;
    }
}
