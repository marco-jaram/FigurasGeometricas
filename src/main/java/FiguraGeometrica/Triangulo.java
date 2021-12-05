
package FiguraGeometrica;

public class Triangulo extends Bidimensional{
    
    // constructor
    public Triangulo(int x, int y, int side) {

        super(x, y, side, side);

    } // end three argument constructor

    // set the side
    public void defineLado(int s) {

        defineDimension1(s);
        defineDimension2(s);

    } // end method setSide

    // get the side
    public int obtenerBase() {

        return obtenerDimension1();

    } // end method getSide

    // get the side
    public int obtenerAltura() {

        return obtenerDimension2();

    } // end method getSide

    
    // get the name of the shape
    public String obtenerNombre() {

        return "Triángulo";

    } // end method getName

    // get the area of the triangulo
    public int obtenerArea() {

        return (obtenerBase() * obtenerAltura())/2;

    } // end method getArea

    // String representation of the Square object
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "Base", obtenerBase(), "Altura", obtenerAltura());
        
        

    } // end method toString

} // end class Square

    

