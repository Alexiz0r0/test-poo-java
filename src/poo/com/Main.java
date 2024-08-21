package poo.com;

import poo.com.entity.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {








        /*System.out.println("Hello world!");

        Persona persona = new Persona();

        persona.nombre = "Ale";
        persona.edad = 12;

        persona.imprimirDatos();

        Auto auto = new Auto();
        Auto auto1 = new Auto("Audi", "A4", 2020);
        Auto auto2 = new Auto("BMW", "318i");
        Auto auto3 = new Auto("Lambo");

        auto.imprimirDatos();
        System.out.println("+--+--+--+--+--+-");
        auto1.imprimirDatos();
        System.out.println("+--+--+--+--+--+.");
        auto2.imprimirDatos();
        System.out.println(".+--+--+--+--+--+");
        auto3.imprimirDatos();*/

        /*int contador = 0;
        Rectangulo[] rectangulos = new Rectangulo[2];

        do {
            System.out.println("*--Menu--*");

            Rectangulo rectangulo = new Rectangulo();
            System.out.println("Ingrese el ancho");
            rectangulo.ancho = sc.nextDouble();
            System.out.println("Ingrese el alto");
            rectangulo.alto = sc.nextDouble();
            rectangulos[contador] = rectangulo;
            contador++;


        } while (contador == 1);

        System.out.println(Arrays.toString(rectangulos));*/


    }

    public static Scanner sc = new Scanner(System.in);

    public void rectangleOperation() {
        Rectangle rectangle = new Rectangle();
        System.out.println("Ingrese el ancho");
        rectangle.setAncho(sc.nextDouble());
        System.out.println("Ingrese el alto");
        rectangle.setAlto(sc.nextDouble());

        System.out.println(rectangle.perimetro());
        System.out.println(rectangle.area());

        System.out.println(rectangle.toString());
    }

    public void trianguloOperation() {
        Triangulo triangulo = new Triangulo();

        System.out.println("Ingrese la longitud de la altura");
        triangulo.setAltura(sc.nextDouble());
        System.out.println("Ingrese la longitud de la base");
        triangulo.setBase(sc.nextDouble());

        System.out.println("Area: " + triangulo.calcularArea());

        System.out.println(triangulo.toString());
    }

    public void circuloOperation() {
        Circulo circulo = new Circulo();

        System.out.println("Ingrese el radio del circulo");

        circulo.setRadio(sc.nextDouble());

        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());

        System.out.println(circulo.toString());
    }

    public void planoXyOperation() {
        Punto punto = new Punto(8, 2);
        Punto punto1 = new Punto(4, 5);

        System.out.println(punto.calcularDistancia(punto1, punto));
        System.out.println(Punto.estanAlineados(punto1, punto) ? "yes" : "no");
    }

    public void librosOperation() {
        Libro[] libros = new Libro[2];
        Libro libro = new Libro("javascript", "jhony", 20);
        Libro libro1 = new Libro("java", "spark", 30);
        libros[0] = libro1;
        libros[1] = libro;


        for (Libro item : libros) {
            System.out.println(item.imprimirDetalle());
        }
    }

}