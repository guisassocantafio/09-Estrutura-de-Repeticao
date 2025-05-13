import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int num, multiplicador, resultado;
        Scanner sc = new Scanner(System.in);
        multiplicador = 0;

        System.out.print("Dgite um número inteiro: ");
        num = sc.nextInt();
        while (multiplicador<=10){
            resultado = num * multiplicador;
            System.out.println(num + " X " + multiplicador + " = " + resultado);
            multiplicador++;
        }
    }
}
