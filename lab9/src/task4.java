class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Пополнение: " + amount + ", Баланс: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: " + amount + ", Баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

class CreditAccount extends BankAccount {
    CreditAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Снятие с кредитного счета: " + amount + ", Баланс: " + balance);
    }
}

public class task4 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA001", 1000);
        CreditAccount ca = new CreditAccount("CA001", 500);

        sa.deposit(300);
        sa.withdraw(200);

        ca.deposit(100);
        ca.withdraw(800);
    }
}