package Modelo;


import java.util.Date;

/**
 *
 * @author Leonardo Peralta
 */
public class Persona  {

    private String nombre;
    private String apellido;
    private Date fechaIngreso;
    private long tiempoEmpleo;
    private long Bono;
    private Integer id;

    private long sueldo;
    private TipoEmpleado tipoEmpleado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getBono() {
        return Bono;
    }

    public void setBono(long Bono) {
        this.Bono = Bono;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public long getTiempoEmpleo() {
        return tiempoEmpleo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTiempoEmpleo(long tiempoEmpleo) {
        this.tiempoEmpleo = tiempoEmpleo;
    }

    
//    public Date getNow() {
//        return now;
//    }
//
//    public void setNow(Date now) {
//        this.now = now;
//    }

    public long getSueldo() {
        return sueldo;
    }

    public void setSueldo(long sueldo) {
        this.sueldo = sueldo;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    
}
