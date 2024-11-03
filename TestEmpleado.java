public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Luis", 3000.0);
        Gerente gerente = new Gerente("María", 5000.0, "Ventas");

        empleado.mostrarDetalles();
        gerente.mostrarDetalles();
    }
}
