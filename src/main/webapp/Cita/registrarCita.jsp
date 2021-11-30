<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registroCita</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Registre su Cita Médica</h1>
<form>
  <div class="col-md-3">
    <label for="paciente" class="form-label">PACIENTE</label>
    <input type="text" class="form-control" placeholder= "JUAN PEREZ" required>
  </div>
  
  <div class="mb-3">
    <label for="doctor" class="form-label">Especialidades</label>

    <select class="form-select" aria-label="Default select example">
  	<option selected>Especialidades</option>
  	<option value="1">Traumatologia </option>
  	<option value="2">Ginecologia </option>
  	<option value="3">Cardiologia </option>
  	<option value="3">Odontología </option>
	</select placeholder= "" required>
	 <div id="medicoHelp" class="form-text">Seleccione la especialidad</div> 
  </div>
  
  <div class="mb-3">
    <label for="fecha" class="form-label">Fecha de la Cita</label>
    
    <input type="text" class="form-control" placeholder= "" required>
  </div>

  <div class="mb-3">
    <label for="validationTextarea" class="form-label">Sintomatología</label>
    <textarea class="form-control is-invalid" id="validationTextarea" placeholder="DESCRIBA SU SINTOMATOLOGÍA" required></textarea>
    </div>
  
  
  <div class="col-md-2">
    <label for="estado" class="form-label">Estado de la Cita</label>
     <select class="form-select" aria-label="Default select example">
	<input type="text" class="form-control" placeholder= "POR ATENDER" required>
  </div>
  
  <div class="mb-3">
    <label for="validationTextarea" class="form-label">Comentario</label>
    <textarea class="form-control is-invalid" id="validationTextarea"></textarea>
    </div>
  
<div class="col-md-2">
    <label for="costo" class="form-label">Costo</label>
    <input type="text" class="form-control" id="costo" placeholder= "Pendiente">
  </div>
  
  <button type="submit" class="btn btn-primary">REGISTRAR</button>
</form>
</body>
</html>