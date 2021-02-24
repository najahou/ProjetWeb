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
	 /////////////////////////////////// Pour le methode Get utiliser dans la table d'affichage //all
	 
	 @GetMapping(value = "/deletePharmacie1/{id}")
	    public String submit3(@PathVariable("id") int code_pharmacie) {
		 
		 Pharmacie obj = ps.getPharmacie(code_pharmacie);
			  ps.deletePharmacie(obj);
			  String redirectUrl = "/all";
			     return "redirect:" + redirectUrl;
		 
		
	    }
	 //----------------------
	 //********************************** la Modification ****************************************
	 
	 
	 @GetMapping(path={"/update","/update/{id}"})
	    public String submit4(@PathVariable("id") int code_pharmacie,Model model) {
	  
	      String id = String.valueOf(code_pharmacie);
	      if(id != null) {  
	    	    model.addAttribute("pharmacie", ps.getPharmacie(code_pharmacie)); 
	    	    Pharmacie ph = ps.getPharmacie(code_pharmacie); 
	      	}
	      else {
		 		 model.addAttribute("pharmacie", new Pharmacie());
	      }
	      return "Pharmacie/editpharmacie";
	    }
	 
	 @RequestMapping(value = "/editdb", method = RequestMethod.POST)
	    public String submitdb(Pharmacie ph) {
		 if(ps.getPharmacie(ph.getCode_pharmacie())!= null) {
			 ps.deletePharmacieById(ph.getCode_pharmacie());
		 } 
	     ps.saveProduit(ph);
	     String redirectUrl = "/all";
	     return "redirect:" + redirectUrl;
	    }

	 
	 
}
