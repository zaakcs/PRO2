import java.util.Scanner;

public class Capitulo4 extends Capitulo {
    public Capitulo4(Personagem protagonista, Personagem antagonista) {
        super(protagonista, antagonista);
    }

    @Override
    public void executar() {
        System.out.println("Capítulo 4 - O Artefato Perdido");
        System.out.println("O vilão roubou um artefato poderoso!");
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Perseguir o vilão para recuperar o artefato.");
        System.out.println("2. Procurar uma forma de desativar o artefato.");

        try (Scanner scanner = new Scanner(System.in)) {
            int escolhaJogador = scanner.nextInt();

            if (escolhaJogador == 1) {
                new Escolha("Você decidiu perseguir o vilão para recuperar o artefato.", new Capitulo5(protagonista, antagonista)).executar();
            } else if (escolhaJogador == 2) {
                new Escolha("Você decidiu procurar uma forma de desativar o artefato.", new Capitulo5(protagonista, antagonista)).executar();
            } else {
                System.out.println("Escolha inválida! O jogo será encerrado.");
            }
        }
    }
}
