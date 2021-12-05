
package FiguraGeometrica;

public class Tetraedro extends Tridimensional{
    // three argument constructor
    public Tetraedro(int x, int y, int lado) {

        super(x, y, lado, lado, lado);

    } // end three argument constructor

    // set the side
    public void defineLado(int lado) {

        defineDimension1(lado);
        defineDimension2(lado);
        defineDimension3(lado);

    } // end method setSide

    // get the side
    public int obtenerArista() {

        return obtenerDimension1();

    } // end method getSide

    public int obtenerLado() {

        return obtenerDimension2();

    } // end method getSide
    
    public int obtenerLado3() {

        return obtenerDimension3();

    } // end method getSide
    
    // get the area of a cube
    
    public int obtenerArea() {
       
        return (int) (Math.sqrt(3)* Math.pow(obtenerArista(), 2 ));

    } // end method getArea

    // get the volume of the cube
    
    public int obtenerVolumen() {

        return (int) ((Math.pow(obtenerArista(),3) * Math.sqrt(2))/ 12);

    } // end method getVolume

    // get the name of the shape
    public String obtenerNombre() {

        return "Tetraedro";

    } // end method getName

    // String representation of the Cube object
    public String toString() {

        return String.format("%s %s: %d\n",
                super.toString(), "Arista", obtenerArista());

    } // end method toString

   //@Override
    //public double obtenerArea() {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   // @Override
  //  public int obtenerVolumen() {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 //   }

//} // end class Cube

