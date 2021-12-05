package FiguraGeometrica;


public class Esfera extends Tridimensional {

    // three argument constructor
    public Esfera(int x, int y, int radio) {

        super(x, y, radio, radio, radio);

    } // end constructor

    // set the radius
    public void setRadius(int r) {

        defineDimension1(r);
        defineDimension2(r);
        defineDimension3(r);

    } // end method setRadius

    // get the radius
    public int obtenerRadio() {

        return obtenerDimension1();

    } // end method getRadius

    // get the name of the Shape
    public String obtenerNombre() {

        return "Esfera";

    } // end method getShape

    // get the area of the sphere
    public int obtenerArea() {

        return (int) ((4 * Math.PI) * (obtenerRadio() * obtenerRadio()));

    } // end method getArea

    // get the volume of the sphere
    public int obtenerVolumen() {

        return (int) (4.0 / 3.0 * Math.PI * obtenerRadio() * obtenerRadio() * obtenerRadio());

    } // end method getVolume

    // String representation of a Sphere object
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "radio", obtenerRadio());

    } // end method toString

} // end class Sphere
