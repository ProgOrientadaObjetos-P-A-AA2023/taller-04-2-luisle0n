package ejecutor;
import ejecutor.Universidad;
public class Notas {
    private String nombre;
    private double notas1;
    private double notas2;
    private double notas3;
    private double promedio;
    private Universidad universidad;
    
        public Notas( double n1, double n2, double n3, Universidad u) {
        nombre = "Omer Benitez";
        notas1 = n1;
        notas2 = n2;
        notas3 = n3;
        universidad = u;

    }
     public Notas(String NA, double n1, double n2, double n3, Universidad u) {
        nombre = NA;
        notas1 = n1;
        notas2 = n2;
        notas3 = n3;
        universidad = u;

    }

       public void establecerUsuario(Universidad u){
        universidad = u;
    }
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNotas1(double n) {
        notas1 = n;
    }

    public void establecerNotas2(double n) {
        notas2 = n;
    }

    public void establecerNotas3(double n) {
        notas3 = n;
    }

    public void calcularPromedio() {
        promedio = ((notas1 + notas2 + notas3) / 3);
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    public double obtenerNotas1() {
        return notas1;
    }

    public double obtenerNotas2() {
        return notas2;
    }

    public double obtenerNotas3() {
        return notas3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public Universidad obtenerUniversidad() {
        return universidad;

    }

    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Nombre %s\nnotas1 %.2f\nnotas2 %.2f\nnotas3 %.2f\n"
                + "Promedio %.2f\nUniversidad %s\nDireccion %s",
                obtenerNombre(),
                obtenerNotas1(),
                obtenerNotas2(),
                obtenerNotas3(),
                obtenerPromedio(),
                obtenerUniversidad().obtenerUniversidad(),
                obtenerUniversidad().obtenerDireccion());
        return cadena;
    }
}
