package javaapplication201;

public class BankAccount {
    private String accountnumber;
    private String accountholder;
    private double balance;
    public BankAccount(String accnum,String acchold, double bal ){
        accountnumber=accnum;
        accountholder=acchold;
            balance=bal;
    }
    public void deposit(double amount){
    balance+=amount;
    }
    public void withdraw(double amount){
    if(amount>0 && amount<=balance){
     balance-=amount;
    }
    else  System.out.println(" invalid ");
    }
    public String getaccountnumber(){
    return accountnumber;}
    public String getaccountholder(){
    return accountholder;}
    public double getbalance(){
    return balance;}
    
}
