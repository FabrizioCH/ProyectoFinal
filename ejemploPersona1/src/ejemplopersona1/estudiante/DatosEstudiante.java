package ejemplopersona1.estudiante;

import Carros.DatosDocente;

public class DatosEstudiante extends DatosDocente{
    
    private String apPaterno;
    private String apMaterno;
    private String direccion;
    private String estadoCivil;
    private String codigo;
    private String nacionalidad;
    private String LugardeNacimiento;
    private String FechaNacimiento;

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugardeNacimiento() {
        return LugardeNacimiento;
    }

    public void setLugardeNacimiento(String lugardeNacimiento) {
        this.LugardeNacimiento = lugardeNacimiento;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.FechaNacimiento = fechaNacimiento;
    }

   
}
