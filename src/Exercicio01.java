/*
programa que leia dois valores inteiros ( o segundo valor deve ser maior que o primeiro)
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Digite um valor inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite um valor maior que o primeiro: ");
        num2 = sc.nextInt();

        while (num1>num2){
            System.out.println("Digite um valor maior que " + num1);
            num2 = sc.nextInt();
        }
        while (num1<=num2){
            System.out.print(num1 + " ");
            num1++;
        }
    }
}