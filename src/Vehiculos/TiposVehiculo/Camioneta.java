package Vehiculos.TiposVehiculo;
import Vehiculos.*;
public class Camioneta extends Vehiculo{
    public Camioneta(String combustible, int cantidadGalonesCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(combustible, cantidadGalonesCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }
    @Override
    public void Presentarse() {
        System.out.println("Tipo de vehiculo: camioneta, transporta personas");
    }
    @Override
    public void MoverDerecha() {
        System.out.println("Me muevo a la derecha con una velocidad media");
    }

    @Override
    public void GirarIzquierda() {
        System.out.println("Me muevo a la izquierda con una velocidad media");
    }
}
