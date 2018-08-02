package app.camisetas.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.camisetas.model.Camiseta;
import app.camisetas.repository.CamisetasRepository;

@Controller
public class HomeController {
	
	@Autowired
	public CamisetasRepository camisetasRepo; 

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
		camiseta.setMarca("Adidas");
		camiseta.setColor("Blanco/Rojo");
		camiseta.setPrecio(55000);
		camiseta.setTalle("M");
		System.out.println(camiseta);
		camisetasRepo.save(camiseta);
		return "home";
	}
}
