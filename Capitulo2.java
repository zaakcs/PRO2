import java.util.Scanner;

public class Capitulo2 extends Capitulo {
    public Capitulo2(Personagem protagonista, Personagem antagonista) {
        super(protagonista, antagonista);
    }

    @Override
    public void executar() {
        System.out.println("Capítulo 2 - O Mistério Profundo");
        System.out.println("Você encontrou uma pista que leva a um mistério ainda maior!");
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Continuar a história.");
        System.out.println("2. Encerrar a história. Fim do Livro.");

        try (Scanner scanner = new Scanner(System.in)) {
            int escolhaJogador = scanner.nextInt();

            if (escolhaJogador == 1) {
                new Escolha("Você decidiu continuar a história.", new Capitulo3(protagonista, antagonista)).executar();
            } else if (escolhaJogador == 2) {
                System.out.println("Você decidiu encerrar a história. Fim do Livro.");
            } else {
                System.out.println("Escolha inválida! O jogo será encerrado.");
            }
        }
    }
}
