import java.util.Objects;
import java.util.Scanner;

public class Deposit {

    private double amount;

    private double rate;

    private int age;


    public Deposit(double amount, double rate, int age) {
        this.amount = amount;
        this.rate = rate;
        this.age = age;
    }
    public double calculateProfit() {
        double base = 1 + rate / 100;
        double totalAmount = amount;

        for (int i = 0; i < age; i++) {
            totalAmount *= base;
        }

        return totalAmount - amount;

    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return Double.compare(amount, deposit.amount) == 0 && Double.compare(rate, deposit.rate) == 0 && age == deposit.age;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + amount +
                ", rate=" + rate +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, rate, age);

    }
}


