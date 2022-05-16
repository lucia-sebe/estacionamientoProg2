public class Main {
    public static void main(String[] args) throws Exception {
        //casos de prueba
        Persona juan = new Persona("Juan");
        Persona pedro = new Persona("Pedro");

        Auto autoJuan = new Auto(Auto.FORD, "AABBC-1234", juan);
        Auto autoPedro = new Auto(Auto.CHEVROLET, "ASDBC-1256", pedro);

        Estacionamiento.inicializar(5, 50, 102);

        Estacionamiento.entra(autoJuan);
        Estacionamiento.entra(autoPedro);
        Estacionamiento.sale(autoJuan);
        Estacionamiento.entra(autoJuan);
        Estacionamiento.nuevoDia();
        Estacionamiento.calcular();
    }
}
