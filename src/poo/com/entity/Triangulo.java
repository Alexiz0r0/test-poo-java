package poo.com.entity;

public class Triangulo {
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double calcularArea() {
        return getBase() * getAltura() / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
