public class Linea {

    private int id;
    private Punto puntoLinea1;
    private Punto puntoLinea2;

    public Linea (int id, Punto puntoLinea1, Punto puntoLinea2){
        this.id = id;
        this.puntoLinea1 = puntoLinea1;
        this.puntoLinea2 = puntoLinea2;
    }

    public String toString() {
        return "Area id: " + id +
                " tiene: " + puntoLinea1 +
                puntoLinea2 +
                ")";
    }

}
