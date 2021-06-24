package Vehiculos;
import Vehiculos.TiposVehiculo.*;
public class ManejadorVehiculos {
    private Vehiculo [] Vehiculo;
    public ManejadorVehiculos(){
        Vehiculo = new Vehiculo[20];
    }
    public Vehiculo[] getVehiculos() {
        return Vehiculo;
    }
    public void incicializarVehiculos(){
        for(int i=0; i<Vehiculo.length; i++){
            if(i>=0 && i<6){
                Vehiculo[i] = new Camioneta("Disel", 100, 10, 150, 3.4);
            }
            else if(i>=6 && i<=12){
                Vehiculo[i] = new DeCarrera("Gasolina",150, 20, 260, 5.5);
            }
            else if(i>12 && i<=19){
                Vehiculo[i] = new DeCarga("Disel",100, 50, 100, 1.5);
            } 
        }
    }
}
