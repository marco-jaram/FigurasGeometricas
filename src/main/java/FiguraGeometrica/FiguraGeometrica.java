package FiguraGeometrica;

public abstract class FiguraGeometrica {

    private int x;		// x coordinate
    private int y;		// y coordinate

    public FiguraGeometrica(int x, int y) {

        this.x = x;
        this.y = y;

    } // end two argument constructor

    // set the x coordinate
    public void defineX(int x) {

        this.x = x;

    } // end method setX

    // set the y coordinate
    public void defineY(int y) {

        this.y = y;

    } // end method setY

    // get the x coordinate
    public int obtenerX() {

        return x;

    } // end method getX

    // get the y coordinate
    public int obtenerY() {

        return y;

    } // end method getY

    // return String representation of Shape object
    public String toString() {

        return String.format("(%d, %d)", obtenerX(), obtenerY());

    } // end method toString

    // abstract methods
    public abstract String obtenerNombre();

} // end class Shape
