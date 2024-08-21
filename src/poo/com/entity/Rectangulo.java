package poo.com.entity;

public class Rectangulo {

    public Double ancho;
    public Double alto;

    public static int contadorRectangulos = 1;

    public Rectangulo() {
        contadorRectangulos++;
    }

    public Rectangulo(Double ancho, Double alto) {
        contadorRectangulos++;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Double area() {
        return alto * ancho;
    }

    public Double perimetro() {
        return 2 * (ancho + alto);
    }

    public void imprimirArea() {
        System.out.println("Area: " + area());
    }

    public void imprimirPerimetro() {
        System.out.println("Perimtro: " + perimetro());
    }

    public static void imprimirConteo() {
        System.out.println("Conteo: " + contadorRectangulos);
    }
}
