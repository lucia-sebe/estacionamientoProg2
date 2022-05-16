import java.util.ArrayList;

public class Estacionamiento {
    private static ArrayList<Auto> autos = new ArrayList<Auto>();
    private static int espacioMaximo;
    private static int precioEntrada;
    private static int precioNoche;
    
    public static void inicializar(int espacioMaximo, int precioEntrada, int precioNoche) {
        Estacionamiento.espacioMaximo = espacioMaximo;
        Estacionamiento.precioEntrada = precioEntrada;
        Estacionamiento.precioNoche = precioNoche;
    }
    
    
    public static void entra(Auto auto) {
        if (autos.contains(auto)) {
            System.out.println("El auto con matricula " + auto.getMatricula() + " ya esta en el estacionamiento");
        } else {
            if (autos.size() < espacioMaximo) {
                autos.add(auto);
                auto.getPersona().setCuentaCorriente(Estacionamiento.precioEntrada);
                System.out.println("El auto con matricula " + auto.getMatricula() + " ingreso al estacionamiento"); 
            } else {
                System.out.println("El estacionamiento esta lleno, vuelve otro dia :)");
            }
        }
    }
    
    public static void nuevoDia(){
        if (autos.size() > 0){
            for(Auto auto : autos ){ 
                auto.getPersona().setCuentaCorriente(Estacionamiento.precioNoche);;
            }
        }
    }

    public static void sale(Auto auto) {
        if (autos.contains(auto)) {
            System.out.println("El auto con matricula " + auto.getMatricula() + " salio del estacionamiento");
            autos.remove(auto);
        } else {
            System.out.println("No se ha encontrado el auto con matricula " + auto.getMatricula());
        }
        }

    public static void calcular(){
        if (autos.size() > 0){
            for(Auto auto : autos){
                System.out.println( auto.getPersona().getNombre() + " debe $" + auto.getPersona().getCuentaCorriente());
            }
        }else{
            System.out.println("Nadie ingreso al estacionamiento");
        }
    }
}
