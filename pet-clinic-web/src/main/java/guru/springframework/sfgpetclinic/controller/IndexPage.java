package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPage {
	@RequestMapping({ "", "/", "index.html", "Index.html" })
	public String indexPage() {
		return "index";
	}
}
