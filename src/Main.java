public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carolina", 1000);
        Desarrollador djunior = new Desarrollador("Sebastian", 101.99, 5.3);
        Gerente gerente = new Gerente("Carlos", 5000, 30.50);

        System.out.println("Salario de " + empleado.getNombre() + ": " + empleado.calcularSalario());
        System.out.println("Salario de " + djunior.getNombre() + ": " + djunior.calcularSalario());
        System.out.println("Salario de " + gerente.getNombre() + ": " + gerente.calcularSalario());
    }
}