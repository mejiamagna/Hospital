package ec.edu.ups.dao;

public class CitaDAO {
	/*
	@Override
	public List<Persona> obtenerPersona(String cedula) throws Exception {
		conenexioBD=null;
		Statement sta=null;
		ResultSet rs=null;
		
		String sql="select * from persona where cedula like '%" +cedula+"%'";
		
		List<Persona> listaPersonas=new ArrayList<Persona>();
		
		try {
			
			conenexioBD.conectarBD();
			sta=conenexioBD.getConexion().createStatement();
			rs=sta.executeQuery(sql);
			
			while(rs.next()) {
				
				Persona persona=new Persona();
				
				persona.setNombre(rs.getString(1));
				persona.setApellido(rs.getString(2));
				persona.setCedula(rs.getString(3));
				listaPersonas.add(persona);		
			}
			
			
		} catch (SQLException ex) {
			throw new Exception("Error al listar Persona [PDAO]"+ex.getMessage());
			
		}
		return listaPersonas;
	}*/
}
