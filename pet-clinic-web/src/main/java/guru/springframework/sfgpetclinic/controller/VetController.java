package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.VetService;
@RequestMapping("vets")
@Controller
public class VetController {

	private final VetService vet;

	public VetController(VetService vet) {
			this.vet = vet;
	}
	@RequestMapping({"","/index","/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vets",vet.findAll());
		return "vets/index";
	}
	
}
