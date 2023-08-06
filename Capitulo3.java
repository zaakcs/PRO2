import java.util.Scanner;

public class Capitulo3 extends Capitulo {
    public Capitulo3(Personagem protagonista, Personagem antagonista) {
        super(protagonista, antagonista);
    }

    @Override
    public void executar() {
        System.out.println("Capítulo 3 - O Confronto Decisivo");
        System.out.println("Você está frente a frente com o vilão!");
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Lutar contra o vilão.");
        System.out.println("2. Tentar convencer o vilão a desistir.");

        try (Scanner scanner = new Scanner(System.in)) {
            int escolhaJogador = scanner.nextInt();

            if (escolhaJogador == 1) {
                new Escolha("Você decidiu lutar contra o vilão.", new Capitulo4(protagonista, antagonista)).executar();
            } else if (escolhaJogador == 2) {
                new Escolha("Você decidiu tentar convencer o vilão a desistir.", new Capitulo4(protagonista, antagonista)).executar();
            } else {
                System.out.println("Escolha inválida! O jogo será encerrado.");
            }
        }
    }
}
