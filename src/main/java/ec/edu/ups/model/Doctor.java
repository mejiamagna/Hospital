package ec.edu.ups.model;

import java.io.Serializable;

public class Doctor implements Serializable{
	private static final long serialVersionUID = 1L;


	private Persona idPersona;
	private String Password;
	

	public Doctor( Persona idPersona, String password) {
		super();
		
		this.idPersona = idPersona;
		this.Password = password;
	}
	
	

	public Persona getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Persona idPersona) {
		this.idPersona = idPersona;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "Doctor [ idPersona=" + idPersona + ", Password=" + Password + "]";
	}
	
	
	
}
