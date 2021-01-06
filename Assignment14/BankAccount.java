package Homeworks.Assignment_14;

public class BankAccount {
}



class SavingAccount extends BankAccount{
    public double interestRate;
    public double getInterestRate(){
        return interestRate;
    }
    public SavingAccount(double d){
        this.interestRate=d;
    }
}