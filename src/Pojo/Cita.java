package Pojo;

public class Cita {
    private String nombrePaciente;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String edad;
    private String motivo;
    private String nombreMedico;
    private String horaCita;
    private String fechaCita;
    private String telefono;
    private String correo;
    private String sexo;

    public Cita(String nombrePaciente, String apellidoPaterno, String apellidoMaterno, String edad, String motivo, String nombreMedico, String horaCita, String fechaCita, String telefono, String correo,String sexo) {
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.motivo = motivo;
        this.nombreMedico = nombreMedico;
        this.horaCita = horaCita;
        this.fechaCita = fechaCita;
        this.telefono = telefono;
        this.correo = correo;
        this.sexo = sexo;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getEdad() {
        return edad;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSexo() {
        return sexo;
    }
}
