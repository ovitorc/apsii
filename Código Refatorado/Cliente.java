
import java.util.*;

public class Cliente {
    private String nome;
    private List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    private double calcularValorAluguel(Aluguel aluguel) {
        switch (aluguel.getFita().getCodigoDePreco()) {
            case Fita.NORMAL:
                return calcularPrecoNormal(aluguel);

            case Fita.LANCAMENTO:
                return calcularPrecoLancamento(aluguel);

            case Fita.INFANTIL:
                return calcularPrecoInfantil(aluguel);

            default:
                throw new IllegalArgumentException("Tipo de fita inválido");
        }
    }

    private double calcularPrecoNormal(Aluguel aluguel) {
        double valor = 2;

        if (aluguel.getDiasAlugada() > 2) {
            valor += (aluguel.getDiasAlugada() - 2) * 1.5;
        }

        return valor;
    }

    private double calcularPrecoLancamento(Aluguel aluguel) {
        return aluguel.getDiasAlugada() * 3;
    }

    private double calcularPrecoInfantil(Aluguel aluguel) {
        double valor = 1.5;

        if (aluguel.getDiasAlugada() > 3) {
            valor += (aluguel.getDiasAlugada() - 3) * 1.5;
        }

        return valor;
    }

    private int calcularPontosAluguel(Aluguel aluguel) {
        int pontos = 1;

        if (aluguel.getFita().getCodigoDePreco() == Fita.LANCAMENTO
                && aluguel.getDiasAlugada() > 1) {
            pontos++;
        }

        return pontos;
    }

    public String extrato() {
        double valorTotal = 0;
        int pontosDeAlugadorFrequente = 0;

        String resultado =
            "Registro de Alugueis de " + getNome() + "\n";

        for (Aluguel aluguel : alugueis) {
            double valorCorrente = calcularValorAluguel(aluguel);

            pontosDeAlugadorFrequente += calcularPontosAluguel(aluguel);

            resultado += "\t" + aluguel.getFita().getTitulo()
                    + "\t" + valorCorrente + "\n";

            valorTotal += valorCorrente;
        }

        resultado += "Valor total devido: " + valorTotal + "\n";
        resultado += "Você ganhou " + pontosDeAlugadorFrequente
                + " pontos de alugador frequente";

        return resultado;
    }
}
