//package AtmMachine;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 5674;

    public void checkpin(){
        System.out.println("Enter Your PIN");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN)
        {
            menu();
        }
        else{
            System.out.println("Enter  a Valid Pin");
        }
    }

    // Menu
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        }
        else if(opt == 3){
            depositeMoney();
        }
        else if(opt ==4){
            return;
        }
        else{
            System.out.println("Enter A Valid Choice");
        }
    }

    // Now Creating Function

    public void checkBalance(){
        System.out.println("Balance :"+Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdrawn Successfully");
        }
        menu();
    }

    public void depositeMoney(){
        System.out.println("Enter The Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
