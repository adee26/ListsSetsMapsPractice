package Interfaces;

public class Main {
    public static void main(String[] args) {
        IBanking bankingWithVisa = new VisaCard();
        bankingWithVisa.pay();
        IBanking bankingWithMastercard = new MasterCard();
        bankingWithMastercard.pay();
    }
}
