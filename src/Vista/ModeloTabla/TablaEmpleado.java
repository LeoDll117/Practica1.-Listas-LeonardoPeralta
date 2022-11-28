
package Vista.ModeloTabla;

import Controlador.tda.lista.ListaEnlazadaServices;
import Modelo.Persona;
import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Leonardo 117
 */
public class TablaEmpleado  extends AbstractTableModel{
    
    private ListaEnlazadaServices<Persona> lista;
    SimpleDateFormat f = new SimpleDateFormat ("dd/MM/yyyy");
    //private Persona person[];
    
    public ListaEnlazadaServices <Persona> getlista(){
        return lista;
    }
    
    public void setLista(ListaEnlazadaServices<Persona> lista){
        this.lista= lista;
    }
    @Override
    public int getRowCount(){
        return lista.getSize();
    }
    @Override
    public int getColumnCount(){
        return 8;
    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nro";
            case 1:
                return "Nombre";
            case 2:
                return "Apellido";
            case 3:
                return "Designacion";
            case 4:
                return "Bono";
            case 5:
                return "sueldo";
            case 6:
                return "Tiempo";
            case 7:
                return "Fecha de Ingreso";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        Persona E = lista.obtenerDato(arg0);
        switch (arg1){
            case 0:
                return (arg0 +1);
            case 1:
                return (E != null) ? E.getNombre(): "Sin Definir";
            case 2: 
                return (E != null) ? E.getApellido(): "Sin Definir";
            case 3:
                return (E != null) ? E.getTipoEmpleado() : "Sin definir";
            case 4: 
                return (E != null) ? E.getBono()+"%" : "0";
            case 5:
                return (E != null) ? E.getSueldo()+"$$" : "00.00";
            case 6:
                return (E != null) ? E.getTiempoEmpleo()+" dias": "Sin Definir";
            case 7:
                return (E != null) ? f.format(E.getFechaIngreso()): "Sin Definir";
            default:
                return null;
        }
    }
}
