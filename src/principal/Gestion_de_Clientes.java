package principal;

import java.io.*;
import java.util.*;

public class Gestion_de_Clientes {
    public static void altaCliente(File fichero, Cliente cliente) {
        BufferedWriter linea = null;
        FileWriter entrada = null;
        try {
            entrada = new FileWriter(fichero, true);
            linea = new BufferedWriter(entrada);
            linea.write(cliente.toString() + "\n");
        } catch (IOException ex) {
            System.out.println("Error");
        } finally {
            try {
                if (linea != null)
                    linea.close();
                if (entrada != null)
                    entrada.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void consultarElementoPorApellido(File fichero, String apellidos) {
        Scanner sc = null;
        String[] datos;
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                datos = sc.nextLine().split(",");
                if (datos[1].equals(apellidos))
                    System.out.println(Arrays.toString(datos));
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (sc != null)
                sc.close();
        }
    }
    public String buscarElementoPorApellidos (File fichero, String apellidos){

    }
    public static void consultarElementoPorCif(File fichero, String cif){

        BufferedReader linea = null;
        Scanner sc;
        String codigo;
        String [] parte;

        try {

            linea = new BufferedReader(new FileReader(fichero));
            sc = new Scanner(fichero);

            while (sc.hasNextLine()){

                codigo = sc.nextLine();
                parte = codigo.split(",");
                linea.readLine();

                if(cif.equals(parte[2])){
                    System.out.println(codigo);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                linea.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
    public String buscarElementoPorCif (File fichero, String apellidos){

    }
    public void insertarModifacionCliente(File fichero, Cliente cliente){

    }
    public void realizarModificaciones(File clientes, File modificaciones){

    }
    public static void insertarBajaCliente(File fichero, Cliente clientes){

        BufferedWriter linea = null;

        try {
            linea = new BufferedWriter(new FileWriter(fichero, true));
            linea.write(clientes.toString());

        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                linea.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
    public void realizarBajas(File clientes, File bajas){

    }
    public void realizarAltas(File clientes, File altas){

    }
    public static Cliente transformarAObjeto(String registro){


        Cliente clienteNuevo;

        String [] arrayRegistro;

        arrayRegistro = registro.split(",");

        clienteNuevo = new Cliente(arrayRegistro[0], arrayRegistro[1], arrayRegistro[2],
                Integer.parseInt(arrayRegistro[3]), arrayRegistro[4]);
    
        return clienteNuevo;
    }

    public void altaClienteOrdenado(File fichero, Cliente cliente){
        List<Cliente> listaCliente= crearlista();
        Collections.sort(listaCliente);

        System.out.println(listaCliente);
    }
    public void modificarElemento(File fichero, String registroViejo, Cliente registroNuevo){

    }
    public void bajaElemento(File fichero, String registro){

    }
    public static void crearlista(){
        List<Cliente> listaCliente= new ArrayList<>();
        listaCliente.add(new Cliente("David", "Perea", "32541H", "direccion1", 5)) ;
        listaCliente.add( new Cliente("Juan", "Alberto", "25244B", "direccion2", 8));
        listaCliente.add( new Cliente("Javier", "Sequera", "12345U", "direccion3", 4));
        listaCliente.add(transformarAObjeto("Fernando","Juan","1242J","direccion4", 9));
        File fichero;
        File fichero2;
        File fichero3;
        try {
            fichero=new File("Clientes.txt");
            fichero2=new File("Modificaciones.txt");
            fichero3=new File("Bajas.txt");
            Collections.sort(listaCliente);
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
