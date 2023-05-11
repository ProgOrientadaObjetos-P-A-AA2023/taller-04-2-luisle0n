
package ejecutor;

class Profesor {
     private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia provincia;

    public Profesor(double sBasico, String ced, Provincia pro) {
        nombre = "Norman";
        apellido = "Armijos";
        sueldoBasico = sBasico;
        cedula = ced;
        provincia = pro;
    }

    public Profesor(String n, String a, double sB, String cD, Provincia pV) {
        nombre = n;
        apellido = a;
        sueldoBasico = sB;
        cedula = cD;
        provincia = pV;
    }

//  Métodos establecer
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellidos(String n) {
        apellido = n;
    }

    public void establecerSueldoBasico(double b) {
        sueldoBasico = b;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico * 1.20;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerProvincia(Provincia p) {
        provincia = p;
    }
//  Métodos establecer

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }
       @Override
    public String toString() {
        String cadena = String.format("Nombre: %s\nApellido: %s\nSueldo Básico: %.2f\nSueldo Total: %.2f\nCédula: %s\n"
                + "Nombre de la Provincia: %s\nNúmero de habitante: %d",
                 obtenerNombre(),
                 obtenerApellido(),
                 obtenerSueldoBasico(),
                 obtenerSueldoTotal(),
                 obtenerCedula(),
                 obtenerProvincia().obtenerNombre(),
                 obtenerProvincia().obtenerNumHabitantes());
        return cadena;
    }
}


