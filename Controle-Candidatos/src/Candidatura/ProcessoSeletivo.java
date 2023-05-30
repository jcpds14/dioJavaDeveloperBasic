package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Carlos"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " MÁXIMO DE TENTATIVAS REALIZADAS, " + tentativasRealizadas);
    }

    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimindoCandidatos() {
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Carlos"};
        System.out.println("Imprimindo lista de candidatos");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato nº " + (i + 1) + " é: " + candidatos[i]);
        }

        System.out.println("_______________________________");
        System.out.println("For de forma abreviada");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado é: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Carlos", "Mariana", "Rafael", "Lúcia", "Fernanda", "Rodrigo"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato " + candidato + "  não foi selecionado para a vaga");
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}