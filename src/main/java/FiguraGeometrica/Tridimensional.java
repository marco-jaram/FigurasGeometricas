package FiguraGeometrica;


public abstract class Tridimensional extends FiguraGeometrica {

    private int dimension1;
    private int dimension2;
    private int dimension3;
    

    public Tridimensional(int x, int y,
            int dim1, int dim2, int dim3) {

        super(x, y);
        dimension1 = dim1;
        dimension2 = dim2;
        dimension3 = dim3;
        

    } // end constructor

    // set dimension 1
    public void defineDimension1(int dim1) {

        dimension1 = dim1;

    } // end method setDimension1

    // set dimension 2
    public void defineDimension2(int dim2) {

        dimension2 = dim2;

    } // end method setDimension2

    // set dimension 3
    public void defineDimension3(int dim3) {

        dimension3 = dim3;

    } // end method setDimension3
    
    

    // get dimension1
    public int obtenerDimension1() {

        return dimension1;

    } // end method getDimension1

    // get dimension 2
    public int obtenerDimension2() {

        return dimension2;

    } // end method getDimension 2

    // get dimension 3
    public int obtenerDimension3() {

        return dimension3;

    } // end method getDimension3
    
    
    // abstract methods
    public abstract int obtenerArea();

    public abstract int obtenerVolumen();
    

} // end class ThreeDimensionalShape
