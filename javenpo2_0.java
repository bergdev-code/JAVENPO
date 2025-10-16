import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class javenpo2_0 {

    public static void TEMPO_MENU() throws InterruptedException {
        System.out.println("RETORNANDO AO MENU...");
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {

        // ---TABELA DE CORES---
        String VERMELHO = "\u001B[31m";
        String AMARELO = "\u001B[33m";
        String VERDE = "\u001B[32m";
        String AZUL = "\u001B[34m";
        String RESET = "\u001B[0m";

        Scanner scam = new Scanner(System.in);
        boolean sair = true;
        System.out.println("BEM VINDO AO JOKENPÔ!!!");
        ArrayList<String> valores = new ArrayList<>(Arrays.asList("Pedra", "Papel", "Tesoura"));
        Random aleatorio = new Random();

        do {
            int cpu = aleatorio.nextInt(valores.size());
            String valor_cpu = valores.get(cpu);
            System.out.print("Insira o valor que desejar:\n0 - SAIR\n1 - PEDRA\n2 - PAPEL\n3 - TESOURA\nValor: ");
            int valor = scam.nextInt();

            switch (valor) {

                case 0:

                    boolean confirm = false;
                    do {
                        scam.nextLine();
                        System.out.println(
                                String.format("Deseja mesmo sair?\nDigite '%sS%s' para sair e '%sN%s' para retornar.",
                                        AMARELO, RESET, AMARELO, RESET));
                        String exit = scam.nextLine();
                        if (exit.equalsIgnoreCase("s")) {
                            String texto_saida = String.format("%sSAINDO%s...", VERMELHO, RESET);
                            for (int i = 0; i < texto_saida.length(); i++) {
                                System.out.print(texto_saida.charAt(i));
                                Thread.sleep(50);
                            }
                            sair = false;
                        } else if (exit.equalsIgnoreCase("n")) {
                            break;
                        } else {
                            System.out.println(String.format("Insira um caractere %sválido%s!", AMARELO, RESET));
                            TEMPO_MENU();
                            confirm = true;
                            break;
                        }
                    } while (confirm);

                case 1:
                    System.out.println(String.format("Você escolheu %sPedra%s, e a CPU escolheu %s%s%s.", AZUL, RESET,
                            AMARELO, valor_cpu, RESET));
                    if (cpu == 0) {
                        System.out.println(String.format("%sEMPATE%s! Tente novamente!", AMARELO, RESET));
                        TEMPO_MENU();
                        break;
                    } else if (cpu == 1) {
                        System.out.println(String.format("%sPERDEU%s! Papel ganha de Pedra.", VERMELHO, RESET));
                        TEMPO_MENU();
                        break;
                    } else {
                        System.out.println(String.format("%sGANHOU%s! Pedra ganha de Tesoura.", VERDE, RESET));
                        TEMPO_MENU();
                        break;
                    }

                case 2:
                    System.out.println(String.format("Você escolheu %sPapel%s, e a CPU escolheu %s%s%s.", AZUL, RESET,
                            AMARELO, valor_cpu, RESET));
                    if (cpu == 0) {
                        System.out.println(String.format("%sGANHOU%s! Papel ganha de Pedra.", VERDE, RESET));
                        TEMPO_MENU();
                        break;
                    } else if (cpu == 1) {
                        System.out.println(String.format("%sEMPATE%s! Tente novamente!", AMARELO, RESET));
                        TEMPO_MENU();
                        break;
                    } else {
                        System.out.println(String.format("%sPERDEU%s! Tesoura ganha de Papel.", VERMELHO, RESET));
                        TEMPO_MENU();
                        break;
                    }

                case 3:
                    System.out.println(String.format("Você escolheu %sTesoura%s, e a CPU escolheu %s%s%s.", AZUL, RESET,
                            AMARELO, valor_cpu, RESET));
                    if (cpu == 0) {
                        System.out.println(String.format("%sPERDEU%s! Pedra ganha de Tesoura.", VERMELHO, RESET));
                        TEMPO_MENU();
                        break;
                    } else if (cpu == 1) {
                        System.out.println(String.format("%sGANHOU%s! Tesoura ganha de Papel.", VERDE, RESET));
                        TEMPO_MENU();
                        break;
                    } else {
                        System.out.println(String.format("%sEMPATE%s! Tente novamente!", AMARELO, RESET));
                        TEMPO_MENU();
                        break;
                    }

                default:
                    System.out.println(String.format("Insira um caractere %sválido%s!", AMARELO, RESET));
                    TEMPO_MENU();
                    break;

            }

        } while (sair);
        scam.close();
    }
}
