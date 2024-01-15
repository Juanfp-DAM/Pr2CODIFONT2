public class Punto {

    private int id;
    private double x;
    private double y;

    public Punto(int id, double x, double y){
        this.id = id;
        this.x= x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "\n Punto id: " + id +
                " (" + x +
                "," + y +
                ") ";
    }
}
