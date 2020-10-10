import java.util.*;

class Account{
    public int balance;
    public int accountNo;
    void displayBalance(){
        System.out.println("Account number: \t"+accountNo+"\nBalance: \t"+balance);
    }
    synchronized void deposite(int amount){
        balance=balance+amount;
        System.out.println(amount+" deposited in bank");
        displayBalance();
    }
    synchronized void withdraw(int amount){
        balance=balance-amount;
        System.out.println(amount+" withdrawn from bank");
        displayBalance();
    }
}

class TransactionDeposite implements Runnable{
    public Account accountX;
    public int amount;
    TransactionDeposite(Account x,int amount){
        accountX=x;
        this.amount=amount;
        new Thread(this).start();
    }
    public void run(){
        accountX.deposite(amount);
    }
}

class TransactionWithdraw implements Runnable{
    public Account accountY;
    public int amount;
    TransactionWithdraw(Account y,int amount){
        accountY=y;
        this.amount=amount;
        new Thread(this).start();
    }
    public void run(){
        accountY.withdraw(amount);
    }
}

class Transaction{
    public static void main(String[] args) {
        Account abc=new Account();

        abc.balance=1000;

        TransactionWithdraw t2;
        TransactionDeposite t1;

        t1=new TransactionDeposite(abc,500);
        t2=new TransactionWithdraw(abc,900);
    }
}