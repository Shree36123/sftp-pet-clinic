package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import guru.springframework.sfgpetclinic.services.OwnerService;

@Controller
public class OwnerController {

	private final OwnerService ownerservice;

	public OwnerController(OwnerService ownerservice) {
		this.ownerservice = ownerservice;
	}

	@RequestMapping({ "owners", "owners/index", "owners/index.html" })
	public String listowners(Model model) {
		model.addAttribute("owners", ownerservice.findAll());
		return "owners/index";
	}

}
