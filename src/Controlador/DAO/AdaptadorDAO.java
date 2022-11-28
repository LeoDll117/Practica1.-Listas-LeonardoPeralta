
package Controlador.DAO;


import Controlador.tda.lista.ListaEnlazada;
import Controlador.tda.lista.ListaEnlazadaServices;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

/**
 *
 * @author Leonardo 117
 */
public class AdaptadorDAO <T> {
    
    private XStream xstream; 
    
    private Class<T> clazz;
    private String URL= "DatosJson"+File.separatorChar;
    
    public static String DIRCARPDATA = "DatonJson";
    
    public AdaptadorDAO(Class <T> clazz){
        this.clazz=clazz;
        URL+=this.clazz.getSimpleName() +".json";
        xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.alias("ListaEmpleados", ListaEnlazada.class);
        xstream.setMode((XStream.NO_REFERENCES));
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.addPermission(NullPermission.NULL);   
        xstream.addPermission(PrimitiveTypePermission.PRIMITIVES);
    }

    public void guardar(T dato) throws Exception {
        ListaEnlazadaServices<T> lista = listar();
     
        if(lista.getSize() !=0){
            lista.insertar(dato, lista.getSize()-1);
        } else {
            lista.insertar(dato, 0);
        }
        xstream.toXML(lista.getLista(), new FileOutputStream(URL));
        
    }

    public void modificar(T dato, Integer pos) throws Exception {
        ListaEnlazadaServices <T> lista = listar();
        lista.getLista().modificarDato(pos, dato);
        xstream.toXML(lista.getLista(), new FileOutputStream(URL));
        
    }

    public ListaEnlazadaServices<T> listar() {
        ListaEnlazadaServices <T> listaAux = new ListaEnlazadaServices<T>();
        try{
            
        }catch(Exception e){
            System.out.println("ERROR"+e);
            e.printStackTrace();
        }
        return listaAux;
    }
}
