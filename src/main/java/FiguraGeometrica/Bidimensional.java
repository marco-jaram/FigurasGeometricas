package FiguraGeometrica;


public abstract class Bidimensional extends FiguraGeometrica {

    private int dimension1;
    private int dimension2;

    public Bidimensional(int x, int y, int dim1, int dim2) {

        super(x, y);
        dimension1 = dim1;
        dimension2 = dim2;

    } // end two argument constructor

    // set dimension 1
    public void defineDimension1(int dim1) {

        dimension1 = dim1;

    } // end method setDimension1

    // set dimension 2
    public void defineDimension2(int dim2) {

        dimension2 = dim2;

    } // end method setDimension2

    // get dimension1
    public int obtenerDimension1() {

        return dimension1;

    } // end method getDimension1

    // get dimension2
    public int obtenerDimension2() {

        return dimension2;

    } // end method getDimension2

    // abstract methods
    public abstract int obtenerArea();
}