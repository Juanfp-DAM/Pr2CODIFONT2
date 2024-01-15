public class Area {

    private int id;
    private Punto puntoArea1;
    private Punto puntoArea2;
    private Punto puntoArea3;

    public Area (int id, Punto puntoArea1, Punto puntoArea2, Punto puntoArea3){
        this.id = id;
        this.puntoArea1 = puntoArea1;
        this.puntoArea2 = puntoArea2;
        this.puntoArea3 = puntoArea3;

    }


    @Override
    public String toString() {
        return "Area id: " + id +
                " tiene: " + puntoArea1 +
                 puntoArea2 + puntoArea3 +
                '}';
    }
}
