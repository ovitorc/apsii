import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {

    private List<FiguraGeometrica> figuras;

    public GerenteDeFiguras() {
        figuras = new ArrayList<FiguraGeometrica>();
    }

    	public void adicionaFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    public void imprimeFiguras() {

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getNomeFigura());
        }

    }

    public double getMaiorAreaDeFigura() {

        double maiorArea = 0;

        for (FiguraGeometrica figura : figuras) {

            double areaAtual = figura.calculaArea();

            if (areaAtual > maiorArea) {
                maiorArea = areaAtual;
            }
        }

        return maiorArea;
    }
    
    public double getAreaTotal() {

        double areaTotal = 0;

        for (FiguraGeometrica figura : figuras) {
            areaTotal += figura.calculaArea();
        }

        return areaTotal;
    }

}