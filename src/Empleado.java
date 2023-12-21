class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bono;
    }
}

class Desarrollador extends Empleado {
    private double horasExtras;

    public Desarrollador(String nombre, double salarioBase, double horasExtras) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + horasExtras;
    }
}




