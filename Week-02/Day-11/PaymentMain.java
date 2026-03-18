class Payment {
    public void pay() {
        System.out.println("Payment is done.");
    }
}

class Upi extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment is done through UPI.");
    }
}

class Card extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment is done through Card.");
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        Payment u = new Upi();
        Payment c = new Card();
        u.pay();
        c.pay();
    }
}
