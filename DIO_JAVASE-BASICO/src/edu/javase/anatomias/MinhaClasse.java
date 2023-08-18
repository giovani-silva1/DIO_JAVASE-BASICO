package edu.javase.anatomias;

/**
 * Declarações incorretas de nome de variaveis
 * int numero&um  / Os unicos simbolos permitidos é _ e $
 * int 1numero   / Não pode iniciar uma variavel com numero
 * int numero um / não pode ter espaços em nome de variaveis
 * int long = 1 / não pode usar palavras reservadas em variaveis.
 */
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Ola turma sejam bem-vindos");

        //variaveis que não pode ser alterada CONSTANTES
        final String BR = "Brasil";
        final double PI = 3.14;

        //variaveis que pode mudar

        int ano = 2021;
        // PI = 3.15; não é possivel por ser uma constante (final)

        ano = 2023;

        //variaveis é definida com (typo) + nomeBemDefinido = (atribuição do mesmo tipo) opcional.
        int anoFabricacao = 2023;


        String primeiroNome = "Giovani";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println("O nome completo é : " + nomeCompleto);



    }

    public static String nomeCompleto(String primeiroNome, String sobreNome){
        return primeiroNome.concat(" ").concat(sobreNome);
    }
}
