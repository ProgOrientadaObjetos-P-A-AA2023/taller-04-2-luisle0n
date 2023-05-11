package ejecutor;
public class Universidad {    
    private String universidad;
    private String direccion;
    
    public Universidad() {
        universidad = "UTL";
        direccion = "Paris";
    }
     public Universidad(String n, String d) {

        universidad = n;
        direccion = d;

    }
    public void establecerUniversidad(String n) {
        universidad = n;
    }
    public void establecerDireccion(String n) {
        direccion = n;
    }
    public String obtenerUniversidad() {
        return universidad;
    }
    public String obtenerDireccion() {
        return direccion;
    }
}
