package poo.com.entity;

public class Punto {

    private Integer x;
    private Integer y;

    public Punto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Double calcularDistancia(Punto a, Punto b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }

    public static Boolean estanAlineados(Punto a, Punto b) {
        return ((a.getX() - b.getX()) == 0) || ((a.getY() - b.getY()) == 0);
    }
}


