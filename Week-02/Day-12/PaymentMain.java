interface Payment {
    public void pay();
}

class Upi implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment is done through UPI.");
    }
}

class Card implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment is done through Card.");
    }
}

public class PaymentMain {
    public static void main() {
        Payment u = new Upi();
        Payment c = new Card();
        u.pay();
        c.pay();
    }
}
