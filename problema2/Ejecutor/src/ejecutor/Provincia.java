
package ejecutor;

class Provincia {
     private String nombre;
    private int numeroHabitantes;

    public Provincia() {
        nombre = "Zamora";
        numeroHabitantes = 8376123;
    }

    public Provincia(String n, int num) {
        nombre = n;
        numeroHabitantes = num;
    }

//  métodos establecer
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerNumHabitantes(int n) {
         numeroHabitantes = n;
    }

//  métodos obtener
    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumHabitantes() {
        return numeroHabitantes;
    }
}
