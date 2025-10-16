import java.util.Scanner;
import java.util.Random;

public class javenpo {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        boolean perdeu = true;
        do {
            System.out.println("---SEJA VEM VINDO AO JAVENPÔ---");
            System.out.print(
                    "Insira a sua jogada e tente a sorte!\n1 - PEDRA\n2 - PAPEL\n3 - TESOURA\n4 - SAIR\nVALOR: ");
            int valor = scam.nextInt();
            Random cpu = new Random();
            int maquina = cpu.nextInt(3);

            if (valor == 1 && maquina == 0) {
                System.out.println("EMPATE.\nA CPU TAMBÉM ESCOLHEU PEDRA.");
            } else if (valor == 1 && maquina == 1) {
                System.out.println("VOCÊ PERDEU.\nA CPU ESCOLHEU PAPEL.");
            } else if (valor == 1 && maquina == 2) {
                System.out.println("VOCÊ GANHOU.\nA CPU ESCOLHEU TESOURA.");
            } else if (valor == 2 && maquina == 0) {
                System.out.println("VOCÊ GANHOU.\nA CPU ESCOLHEU PEDRA.");
            } else if (valor == 2 && maquina == 1) {
                System.out.println("EMPATE.\nA CPU TAMBÉM ESCOLHEU PAPEL.");
            } else if (valor == 2 && maquina == 2) {
                System.out.println("VOCÊ PERDEU.\nA CPU ESCOLHEU TESOURA.");
            } else if (valor == 3 && maquina == 0) {
                System.out.println("VOCÊ PERDEU.\nA CPU ESCOLHEU PEDRA.");
            } else if (valor == 3 && maquina == 1) {
                System.out.println("VOCÊ GANHOU.\nA CPU ESCOLHEU PAPEL.");
            } else if (valor == 3 && maquina == 2) {
                System.out.println("EMPATE.\nA CPU TAMBÉM ESCOLHEU TESOURA.");
            } else if (valor == 4) {
                System.out.println("SAINDO...");
                perdeu = false;
            } else {
                System.out.println("INSIRA UM VALOR VÁLIDO.");
            }
        } while (perdeu);
        scam.close();
    }
}
