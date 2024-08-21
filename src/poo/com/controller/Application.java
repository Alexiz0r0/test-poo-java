package poo.com.controller;

import poo.com.entity.Empleado;

public class Application {
    public static void main(String[] args) {

        Empleado[] empleados = {
                new Empleado("Alice", 30, 50000.50, "IT"),
                new Empleado("Bob", 25, 45000.0, "HR"),
                new Empleado("Charlie", 35, 55000.0, "Finance"),
                new Empleado("David", 28, 47000.0, "IT")
        };

        Empleado.mostrarEmpleados(empleados);
        System.out.println(" ...");
        Empleado.filtrarEmpleado(empleados, "Bob");
        System.out.println(" ...");
        Empleado.filtrarEmpleado(empleados, 28);
        System.out.println(" ...");
        Empleado.filtrarEmpleado(empleados, 50000.50);
        System.out.println(" ...");
        Empleado.sortEmpleado(empleados, "nombre");
        System.out.println(" ...");
        Empleado.sortEmpleado(empleados, "edad");
        System.out.println(" ...");
        Empleado.sortEmpleado(empleados, "salario");
        System.out.println(" ...");
        Empleado.sortEmpleado(empleados, "departamento");
        System.out.println(" ...");
        Empleado.buscarPorNombre(empleados, "David");
        System.out.println(" ...");
        Empleado.incrementarSalario(empleados[3], 10);
        Empleado.mostrarEmpleados(empleados);
    }
}
