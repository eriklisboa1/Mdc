import java.util.Scanner;

public class Main {
    public static void systemCls() {
        for (int i = 0; i < 30; i++) {
            System.out.println(" ");
        }
    }

    public static int mdc(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static String mostrarDivisores(int x) {
        StringBuilder sb = new StringBuilder();
        int num = x;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de MDC\nMAXIMO DIVISOR COMUM\nDigite o 1° numeros");
        int num1 = scanner.nextInt();
        System.out.println("Digite o 2° numero: ");
        int num2 = scanner.nextInt();
        systemCls();
        System.out.println("Seus Divisores são:");
        System.out.println(" ");
        System.out.println("Divisores de " + num1 + ":\n " + mostrarDivisores(num1));
        System.out.println(" ");
        System.out.println("Divisores de " + num2 + ":\n " + mostrarDivisores(num2));
        System.out.println(" ");
        System.out.println("Então assim o MDC entre " + num1 + " e " + num2 + " é " + mdc(num1, num2));
    }
}