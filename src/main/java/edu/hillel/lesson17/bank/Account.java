package edu.hillel.lesson17.bank;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private ReentrantLock lock = new ReentrantLock();
    private AtomicInteger failedTransactionCount = new AtomicInteger(0);

    private int balance;
    private int id;

    public Account(int balance, int id) {
        this.balance = balance;
        this.id = id;
    }

    public void withdraw(int amount) {
        System.out.println("withdraw");
        balance -= amount;
    }

    public void deposit(int amount) {
        System.out.println("deposit");
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                '}';
    }

    public ReentrantLock getLock() {
        return lock;
    }

    public AtomicInteger getFailedTransactionCount() {
        return failedTransactionCount;
    }
}
