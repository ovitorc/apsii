package Exercicio01;

public class Aniversariante {
    private String nome;
    private DataAniversario dataAniversario;

    public Aniversariante(String nome, int dia, int mes) {
        this.nome = nome;
        this.dataAniversario = new DataAniversario(dia, mes);
    }

    public Aniversariante(String nome, DataAniversario dataAniversario) {
        this.nome = nome;
        this.dataAniversario = dataAniversario;
    }

    // gets e sets...

    @Override
    public boolean equals(Object obj) {
        Aniversariante outro = (Aniversariante) obj;

        return nome.equals(outro.nome) &&
               dataAniversario.equals(outro.dataAniversario);
    }
}