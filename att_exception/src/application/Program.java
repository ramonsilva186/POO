package application;

import entities.Account;
import exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();

        System.out.print("Withdraw Limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, nome, balance, withdrawLimit);

        System.out.println();
        System.out.print("Infome uma quantia para sacar: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.println("Novo Saldo: " + String.format("%.2f", acc.getBalance()));
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
