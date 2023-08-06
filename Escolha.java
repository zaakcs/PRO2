public class Escolha {
    String texto;
    Capitulo proximo;

    public Escolha(String texto, Capitulo proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }

    public void executar() {
        System.out.println(texto);
        if (proximo != null) {
            proximo.executar();
        }
    }
}
