package Interfaces;

public class VisaCard implements ATM {
    public void pay(){
        System.out.println("Visa card.");
    }

    public void withdrawMoney(){
        System.out.println("Withdrawing money from Visa.");
    }
}
