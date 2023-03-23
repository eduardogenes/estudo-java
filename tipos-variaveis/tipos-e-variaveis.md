# tipos e variaveis

## tipos de dados

- os oito tipos primitivos em java sao:

  > `int`, `byte`, `short`, `long`, `float`, `double`, `boolean` e `char` - esses tipos sao considerador objetos, e portanto representam valores brutos. eles sao armazenados diretamente na pinha de memoria (memory stack )

  prefericia de uso para inteiros: `int` e para frações: `double`

## declaraçao de variavel

- seguingo as convenções, toda variavel é composta por:

  `<tipo> <nomeVariavel> <atribuicaoDeValor>`

  ```java
    int idade;  // se nao foi atribuido valor, por padrao, é igual a `0`
    int anoFabricacao = 2021
    double salarioMinimo = 2.500
  ```

## variaveis x constantes

variavel:

- o valor pode ser modificado ao longo do codigo

constante:

- nao podem ser modificados depois de declarados
- esses valores são representados pela palavra reservada final
- por convencao, sao sempre escritasd em CAIXA ALTA

  ```java
  public class ExemploVariavel {
    public static void main(String[] args) {
      /*
      * esta linha é considerada como declaração de variável iniciamos a existência
      * variavel numero com valor 5 regra: tipo + nome + valor
      */
      int numero = 5;

      /*
      * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
      * não é mais necessário, pois a variável já foi declarada anteriormente
      */
      numero = 10;

      System.out.print(numero);

      /*
      * ao usar a palavra reservada final, você determina que jamais
      * esta variavel poderá obter outro valor;
      * logo a linha 25 vai apresentar um erro de compilação
      * isso é considerado uma CONSTANTE na linguagem Java
      */
      final double VALOR_DE_PI = 3.14;

      VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!
    }
  }

  ```


