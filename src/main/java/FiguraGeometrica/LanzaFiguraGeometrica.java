package FiguraGeometrica;


public class LanzaFiguraGeometrica {

    public static void main(String args[]) {

        FiguraGeometrica figura[] = new FiguraGeometrica[6];
        figura[0] = new Circulo (22, 88, 4);
        figura[1] = new Cuadrado (71, 96, 10);
        figura[2] = new Esfera (8, 89, 2);
        figura[3] = new Cubo (8, 8, 8);
        figura[4] = new Triangulo(10,10,10);
        figura[5] = new Tetraedro(5,5,5);

        for (FiguraGeometrica figuraActual : figura) {

            System.out.printf("%s: %s",
                    figuraActual.obtenerNombre(), figuraActual);

            if (figuraActual instanceof Bidimensional) {

                Bidimensional figuraBidimensional
                        = (Bidimensional) figuraActual;

                System.out.printf("El área de el %s es:  %d\n",
                        figuraActual.obtenerNombre(), figuraBidimensional.obtenerArea());

            } // end if statement

            if (figuraActual instanceof Tridimensional) {

                Tridimensional figuraTridimensional
                        = (Tridimensional) figuraActual;

                System.out.printf("El área de %s es: %d\n",
                        figuraActual.obtenerNombre(), figuraTridimensional.obtenerArea());
                System.out.printf("El Volumen de %s es: %d\n",
                        figuraActual.obtenerNombre(), figuraTridimensional.obtenerVolumen());

            } // end if statement

            System.out.println();

        } // end for loop

    } // end main
}
