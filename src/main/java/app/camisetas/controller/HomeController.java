package app.camisetas.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.camisetas.model.Camiseta;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome() {
		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String goLogin() {
		return "login";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String goAdd() {
		Camiseta camiseta= new Camiseta();
		camiseta.setMarca("algo");
		camiseta.setColor("negro");
		camiseta.setPrecio(444.55);
		camiseta.setTalle("XXL");
		System.out.println(camiseta);
		//servicePeliculas.insert(peli);
		return "home";
	}
}
