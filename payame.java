interface Payment {
    void pay();
    void message();
}

class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println(1000);
    }

    @Override
    public void message() {
        System.out.println("Payment is done through UPI");
    }
}

class NET implements Payment {
    @Override
    public void pay() {
        System.out.println(2000);
    }

    @Override
    public void message() {
        System.out.println("Payment is done through NET");
    }
}

class CardP implements Payment {
    @Override
    public void pay() {
        System.out.println(1500);
    }

    @Override
    public void message() {
        System.out.println("Payment is done through Card");
    }
}

class Paymentmethod {
    public Payment getPayment(String type) {
        switch (type.toLowerCase()) {
            case "upi":
                return new UPI();
            case "net":
                return new NET();
            case "card":
                return new CardP();
            default:
                throw new IllegalArgumentException("Invalid payment type: " + type);
        }
    }
}

public class payame {
    public static void main(String[] args) {
        Paymentmethod paymentMethod = new Paymentmethod();
        Payment obj = paymentMethod.getPayment("upi");
        obj.pay();
        obj.message();
    }
}
