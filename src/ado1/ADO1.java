package ado1;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15 EXERCICIO 1 - VITÓRIA CRISTINA
 */
public class ADO1 {

    static Scanner console = new Scanner(System.in);

    static double verificar() {
        
        double dec = 0;
        /*
        Nesta função
        */
        try {
            System.out.println("Digite um número decimal, por favor: ");
            dec = console.nextDouble();

        } catch (java.util.InputMismatchException e) {
            System.out.println("INSIRA APENAS NÚMEROS");
        
        } 
        if (dec >= 50) {
            System.out.println("SUCESSO USUÁRIO!");
        } else {
            System.out.println("ERRO");
            System.out.println("SAINDO DO PROGRAMA");
        }

        return dec;
    }

    public static void main(String[] args) {
        double num = verificar();
        System.out.println("Verificado : " + num);

    }
}
