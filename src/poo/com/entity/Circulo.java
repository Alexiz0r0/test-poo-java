package poo.com.entity;

public class Circulo {
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    public Double calcularArea() {
        return Math.PI * getRadio() * getRadio();
    }

    public Double calcularPerimetro() {
        return Math.PI * getRadio() * 2;
    }
}
