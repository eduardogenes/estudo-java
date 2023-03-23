import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        switchInteger();
        switchString();
        stringCondicao();
    }

    private static void switchInteger() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        Integer diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("segunda-feira");
                break;

            case 3:
                System.out.println("terça-feira");
                break;

            case 4:
                System.out.println("quarta-feira");
                break;

            case 5:
                System.out.println("quinta-feira");
                break;

            case 6:
                System.out.println("sexta-feira");
                break;

            case 7:
                System.out.println("sabado");
                break;

            default:
                System.out.println("valor inválido. digite apenas de 1 a 7.");
                break;
        }
    }

    private static void switchString() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        String diaDaSemana = scanner.nextLine();

        switch (diaDaSemana) {
            case "domingo":
                System.out.println("1");
                break;

            case "segunda":
                System.out.println("2");
                break;

            case "terca":
                System.out.println("3");
                break;

            case "quarta":
                System.out.println("4");
                break;

            case "quinta":
                System.out.println("5");
                break;

            case "sexta":
                System.out.println("6");
                break;

            case "sabado":
                System.out.println("7");
                break;

            default:
                System.out.println("valor invalido");
                break;
        }

    }

    private static void stringCondicao() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 5: ");
        Integer numero = scanner.nextInt();

        switch (numero) {

            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;

            case 4:
                System.out.println("Errado");

                break;

            case 5:
                System.out.println("Talvez");
                break;

            default:
                System.out.println("Valor invalido, digite um nemero entre 1 e 5! ");

                break;
        }

    }
}
