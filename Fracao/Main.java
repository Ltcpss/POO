package Fracao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Teste ---");

        // 1. Construtor de 2 parâmetros
        System.out.print("Digite o numerador: ");
        int n1 = leitor.nextInt();
        System.out.print("Digite o denominador: ");
        int d1 = leitor.nextInt();
        
        Fracao f1 = new Fracao(n1, d1);
        System.out.println("Fracao 1 criada: " + f1.toString());
        System.out.println("Valor numerico: " + f1.getValorNumerico());

        // 2. Fracao Irredutivel
        Fracao f1Irredutivel = f1.getFracaoIrredutivel();
        
        if (f1 == f1Irredutivel) {
            System.out.println("A fracao ja era irredutivel. Retornou o objeto 'this'.");
        } else {
            System.out.println("A fracao era redutivel. Nova fracao criada: " + f1Irredutivel.toString());
        }

        // 3. Construtor de 3 parâmetros 
        System.out.println("Criando a fracao 3/4 negativa...");
        Fracao f2 = new Fracao(3, 4, false); 
        System.out.println("Fracao 2: " + f2.toString());

        // 4. Igualdade
        System.out.println("Comparando as duas frações criadas...");
        
        if (f1.equals(f2)) {
            System.out.println(f1.toString() + " e " + f2.toString() + " sao matematicamente IGUAIS.");
        } else {
            System.out.println(f1.toString() + " e " + f2.toString() + " sao DIFERENTES.");
        }

        leitor.close();
    }
}