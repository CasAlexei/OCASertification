package IgorOCA.chapterII6;

public class Problem6_1 {
}

class BankAccount {
    int balance;

    BankAccount() {
        this.balance = new java.util.Random().nextInt(1000);
    }

    int getBalance() {
        return this.balance;
    }

    void makeTransfer(int amount) {
        this.balance += amount;
    }
}

class HighRoller {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(), ba2 = new BankAccount();
        System.out.println("Was: $" + ba.getBalance());
//        this.balance = 0;
//        BankAccount.balance = 0;
//        new BankAccount(0);
//        ba.getBalance() = 0;
        ba.balance = 0;
//        ba.makeTransfer(0);
        ba.makeTransfer(ba.balance * -1);
        ba.makeTransfer(ba.getBalance());
        System.out.println("Now: $" + ba.getBalance());
    }
}
