package Controlador.ControlPersona;

import Controlador.DAO.AdaptadorDAO;
import Controlador.tda.lista.ListaEnlazadaServices;
import Modelo.Persona;
import Modelo.TipoEmpleado;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Leonardo 117
 */
public class ControlPersona extends AdaptadorDAO<Persona>{

    public static String NCOMUN = "SIN DEFINIR";
    private SimpleDateFormat formatt = new SimpleDateFormat();
    private Persona persona;
    private ListaEnlazadaServices<Persona> listaEmpleados;
    
    
    

    public ControlPersona(){
        super(Persona.class);
        listado();
    }
    public ListaEnlazadaServices<Persona> getListaEmpleados() {
        if (this.listaEmpleados == null) {
            this.listaEmpleados = new ListaEnlazadaServices<>();
        }
        return listaEmpleados;
    }

    public void setListaEmpleados(ListaEnlazadaServices<Persona> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Persona getEmpleado() {
        if (this.persona == null) {
            this.persona = new Persona();
        }
        return persona;
    }

    public void setEmpleado(Persona persona) {
        this.persona = persona;
    }

    public Boolean guardar() {
        try {
            getEmpleado().setId(listaEmpleados.getSize() + 1);
            guardar(getEmpleado());
        } catch (Exception e) {
            System.out.println("Error en guardar Empleado" + e);
        }
        return false;
    }

    public Boolean modificar(Integer pos) {
        try {
            modificar(getPersona(), pos);
            
        } catch (Exception e) {
            System.out.println("Error en modifcar Empleado" + e);
        }
        return false;
    }
    
    private long sueldoBasico = 425;
    private long bonoSenior = 10;
    private long bonoVeterano = 20;
    private long sueldoSenior = sueldoBasico * bonoSenior / 100;
    private long sueldoVeterano = sueldoBasico * bonoVeterano / 100;

    public void calculoEmpleado(long diasEmpleo, Persona PC) {
    
        System.out.println("::> " + diasEmpleo);

        if (diasEmpleo < 1825) {
            PC.setTipoEmpleado(TipoEmpleado.JUNIOR);
            PC.setBono(0);
            PC.setSueldo(sueldoBasico);
        }
        if (diasEmpleo > 1825 && diasEmpleo < 7475) {
            PC.setTipoEmpleado(TipoEmpleado.SENIOR);
            PC.setBono(bonoSenior);
            PC.setSueldo(sueldoSenior+sueldoBasico);
        }
        if (diasEmpleo > 5475) {
            PC.setTipoEmpleado(TipoEmpleado.VETERANO);
            PC.setBono(bonoVeterano);
            PC.setSueldo(sueldoVeterano+sueldoBasico);
        }
    }

    public ListaEnlazadaServices<Persona> listado(){
        setListaEmpleados(listar());
        return listaEmpleados;
        
    }

    
//    public boolean modificarEmpleado( Persona PR, Integer pos)throws  Exception{
//        getPersonas()[pos] = PR;
//        return true;
//    }
    
    public Persona getPersona(){
        if(persona == null){
            persona = new Persona(); 
        }
        return this.persona;
    }
    
    public void setPersona(Persona persona){
        this.persona = persona;
    }

}
