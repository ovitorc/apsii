package Exercicio01;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        aniversariantes = new ArrayList<Aniversariante>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante aniversariante = new Aniversariante(nome, dia, mes);
        aniversariantes.add(aniversariante);
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomes = new ArrayList<String>();

        for (Aniversariante aniversariante : aniversariantes) {
            if (aniversariante.getDataAniversario().getDia() == dia &&
                aniversariante.getDataAniversario().getMes() == mes) {

                nomes.add(aniversariante.getNome());
            }
        }

        return nomes;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        for (int i = 0; i < aniversariantes.size(); i++) {
            if (aniversariantes.get(i).getNome().equals(nomeAniversariante)) {
                aniversariantes.remove(i);
                i--;
            }
        }
    }
}