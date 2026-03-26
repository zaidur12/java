class BankAccount {
    float amount;
    float deposit;
    float credited;

    void depositAmount() {
        float current = amount + deposit;
        System.out.println("Amount after deposit is " + current);
    }

    void creditAmount() {
        float deduct = amount+deposit-credited;
        System.out.println("Amount after credit is " + deduct );
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.amount = 34000f;
        account.deposit = 2500f;
        account.credited = 5000f;

        if (account.amount == 0) {
            System.out.println("Sorry, you cannot credit it.");
        } 
            account.depositAmount();
            account.creditAmount();
        
    }
}
