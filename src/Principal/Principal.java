package Principal;
import Vehiculos.*;
import Vehiculos.TiposVehiculo.*;
public class Principal{
    public static void main(String[] args) {
        ManejadorVehiculos Vehiculo = new ManejadorVehiculos();
        IngresarDatos I = new IngresarDatos();
        Vehiculo.incicializarVehiculos();
        for(int i=0; i<Vehiculo.getVehiculos().length; i++){
            
            if(Vehiculo.getVehiculos()[i] instanceof Camioneta){
                System.out.println("Camioneta:");
                Vehiculo.getVehiculos()[i].Presentarse();
                Vehiculo.getVehiculos()[i].MoverDerecha();
                Vehiculo.getVehiculos()[i].MostrarEspecificaciones();
                System.out.println("\n");
            }
            else if(Vehiculo.getVehiculos()[i] instanceof DeCarga){
                System.out.println("Vehiculo para Carga:");
                Vehiculo.getVehiculos()[i].Presentarse();
                Vehiculo.getVehiculos()[i].GirarIzquierda();
                Vehiculo.getVehiculos()[i].MostrarEspecificaciones();
                System.out.println("\n");
            }
            else if(Vehiculo.getVehiculos()[i] instanceof DeCarrera){
                System.out.println("Vehiculo para Carrera:");
                Vehiculo.getVehiculos()[i].Presentarse();
                Vehiculo.getVehiculos()[i].GirarIzquierda();
                Vehiculo.getVehiculos()[i].MostrarEspecificaciones();
                System.out.println("\n");
            }
            if(!(i==Vehiculo.getVehiculos().length-1)){
            I.Enter("Ver el siguiente vehiculo");
            }else{
            I.Enter("terminar el programa");
            }
        }
    }
}