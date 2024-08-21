package poo.com.entity;

public class Empleado {
    private String nombre;
    private Integer edad;
    private Double salario;
    private String departamento;

    public Empleado(String nombre, Integer edad, Double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public static void mostrarEmpleados(Empleado[] empleados) {
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(" " + (i + 1) + "  " + printInfo(empleados[i]));
        }
    }

    public static void filtrarEmpleado(Empleado[] empleados, String name) {
        int count = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getNombre().equalsIgnoreCase(name) || empleados[i].getDepartamento().equalsIgnoreCase(name)) {
                count++;
                System.out.println(" " + count + "  " + printInfo(empleados[i]));
            }
        }
        System.out.println(count > 0 ? "" : "No hay data");
    }

    public static void filtrarEmpleado(Empleado[] empleados, int num) {
        int count = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getEdad() == num) {
                count++;
                System.out.println(" " + count + "  " + printInfo(empleados[i]));
            }
        }
        System.out.println(count > 0 ? "" : "No hay data");
    }

    public static void filtrarEmpleado(Empleado[] empleados, double decimal) {
        int count = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario() == decimal) {
                count++;
                System.out.println(" " + count + "  " + printInfo(empleados[i]));
            }
        }
        System.out.println(count > 0 ? "" : "No hay data");
    }

    public static void sortEmpleado(Empleado[] empleados, String atributo) {
        boolean flag = atributo.equalsIgnoreCase("nombre") || atributo.equalsIgnoreCase("edad") || atributo.equalsIgnoreCase("salario") || atributo.equalsIgnoreCase("departamento");
        if (!flag) {
            System.out.println("Opt. no valida");
        } else {
            mostrarEmpleados(algoritmoBurbuja(empleados, atributo));
        }
    }

    private static boolean debeIntercambiar(Empleado e1, Empleado e2, String atributo) {
        if (atributo.equalsIgnoreCase("nombre")) {
            return e1.getNombre().compareTo(e2.getNombre()) > 0;
        } else if (atributo.equalsIgnoreCase("edad")) {
            return e1.getEdad().compareTo(e2.getEdad()) > 0;
        } else if (atributo.equalsIgnoreCase("salario")) {
            return e1.getSalario().compareTo(e2.getSalario()) > 0;
        } else {
            return e1.getDepartamento().compareTo(e2.getDepartamento()) > 0;
        }
    }

    private static Empleado[] algoritmoBurbuja(Empleado[] empleados, String atributo) {
        for (int i = 0; i < empleados.length - 1; i++) {
            for (int j = 0; j < empleados.length - i - 1; j++) {
                if (debeIntercambiar(empleados[j], empleados[j + 1], atributo)) {
                    Empleado temp = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = temp;
                }
            }
        }
        return empleados;
    }

    public static void buscarPorNombre(Empleado[] empleados, String nombre) {
        int count = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getNombre().equalsIgnoreCase(nombre)) {
                count++;
                System.out.println(" " + count + "  " + printInfo(empleados[i]));
                break;
            }
        }
        System.out.println(count > 0 ? "" : "No hay data");
    }

    public static void incrementarSalario(Empleado empleado, double porcentaje) {
        empleado.setSalario(empleado.getSalario() * ((porcentaje + 100) / 100));
    }


    private static String printInfo(Empleado empleado) {
        return ("  " + empleado.getNombre() + "  " + empleado.getEdad() + "  " + empleado.getDepartamento() + "  " + empleado.getSalario());
    }
}
