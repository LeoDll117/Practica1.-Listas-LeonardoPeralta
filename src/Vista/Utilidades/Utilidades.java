
package Vista.Utilidades;

import Controlador.ControlPersona.ControlPersona;
import Modelo.Persona;
import Modelo.TipoEmpleado;
import javax.swing.JComboBox;

/**
 *
 * @author Leonardo 117
 */
public class Utilidades <T> {
    
    public static JComboBox cargarComboTipo(JComboBox cbx) {
        cbx.removeAllItems();
        for (TipoEmpleado tipo : TipoEmpleado.values()) {
            cbx.addItem(tipo);
        }
        return cbx;
    }
    public static TipoEmpleado getTipoCombo(JComboBox cbx) {
        return (TipoEmpleado) cbx.getSelectedItem();
    }
    
    public static Persona getPersonaCombo(JComboBox cbx){
        return(Persona) cbx.getSelectedItem();
    }
}
