public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}


// class Vehiculo {
//     private String marca;

//     public Vehiculo(String marca) {
//         this.marca = marca;
//     }
// }

// public class Coche extends Vehiculo {
//     public void mostrarMarca() {
//         System.out.println(marca); // Error: The field Vehiculo.marca is not visible
//     }
// }