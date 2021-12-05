package FiguraGeometrica;


public class Cuadrado extends Bidimensional {

    // constructor
    public Cuadrado(int x, int y, int lado) {

        super(x, y, lado, lado);

    } // end three argument constructor

    // set the side
    public void defineLado(int s) {

        defineDimension1(s);
        defineDimension2(s);

    } // end method setSide

    // get the side
    public int obtenerLado() {

        return obtenerDimension1();

    } // end method getSide

    // get the name of the shape
    public String obtenerNombre() {

        return "Cuadrado";

    } // end method getName

    // get the area of the square
    public int obtenerArea() {

        return obtenerLado() * obtenerLado();

    } // end method getArea

    // String representation of the Square object
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "lado", obtenerLado());

    } // end method toString

} // end class Square
