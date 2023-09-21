package org.example;

public class CreditInfo {
    String customerName;
    int branchName;
    int creditBalance;

    public CreditInfo(String cutomerName, int branchName, int creditBalance) {
        this.customerName = cutomerName;
        this.branchName = branchName;
        this.creditBalance = creditBalance;
    }

    public String getCutomerName() {
        return customerName;
    }

    public void setCutomerName(String cutomerName) {
        this.customerName = cutomerName;
    }

    public int getBranchName() {
        return branchName;
    }

    public void setBranchName(int branchName) {
        this.branchName = branchName;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    @Override
    public String toString() {
        return customerName + ", " + branchName + ", " + creditBalance;
    }
}
