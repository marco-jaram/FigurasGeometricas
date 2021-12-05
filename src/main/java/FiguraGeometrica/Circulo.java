package FiguraGeometrica;


public class Circulo extends Bidimensional {

    // constructor
    public Circulo(int x, int y, int radio) {

        super(x, y, radio, radio);

    } // end three argument constructor

    // set the radius
    public void defineRadio(int radio) {

        defineDimension1(radio);
        defineDimension2(radio);

    } // end method setRadius

    // get the radius
    public int obtenerRadio() {

        return obtenerDimension1();

    } // end method getDimension1

    // get the shape's name
    public String obtenerNombre() {

        return "Círculo";

    } // end method getName

    public int obtenerArea() {

        return (int) (Math.PI * (obtenerRadio() * obtenerRadio()));

    } // end method getArea

    // String representation of the Circle object
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "radio", obtenerRadio());

    } // end method toString

} // end class Circle
