import java.util.Scanner;

public class Capitulo5 extends Capitulo {
    public Capitulo5(Personagem protagonista, Personagem antagonista) {
        super(protagonista, antagonista);
    }

    @Override
    public void executar() {
        System.out.println("Capítulo 5 - A Grande Conclusão");
        System.out.println("Você chegou ao confronto final com o vilão.");
        System.out.println("O que você deseja fazer?");
        System.out.println("1. Lutar bravamente para derrotar o vilão.");
        System.out.println("2. Tentar negociar uma trégua com o vilão.");

        try (Scanner scanner = new Scanner(System.in)) {
            int escolhaJogador = scanner.nextInt();

            if (escolhaJogador == 1) {
                new Escolha("Você decidiu lutar bravamente para derrotar o vilão.", null).executar();
                protagonista.energia -= 10;
                antagonista.energia -= 10;
            } else if (escolhaJogador == 2) {
                new Escolha("Você decidiu tentar negociar uma trégua com o vilão. Final Feliz para todos.", null).executar();
                protagonista.energia += 5;
                antagonista.energia += 5;
            } else {
                System.out.println("Escolha inválida! O jogo será encerrado.");
            }
        }
    }
}
