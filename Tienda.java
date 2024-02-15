package miPrimeraClase;

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


}
