public class Tienda {
    private String nombreDependiente;
    private int cantidadProductosVenta;
    private boolean abierto;

    // creacion constructor
    public Tienda(String nombre, int cantidadProductos) {
        nombreDependiente = nombre;
        cantidadProductosVenta = cantidadProductos;
        abierto = true;
    }

    public String getNombre() {
        return nombreDependiente ;
    }
    // metodo que modifica el parametro 2.
    public void actualizarExistencias(int productosVendidos) {
        cantidadProductosVenta = cantidadProductosVenta - productosVendidos;
    }

    // metodo con el parametro boleano.
    public boolean cambiarEstadoApertura() {
        if (abierto == true) {
return         abierto = false ; 
        } else {
        return abierto = true ;
        }
    }
    public int getCantidad() {
        return cantidadProductosVenta; 
    }
    public boolean getAbierto() {
        return abierto;
    }
//metodo que imprime el objeto.
    public void imprimirObjeto() {
            System.out.println("##################");
            System.out.println("# Tienda:");
            System.out.println("# Empleado " + nombreDependiente + "  " + cantidadProductosVenta);
            System.out.println("# " + abierto );
            System.out.println("##################");
}
//metodo que retorna el objeto.
public String getObjeto () {
return "el empleado" + nombreDependiente+ "tiene a la venta " + cantidadProductosVenta  + "y la tienda está " + abierto ;
}


} //fin de la clase.
