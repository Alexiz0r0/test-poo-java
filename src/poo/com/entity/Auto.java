package poo.com.entity;

public class Auto {
    public String marca;
    public String modelo;
    public Integer anio;

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto() {

    }

    public void imprimirDatos() {
        System.out.println("+- Marca: " + (marca == null ? "no definida" : marca));
        System.out.println("+- Modelo: " + (modelo == null ? "no definida" : modelo));
        System.out.println("+- Año: " + (anio == null ? "no definida" : anio));
    }
}
