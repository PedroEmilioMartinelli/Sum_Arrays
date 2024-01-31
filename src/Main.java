import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos numros vc vai digitar? ");

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numer");
            vect[i] = sc.nextInt();
        }

        int soma = 0;
        double media = 0.0;
        ;

        for (int i = 0; i < n; i++){
            soma = soma + vect[i];
            media = soma / n;

        }

        System.out.println("Soma " + soma);
        System.out.println("Media " + media);


    }
}