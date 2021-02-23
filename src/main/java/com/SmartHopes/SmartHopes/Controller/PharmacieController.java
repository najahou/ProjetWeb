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
	
	@RequestMapping(value = "/pharmacie", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("Pharmacie",new Pharmacie());
        return "Pharmacie/createpharmacie";
    }
	 //code d'ajout Pharmacie
	 @RequestMapping(value = "/createPharmacie", method = RequestMethod.POST)
	    public String submit(Pharmacie ph) {
	      ps.saveProduit(ph);
	        return "admin";
	    }
	 
	 @RequestMapping("/all")
	 public String showAll(Model model) {
	     model.addAttribute("Pharmacies", ps.getAllPharmacies());
	     return "Pharmacie/ListePharmacie";
	 }
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
	 @RequestMapping(value = "/delete/{code_pharmacie}", method = RequestMethod.GET)
	    public String showForm3(@PathVariable int id) {
	        ps.deletePharmacieById(id);
	        return "Pharmacie/deletePharmacie";
	    }
	 
}
