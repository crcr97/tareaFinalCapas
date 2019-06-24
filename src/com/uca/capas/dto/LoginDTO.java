package com.uca.capas.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
public class LoginDTO {

	@NotEmpty(message = "Ingrese un correo electronico")
	@Email(message = "Correo electronico invalido")
	@Size(message = "No puede ingresar mas de 100 caracteres", min = 0, max = 100)
	public String username;
	
	@NotEmpty(message = "Ingrese una contraseña")
	@Size(message = "No puede ingresar mas de 100 caracteres", min = 0, max = 100)
	public String password;

	public LoginDTO() {
		super();
	}



	public LoginDTO(
			@NotEmpty(message = "Ingrese un correo electronico") @Email(message = "Correo electronico invalido") @Size(message = "No puede ingresar mas de 100 caracteres", min = 0, max = 100) String username,
			@NotEmpty(message = "Ingrese una contraseña") @Size(message = "No puede ingresar mas de 100 caracteres", min = 0, max = 100) String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
