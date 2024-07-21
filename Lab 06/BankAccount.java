import java.util.Scanner;

public class BankAccount {
    int accountNo;
    double balance;
    String name;

    public BankAccount(int acNo, double balance, String name) {
        this.accountNo = acNo;
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("Balance low");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] ac = new BankAccount[3];
        for (int i = 0; i < ac.length; i++) {
            System.out.println("acNO of " + i + " : ");
            int a = sc.nextInt();

            System.out.println("balance of " + i + " : ");
            float b = sc.nextFloat();

            System.out.println("name of " + i + " : ");
            String s = sc.next();

            ac[i] = new BankAccount(a, b, s);
        }
        sc.close();
    }
}
