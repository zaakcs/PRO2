public class Main {
    public static void main(String[] args) {
        Personagem protagonista = new Personagem("Herói", 100);
        Personagem antagonista = new Personagem("Vilão", 100);

        Capitulo1 capitulo1 = new Capitulo1(protagonista, antagonista);
        capitulo1.executar();
    }
}
