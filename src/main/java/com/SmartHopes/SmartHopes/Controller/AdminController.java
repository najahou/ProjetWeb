package com.SmartHopes.SmartHopes.Controller;


import com.SmartHopes.SmartHopes.Entities.Personne;
import com.SmartHopes.SmartHopes.Entities.Responsable;
import com.SmartHopes.SmartHopes.Repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @Autowired
    private PersonneRepository prespo;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("responsable",new Responsable());
        return "login";
    }

    @RequestMapping(value = "/addAdmin", method = RequestMethod.POST)
    public String submit(Responsable res) {
      prespo.save(res);
        return "admin";
    }
}