package Vehiculos.TiposVehiculo;
import Vehiculos.*;
public class DeCarga extends Vehiculo {
    public DeCarga(String combustible, int cantidadGalonesCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(combustible, cantidadGalonesCombustible, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }
    @Override
    public void Presentarse() {
        System.out.println("Tipo de Vehiculo de Carga, sirve para transportar producto");
    }
    @Override
    public void MoverDerecha() {
        System.out.println("Me muevo a la derecha con una velocidad lenta");
    }

    @Override
    public void GirarIzquierda() {
        System.out.println("Me muevo a la izquierda con una velocidad lenta");
    }
}
