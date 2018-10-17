package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static double totalBalance = 0;
    static ArrayList<Account> accountList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Account currentAccount;
   static double userAmount;
    static double Amount;

    public static void main(String[] args) {


        accountList.add(new Account(333333, "Shristi", 5000, 3636));
        accountList.add(new Account(222222, "Amatya", 500, 3232));
        accountList.add(new Account(111111, "Pradhan", 50000, 3333));


        int trial = 1;
        int userAccountNum;
        int userPin;


        do {
            System.out.println("Enter your Account number");
            userAccountNum = sc.nextInt();
            System.out.println("Enter your pin number");
            userPin = sc.nextInt();
            trial++;
            if (trial == 4) {
                System.out.println("You are logged out");
            }
        } while (!checkAccount(userAccountNum, userPin) && trial < 4);

        if(checkAccount(userAccountNum,userPin)== true){
            business();
        }
    }

    public static boolean checkAccount(int userAccountNum, int userPin) {
        for (Account acc : accountList) {
            if (acc.getAccountNumber() == userAccountNum && acc.getPin() == userPin) {
                currentAccount = acc;
                return true;

            }
        }
        return false;
    }


    public static void business() {

      System.out.println("Would you like to make deposit or withdrawal or check balance");
    String userResponse = sc.next();

       if(userResponse.equalsIgnoreCase("Deposit")) {
        System.out.println("Enter the amount");
        userAmount = sc.nextDouble();
        Amount = currentAccount.getBalance() + userAmount;

    }
        if(userResponse.equalsIgnoreCase("Withdrawal")) {
            System.out.println("Enter the amount");
            userAmount = sc.nextDouble();
            if (userAmount > currentAccount.getBalance()) {
                System.out.println("out of balance");
            } else {
                Amount = currentAccount.getBalance() - userAmount;
            }
        }
        if(userResponse.equalsIgnoreCase("check balance")) {
            System.out.println("username : JDoe");
            System.out.println("account : " + currentAccount.getAccountNumber());
            System.out.println(" Balance : " + currentAccount.getBalance());

        }
        System.out.println("username = " + currentAccount.getUserName());
        System.out.println("account number = " + currentAccount.getAccountNumber());
        System.out.println("beginning balance =====" + currentAccount.getBalance());
        System.out.println("deposit/withdrawal ====" + userAmount );
        System.out.println("ending balance ========" + Amount);


    }
}










