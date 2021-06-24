package Vehiculos.TiposVehiculo;
import Vehiculos.*;
public class DeCarrera extends Vehiculo{
    public DeCarrera(String combustible, int cantidadGalonesCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(combustible, cantidadGalonesCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }
    @Override
    public void Presentarse() {
        System.out.println("Tipo de Vehiculo de Carrera, sirvo para competiciones y alcanzo altas velocidades, por lo general solo me conduce un individuo");
    }
    @Override
    public void MoverDerecha() {
        System.out.println("Giro hacia la Derecha");
    }

    @Override
    public void GirarIzquierda() {
        System.out.println("Giro hacia la Izquierda");
    }
}
