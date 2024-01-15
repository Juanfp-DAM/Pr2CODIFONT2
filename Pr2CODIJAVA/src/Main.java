public class Main {

    public static void main(String[] args) {
        Punto creaPunto1 = new Punto (1, 1, 4);
        Punto creaPunto2 = new Punto (2, 2, 1);
        Punto creaPunto3 = new Punto (3, 5,3);

        //Crea Linea
        Linea creaLinea1 = new Linea(1, creaPunto1, creaPunto2);
        System.out.println(creaLinea1);

        // Crea Area
        Area creaArea1 = new Area (1, creaPunto1, creaPunto2, creaPunto3);
        System.out.println(creaArea1);
    }
}
