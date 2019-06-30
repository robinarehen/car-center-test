package com.asesoftware.carcentertest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asesoftware.carcentertest.model.Cliente;
import com.asesoftware.carcentertest.model.DatosPersona;
import com.asesoftware.carcentertest.model.TipoEstado;
import com.asesoftware.carcentertest.model.Usuario;
import com.asesoftware.carcentertest.service.CiudadService;
import com.asesoftware.carcentertest.service.ClienteService;
import com.asesoftware.carcentertest.service.TipoEstadoService;
import com.asesoftware.carcentertest.service.TipoGeneroService;
import com.asesoftware.carcentertest.service.TipoIdentificacionService;
import com.asesoftware.carcentertest.service.TipoPersonaService;
import com.asesoftware.carcentertest.service.UsuarioService;

@Controller
@RequestMapping("/cliente")
public class ClienteWebController {
	
	@Autowired
	private TipoPersonaService personaService;
	@Autowired
	private TipoIdentificacionService tipoIdentificacionService;
	@Autowired
	private CiudadService ciudadService;
	@Autowired
	private TipoGeneroService generoService;
	@Autowired
	private TipoEstadoService estadoService;
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private UsuarioService usuarioService;

	private final String TIPO_PERSONA = "Cliente";
	private final String NOMBRE_TABLA = "ALL_TABLES";
	private final String NOMBRE_ESTADO = "Activo";

	@GetMapping("/crear")
	public String getCrear(Model model) {

		Cliente cliente = new Cliente();

		cliente.setDatosPersona(new DatosPersona());
		
		this.init(model, cliente, false);
		
		return "/cliente/crear";
	}

	@PostMapping("/crear")
	public String postCrear(Model model, @ModelAttribute Cliente cliente) {
		
		TipoEstado tipoEstado = this.estadoService.getEstado(this.NOMBRE_TABLA, this.NOMBRE_ESTADO);
		
		cliente.getDatosPersona().setTipoPersona(this.personaService.getTipoPersona(this.TIPO_PERSONA));
		cliente.getDatosPersona().setTipoEstado(tipoEstado);
		cliente.setTipoEstado(tipoEstado);
		
		this.clienteService.create(cliente);
		
		String userName = String.format("%s-%s-%s", 
				cliente.getDatosPersona().getTipoIdentificacion().getNombre(),
				cliente.getDatosPersona().getNumeroIdentificacion(),
				cliente.getDatosPersona().getNombres());

		Usuario usuario = new Usuario();
		
		usuario.setDatosPersona(cliente.getDatosPersona());
		usuario.setTipoEstado(tipoEstado);
		usuario.setUsername(userName);
		
		this.usuarioService.create(usuario);
		
		this.init(model, cliente, true);

		return "/cliente/crear";
	}
	
	private void init(Model model, Cliente cliente, boolean created) {

		model.addAttribute("CLIENTE", cliente);
		model.addAttribute("CIUDADES", this.ciudadService.getFindAll());
		model.addAttribute("TIPOS_IDENTIFICACION", this.tipoIdentificacionService.getFindAll());
		model.addAttribute("TIPOS_GENERO", this.generoService.getFindAll());
		
		model.addAttribute("CREATED", created);
		
		if (created) {

			String userName = String.format("%s-%s-%s", 
					cliente.getDatosPersona().getTipoIdentificacion().getNombre(),
					cliente.getDatosPersona().getNumeroIdentificacion(),
					cliente.getDatosPersona().getNombres());
			
			model.addAttribute("USERNAME", userName);
		}
	}
}
