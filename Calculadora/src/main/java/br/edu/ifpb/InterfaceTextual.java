package br.edu.ifpb;
import java.util.Scanner;

public class InterfaceTextual {

    Scanner entrada = new Scanner(System.in);

    Calculadora c = new Calculadora();

    double a,b;

    public void LerValores(){
        System.out.println("Primeiro Valor: ");
        a = entrada.nextDouble();

        System.out.println("Segundo Valor: ");
        b = entrada.nextDouble();
    }

    public void PrintarMenu() {
        System.out.println("+--------------------------+");
        System.out.println("|       Calculadora        |");
        System.out.println("|  ======================  |");
        System.out.println("|  1 - Somar               |");
        System.out.println("|  2 - Subtrair            |");
        System.out.println("|  3 - Multiplicar         |");
        System.out.println("|  4 - Dividir             |");
        System.out.println("|  5 - Sobre a Calculadora |");
        System.out.println("|  6 - Sair                |");
        System.out.println("+--------------------------+");
        System.out.println("| Qual Opção:              |");
        System.out.println("+--------------------------+");

        int op = entrada.nextInt();

        if (op == 1) {
            LerValores();
            System.out.println("Resposta: " + c.soma(a, b));
        }

        if (op == 2) {
            LerValores();
            System.out.println("Resposta: " + c.subtrair(a, b));
        }

        if (op == 3) {
            LerValores();
            System.out.println("Resposta: " + c.multiplicar(a, b));
        }

        if (op == 4) {
            LerValores();
            System.out.println("Resposta: " + c.dividir(a, b));
        }

        if (op == 5) {
            System.out.println("+--------------------------+");
            System.out.println("|       Calculadora        |");
            System.out.println("|  ======================  |");
            System.out.println("|       Desenvolvida       |");
            System.out.println("|            By            |");
            System.out.println("|      Ramon Topzera       |");
            System.out.println("+--------------------------+");
        }

        if (op == 6) {
            System.exit(0);
        }
    }
}