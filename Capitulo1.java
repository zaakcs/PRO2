import java.util.Scanner;

public class Capitulo1 extends Capitulo {
    public Capitulo1(Personagem protagonista, Personagem antagonista) {
        super(protagonista, antagonista);
    }

    @Override
    public void executar() {
        System.out.println("Capítulo 1 - O Início da Aventura");
        System.out.println("Você se depara com um vilão ameaçando a cidade!");
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Enfrentar o vilão.");
        System.out.println("2. Fugir do vilão.");

        try (Scanner scanner = new Scanner(System.in)) {
            int escolhaJogador = scanner.nextInt();

            if (escolhaJogador == 1) {
                new Escolha("Você decidiu enfrentar o vilão.", new Capitulo2(protagonista, antagonista)).executar();
            } else if (escolhaJogador == 2) {
                new Escolha("Você decidiu fugir do vilão.", new Capitulo2(protagonista, antagonista)).executar();
            } else {
                System.out.println("Escolha inválida! O jogo será encerrado.");
            }
        }
    }
}
