package Vehiculos;
import Vehiculos.Movimiento.*;
public abstract class Vehiculo implements Derecha, Izquierda{
    private String Tipocombustible;
    private int cantidadGalonesCombustible;
    private int cantidadPasajeros;
    private int velocidadMaxima;
    private double aceleracionBase;

    public Vehiculo(String Tipocombustible, int cantidadGalonesCombustible, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase){
        this.Tipocombustible = Tipocombustible;
        this.cantidadGalonesCombustible = cantidadGalonesCombustible;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;
    }
    ////getters
    public String getTipoCombustible(){
        return Tipocombustible;
    }
    public int getcantidadGalonesCombustible(){
       return cantidadGalonesCombustible;
    }
    public int getcantidadPasajeros(){
        return cantidadPasajeros;
    }
    public int getvelocidadMaxima(){
        return velocidadMaxima;
    }
    public double getaceleracionBase(){
        return aceleracionBase;
    }
    ////setters
    public void setTipoCombustible(String Tipo){
        this.Tipocombustible = Tipo;
    }
    public void setcantidadGalonesCombustrible(int Galones){
        this.cantidadGalonesCombustible = Galones;
    }
    public void setcantidadPasajeros(int Pasajeros){
        this.cantidadPasajeros = Pasajeros;
    }
    public void setVelocidadMaxima(int Max){
        this.velocidadMaxima = Max;
    }
    public void setcaceleracionBase(double aceleracion){
        this.aceleracionBase = aceleracion;
    }
    public void MostrarEspecificaciones(){
        System.out.println("Tipo de Combustible: " +Tipocombustible+ " / Cantidad de Combustible: "+cantidadGalonesCombustible+" / Capacidad de Personas: "+cantidadPasajeros+" / Velocidad Maxima: "+velocidadMaxima+" / Aceleracion Inicial: "+aceleracionBase);
    }
    ///////Metodo para Presentar
     public abstract void Presentarse();
}
