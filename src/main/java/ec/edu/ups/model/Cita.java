package ec.edu.ups.model;

import java.io.Serializable;
import java.time.LocalTime;

public class Cita implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCitas;
	//private	Paciente idPaciente;
	private Doctor idDoctor;
	private LocalTime fechaCita;
	private String Sintomatologia;
	private String estadoCita;
	private String comentarioCita;
	private Double costo; 
	//private MedicoEspecialidad medicoEspecialidad;
	
	
	public Integer getIdCitas() {
		return idCitas;
	}
	public void setIdCitas(Integer idCitas) {
		this.idCitas = idCitas;
	}
	/*public Paciente getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Paciente idPaciente) {
		this.idPaciente = idPaciente;
	}
	public Doctor getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(Doctor idDoctor) {
		this.idDoctor = idDoctor;
	}*/
	public LocalTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public String getSintomatologia() {
		return Sintomatologia;
	}
	public void setSintomatologia(String sintomatologia) {
		Sintomatologia = sintomatologia;
	}
	public String getEstadoCita() {
		return estadoCita;
	}
	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}
	public String getComentarioCita() {
		return comentarioCita;
	}
	public void setComentarioCita(String comentarioCita) {
		this.comentarioCita = comentarioCita;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
		
}
