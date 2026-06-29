package cores;
import java.util.Scanner;

public class MesDoAno {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12: ");
        int mes = teclado.nextInt();

        switch (mes) {
            case 1:
                System.out.println("1 = JANEIRO");
                break;
            case 2:
                System.out.println("2 = FEVEREIRO");
                break;
            case 3:
                System.out.println("3 = MARÇO");
                break;
            case 4:
                System.out.println("4 = ABRIL");
                break;
            case 5:
                System.out.println("5 = MAIO");
                break;
            case 6:
                System.out.println("6 = JUNHO");
                break;
            case 7:
                System.out.println("7 = JULHO");
                break;
            case 8:
                System.out.println("8 = AGOSTO");
                break;
            case 9:
                System.out.println("9 = SETEMBRO");
                break;
            case 10:
                System.out.println("10 = OUTUBRO");
                break;
            case 11:
                System.out.println("11 = NOVEMBRO");
                break;
            case 12:
                System.out.println("12 = DEZEMBRO");
                break;
            default:
                System.out.println("Esse número não é válido, O programa vai fechar agora.");
        }

        teclado.close();
    }
}
