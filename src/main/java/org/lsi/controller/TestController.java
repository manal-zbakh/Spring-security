package org.lsi.controller;

import java.util.ArrayList;
import java.util.List;

import org.lsi.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//Comment afficher le contenu d'une variable
@Controller
public class TestController {

	@GetMapping("/test")
	public String showTest(Model out) {
		
		//pour recuperrer une valeur on declare var 
		String FirstName="Manal";
		out.addAttribute("name",FirstName );
		
		Email email = new Email("Bonjours" , "C'est super");
		out.addAttribute("email",email);
//********************************************************		
		List<Email> emails= new ArrayList<>();
//		emails.add("Bonjours" , "C'est super");
//		emails.add("salut" , "C'est coll");
//		emails.add("Aurevoir" , "Monsieur le professeur");
		
		out.addAttribute("emialList",emails);
	
//********************************************************	
		
		boolean logged = false;
		out.addAttribute("isLogged", logged);
		String firstName="Manal";
		out.addAttribute("Name",firstName );
			
		return "test.html";
	}
	
	@GetMapping("/hello")
	//on pass le name par lien si nn ila va affiche world , le nom  par deafaut
	public String showHello(Model model,
			                @RequestParam(name="name",
			                required= false,
			                defaultValue="World") String fname ) {
		

		model.addAttribute("name", fname);
		return "greeting.html";
	}
	
	@GetMapping("/list")
	public String showList(Model m) {
		
		List<String> firstNames= new ArrayList<>();
		firstNames.add("manal");
		firstNames.add("mouad");
		firstNames.add("ali");
		firstNames.add("alae");
		
		m.addAttribute("nams", firstNames);
		
		
		
		
		return "list.html";
	}
	
	
	
	
	
}
