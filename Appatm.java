package com.genius;

import java.util.Scanner;

public class Appatm {

    static withdraw500_100 with500_1000;

    public  static void main (String [] args ){
 with500_1000 = new withdraw500_100();
 with500_1000.withdraw();
 with500_1000.choose();
 with500_1000.proceedcan();
 with500_1000.rep();
    }

}

class withdraw500_100 implements collect, yesornoo, procan, repeat {
    public void withdraw() {

        Scanner scanner1 = new Scanner(System.in);
        String input = " ";
        while (true) {
            System.out.println("--SELECT-- \n 1.$500 ");
            System.out.print("Enter :".toUpperCase());

            input = scanner1.next().toLowerCase();
            if (input.equals("1"))
                break;
            else System.out.println("Enter a valid to proceed".toUpperCase());
        }

    }

    public void choose() {
        Scanner scanner = new Scanner(System.in);
        String input2 = "";
        while (true) {
            System.out.println("do you want receipt yes / no ?".toUpperCase());
            System.out.print("Enter :".toUpperCase());
            input2 = scanner.next().toLowerCase();
            if (input2.equals("yes")) {
                break;
            }
            if (input2.equals("no"))
                break;
            else System.out.println("enter a valid answer".toUpperCase());
        }
    }

    public void proceedcan() {
        Scanner scan = new Scanner(System.in);
        String pc = " ";
        while (true) {
            System.out.println("do you want to proceed yes / no ?".toUpperCase());
            System.out.print("Enter :".toUpperCase());
            pc = scan.next().toLowerCase();
            if (pc.equals("yes")) {
                System.out.println("Here is your cash, thank you for banking with us".toUpperCase());
                break;
            }

            if (pc.equals("no")) {
                System.out.println("you successfully cancled your withdrawal, thank you for banking with us".toUpperCase());
                break;


            } else System.out.println("Enter a valid option".toUpperCase());
        }

    }

    public void rep() {
        Scanner hee = new Scanner(System.in);
        String hola = " ";
        while (true) {
            System.out.println("would you love to perform another transaction yes / no?".toUpperCase());
            System.out.print("Enter : ".toUpperCase());
            hola = hee.next().toLowerCase();
            if (hola.equals("yes")) {
                withdraw();
                choose();
                proceedcan();
            }
            if (hola.equals("no")) {
                System.out.println("please take your card".toUpperCase());
                break;

            }

            else System.out.println("Enter a valid answer");
        }

    }
}







interface collect{
    void withdraw();
}

interface yesornoo{
    void choose();
}
interface procan{
    void proceedcan();
}
interface repeat{
    void rep();
}