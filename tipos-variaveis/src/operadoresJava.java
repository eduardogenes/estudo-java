/**
 * operadoresJava
 */
public class operadoresJava {

  public static void main(String[] args) {

    String concatenacao = "?";

    concatenacao = 1 + 1 + 1 + "1"; // r- '31'
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + 1; // r- '1111'
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1"; // r- '1111'
    System.out.println(concatenacao);

    concatenacao = "1" + 1 + 1 + 1; // r- '1111'
    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1); // r- '13'
    System.out.println(concatenacao);

    int numero = 5;

    System.out.println(-numero);

    // incrementando numero em mais 1 numero, imprime 6
    numero++;
    System.out.println(numero - numero);

    // incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero++);// r-6 ops algo de errado não está certo

    System.out.println(numero);// agora sim, numero virou 7

    // ordem de precedencia conta aqui
    System.out.println(++numero);

    String nome1 = "JAVA";
    String nome2 = "JAVA";

    System.out.println(nome1 == nome2); // true
    String nome3 = new String("JAVA");

    System.out.println(nome1 == nome3); // false

    String nome4 = nome3;
    System.out.println(nome3 == nome4); // true

    // equals na parada
    System.out.println(nome1.equals(nome2)); // ??  true
    System.out.println(nome1.equals(nome3)); // ??  true
    System.out.println(nome3.equals(nome4)); // ??  true
  }

}