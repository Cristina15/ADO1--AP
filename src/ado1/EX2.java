package ado1;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15 EXERCICIO 2 - VITÓRIA CRISTINA
 */
public class EX2 {

    static Scanner console = new Scanner(System.in);
    // Aqui estou verificando se o número é par ou ímpar
    static int parImpar(int n){
        
        if(n % 2==0){
            System.out.println("Esse número é par");
            
        } else { 
            System.out.println("Esse número é impar");
            
        }
        return n;
    }

    // estou pedindo ao usuário digitar o número de sua preferência
    static int pedirNumero() {
        int num = 0;
        try {
            System.out.println("BEM VINDO USUÁRIO");
            System.out.println("Usuário digite um número inteiro");
             num = console.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("DIGITE UM NÚMERO INTEIRO PLEASE");
        }

        return  num;
    }

    public static void main(String[] args) {
        int n = pedirNumero();
        n = parImpar(n);
        System.out.println("BYE BYE");
        
    }
}
