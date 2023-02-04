package atividade_1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        
        System.out.println("Digite um número: ");
        Scanner input1 = new Scanner(System.in);
        
        double numero =0;
        double x = input1.nextInt();
        double reverso = x;
        
        for (double i = 1; i<=x;i++) {
            
            if(reverso%2 !=0 || i==1) {
                numero = numero +(reverso*(reverso-1)/i);

            }
            else {
                numero = numero -(reverso*(reverso-1)/i);

            }
        reverso --;
        }
        
        String resultado = String.format("%.4f", numero);
        System.out.println(resultado);
        

    }

}
