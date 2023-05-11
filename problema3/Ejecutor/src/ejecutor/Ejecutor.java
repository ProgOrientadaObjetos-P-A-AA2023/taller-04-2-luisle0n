package ejecutor;

import com.sun.source.tree.CaseTree;

public class Ejecutor {

    public static void main(String[] args) {
        
        Fabricante fabricante = new Fabricante();
        Caracteristicas caracteristcas = new Caracteristicas("1950010312", fabricante, 1993, 300000);
        caracteristcas.calcularValorMatricula();

        System.out.printf("%s\n", caracteristcas);

        System.out.println("------------------------------------");

        Fabricante fabricante2 = new Fabricante("For", "Americana");
        Caracteristicas caracteristicas2 = new Caracteristicas(fabricante2, 2018, 121000);       
        caracteristicas2.calcularValorMatricula();       
        System.out.printf(" %s\n", caracteristicas2);
    }

}
