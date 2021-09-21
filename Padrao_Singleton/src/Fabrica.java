import java.util.Scanner;

public class Fabrica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Highlander h1, h2, h3;

        h2 = Highlander.obterInstancia();
        h3 = Highlander.obterInstancia();

        if (h2 == h3) {
            System.out.println("h2 e h3 são mesmo objeto!");
        }

        System.out.print("Informe um número inteiro qualquer: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            h1 = Highlander.obterInstancia();
        }

        System.out.println("Objetos que deveriam ter sido instanciados: " + Highlander.getContChamadas());

        sc.close();
    }
}
