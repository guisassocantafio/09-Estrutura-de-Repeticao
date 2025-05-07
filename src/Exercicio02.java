/*
programa que leia 10 numeros inteiros e impria no terminal o maior
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int valor, maior, contador;
        contador = 1;
        maior = 0;
        Scanner sc = new Scanner(System.in);

        while (contador<=10){
            System.out.print("Digite um valor --> ");
            valor = sc.nextInt();
            if(valor > maior){
                maior = valor;
            }
            contador++;
        }
        System.out.println("O maior valor é --> "+maior);
    }
}
