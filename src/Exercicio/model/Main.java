package Exercicio.model;

import Aula.model.exeption.DomainExeption;
import Exercicio.model.entities.Account;
import Exercicio.model.entities.AccountBuilder;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.println("Numero: ");
        int number = sc.nextInt();
        System.out.println("Titular: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Saldo inicial: ");
        double balance = sc.nextDouble();
        System.out.println("Limite de saque: ");
        double witdrawLimit = sc.nextDouble();

        Account account = new AccountBuilder().number(number)
                .holder(holder).witdrawLimit(witdrawLimit)
                .balance(balance).build();
        try{
            System.out.println("Valor de saque: ");
            double witdrawValue = sc.nextDouble();

            account.witdraw(witdrawValue);

        }catch (InputMismatchException e){
            System.out.println("Entrada inválida.");
        }catch(DomainExeption e){
            System.err.println(e.getMessage());
        }


        sc.nextLine();



        sc.close();
    }
}
