package FiguraGeometrica;

public class Cubo extends Tridimensional {

    // three argument constructor
    public Cubo(int x, int y, int lado) {

        super(x, y, lado, lado, lado);

    } // end three argument constructor

    // set the side
    public void defineLado(int lado) {

        defineDimension1(lado);
        defineDimension2(lado);
        defineDimension3(lado);

    } // end method setSide

    // get the side
    public int obtenerLado() {

        return obtenerDimension1();

    } // end method getSide

    // get the area of a cube
    public int obtenerArea() {

        return 6 * (obtenerLado() * obtenerLado());

    } // end method getArea

    // get the volume of the cube
    public int obtenerVolumen() {

        return obtenerLado() * obtenerLado() * obtenerLado();

    } // end method getVolume

    // get the name of the shape
    public String obtenerNombre() {

        return "Cubo";

    } // end method getName

    // String representation of the Cube object
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "lado", obtenerLado());

    } // end method toString

} // end class Cube
