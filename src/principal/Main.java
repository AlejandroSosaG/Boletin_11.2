package principal;

import java.io.File;

import static principal.Gestion_de_Clientes.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        File fichero = null;
        Cliente cliente = new Cliente("sdkanldjbsaj", "dasfbjklasfd", "aksdhjkdsa", "sdnjbasd", 4);

        try {
            fichero = new File("CLIENTES.TXT");
            altaCliente(fichero, cliente);
            consultarElementoPorApellido(fichero, "JuanesRodriguez");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
