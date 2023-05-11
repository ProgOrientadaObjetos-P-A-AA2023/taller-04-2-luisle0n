
package ejecutor;

class Caracteristicas {
    private String cedula;
    private Fabricante fabricante;
    private int anioFricacion;
    private double valor;
    private double valorMatricula;

    public Caracteristicas(String ced, Fabricante fb, int af, double vm) {
        cedula = ced;
        fabricante = fb;
        anioFricacion = af;
        valor = vm;
    }

    public Caracteristicas(Fabricante fb, int af, double vm) {
        cedula = "1750148975";
        fabricante = fb;
        anioFricacion = af;
        valor = vm;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerFabricante(Fabricante f) {
        fabricante = f;
    }

    public void estableceranioFabricacion(int a) {
        anioFricacion = a;
    }

    public void establecerValor(double v) {
        valor = v;
    }

    public void calcularValorMatricula() {
        valorMatricula = 0.00002 * (valor * (2023 - anioFricacion));
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public int obteneranioFabricacion() {
        return anioFricacion;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Cedula: %s\nNombre del Fabricante: %s\nOrigen del Fabricante: %s\n"
                + "Año de Fabricación: %d\nValor del automotor: %.2f\nValor de la matrícula: %.2f",
                obtenerCedula(),
                obtenerFabricante().obtenerNombre(),
                obtenerFabricante().obtenerCiudadOrigen(),
                obteneranioFabricacion(),
                obtenerValor(),
                obtenerValorMatricula());
        return cadena;
    }
}
