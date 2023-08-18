package edu.javase.anatomias;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;
        String statusAprovacao = validaMediaFinal(mediaFinal);
        System.out.println(statusAprovacao);
    }

    public static String validaMediaFinal(int media) {
        if (media < 6) {
            return "REPROVADO";
        } else if (media == 6) {
            return "RECUPERAÇÃO";

        } else {
            return "APROVADO";
        }
    }

}
