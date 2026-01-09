package java_oops;



abstract class APayment {

    int transactionId;
    double amount;
    String currency;


    public APayment(int transactionId, double amount, String currency) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.currency = currency;
    }


    abstract void pay();
}


class CreditCard extends APayment {

    public CreditCard(int transactionId, double amount, String currency) {
        super(transactionId, amount, currency);
    }

    @Override
    void pay() {
        System.out.println("Credit Card Payment");
        System.out.println("Amount: " + amount + " " + currency);
    }
}


class UPI extends APayment {

    public UPI(int transactionId, double amount, String currency) {
        super(transactionId, amount, currency);
    }

    @Override
    void pay() {
        System.out.println("UPI Payment");
        System.out.println("Amount: " + amount + " " + currency);
    }
}

public class Abstract_Class_WithConstructor {

    public static void main(String[] args) {

        
        APayment payment1 = new CreditCard(101, 55000, "INR");
        APayment payment2 = new UPI(102, 85000, "INR");

        payment1.pay();
        payment2.pay();
    }
}
