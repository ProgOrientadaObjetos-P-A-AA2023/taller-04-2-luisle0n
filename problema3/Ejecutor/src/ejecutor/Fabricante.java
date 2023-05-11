
package ejecutor;

class Fabricante {
     private String nombre;
    private String cuidadOrigen;

    public Fabricante() {
        nombre = "Ferrary";
        cuidadOrigen = "Italia";
    }

    public Fabricante(String n, String co) {
        nombre = n;
        cuidadOrigen = co;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudadOrigen(String o) {
        cuidadOrigen = o;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudadOrigen() {
        return cuidadOrigen;
        
            
        }
}
