public abstract class Capitulo {
    protected Personagem protagonista;
    protected Personagem antagonista;

    public Capitulo(Personagem protagonista, Personagem antagonista) {
        this.protagonista = protagonista;
        this.antagonista = antagonista;
    }

    public abstract void executar();
}
