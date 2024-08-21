package poo.com.entity;

public class Rectangle {

    private Double ancho;
    private Double alto;

    public Double area() {
        return getAlto() * getAncho();
    }

    public Double perimetro() {
        return 2 * (getAncho() + getAlto());
    }

    public Rectangle(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangle() {
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
