package com.SmartHopes.SmartHopes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SmartHopes.SmartHopes.Entities.Pharmacie;
import com.SmartHopes.SmartHopes.Entities.Responsable;
import com.SmartHopes.SmartHopes.services.PharmacieService;

@Controller
public class PharmacieController {
	@Autowired PharmacieService ps;
	
	//code d'ajout Pharmacie
		@RequestMapping(value = "/pharmacie", method = RequestMethod.GET)
	    public String showForm(Model model) {
	        model.addAttribute("Pharmacie",new Pharmacie());
	        return "Pharmacie/createpharmacie";
	    }
		 @RequestMapping(value = "/createPharmacie", method = RequestMethod.POST)
		    public String submit(Pharmacie ph) {
		      ps.saveProduit(ph);
		        return "admin";
		    }
	 //--------------------------------------------
	 ///Afficher tous les pharmacies...........
		 @RequestMapping("/all")
		 public String showAll(Model model) {
		     model.addAttribute("Pharmacies", ps.getAllPharmacies());
		     return "Pharmacie/ListePharmacie";
		 }
	 //---------------------------------------------
		 
     // trouve une Pharmacie
	 @RequestMapping(value = "/find", method = RequestMethod.GET)
	    public String showForm1(Model model) {
	        model.addAttribute("pharmacie",new Pharmacie());
	        return "Pharmacie/findpharmacie";
	    }
	 @RequestMapping(value = "/findPharmacieResult")
	    public String submit1(Pharmacie ph,Model model) {
		 model.addAttribute("pharmacie", ps.getPharmacie(ph.getCode_pharmacie()));
		 //System.out.println(ps.getPharmacie(ph.getCode_pharmacie()).getEmail());
	        return "Pharmacie/findPharmacieResult";
	    }
	 //-----------------------------------------------
	 //Pour La suppression
	 @RequestMapping(value = "/delete", method = RequestMethod.GET)
	    public String showForm3(Model model) {
		 //model.addAttribute("Pharmacie",new Pharmacie());
	        return "Pharmacie/deletePharmacie";
	    }
	 @RequestMapping(value = "/deletePharmacie", method = RequestMethod.POST)
	    public String submit2(Pharmacie ph) {
	      ps.deletePharmacie(ph);
	        return "Pharmacie/ListePharmacie";
	    }
	 ///////////////////////////////////
	 
	 /*@GetMapping(value = "/deletePharmacie1/{code_pharmacie}")
	    public void submit3(@PathVariable("code_pharmacie") int code_pharmacie) {
	      ps.deletePharmacieById(code_pharmacie);
	        //return "Pharmacie/all";
	    }*/
	 //----------------------
	 // la Modification --------------------------
	 
	 
}
