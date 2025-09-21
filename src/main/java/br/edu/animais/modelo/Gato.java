package br.edu.animais.modelo;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " miou: Miau!");
    }

    @Override
    public String toString() {
        return "Gato [nome=" + getNome() + ", idade=" + getIdade() + ", cor=" + cor + "]";
    }
}
