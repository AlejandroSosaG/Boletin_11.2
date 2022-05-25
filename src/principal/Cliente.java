package principal;

public class Cliente {
    String nombre, apellidos, direccion, CIF;
    int categoria;

    public Cliente(String nombre, String apellidos, String direccion, String CIF, int categoria) {
        this.nombre = tamaño50(nombre);
        this.apellidos = tamaño50(apellidos);
        this.direccion = tamaño50(direccion);
        this.CIF= tamaño10(CIF);
        this.categoria = categoria;
    }
    public Cliente(){

    }
    public String tamaño50(String cadena){
        if(cadena.length()>50) {
            cadena = cadena.substring(0, 50);
        }
        return cadena;
    }
    public String tamaño10(String cadena){
        if(cadena.length()>10) {
            cadena = cadena.substring(0, 10);
        }
        return cadena;
    }
    public int compareTo(Cliente cliente) {

        int estado = -1;

        if(this.CIF == cliente.CIF){
            estado=0;
        }else if(Integer.parseInt(this.CIF.substring(0,4)) > Integer.parseInt(cliente.CIF.substring(0,4)) ){
            estado=1;
        }

        return estado;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", CIF='" + CIF + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
