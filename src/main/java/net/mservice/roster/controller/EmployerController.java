package net.mservice.roster.controller;

import net.mservice.roster.model.Employer;
import net.mservice.roster.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployerController {

    private final EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/employers")
    public String findAll(Model model) {
        List<Employer> employers = employerService.findAll();
        model.addAttribute("employers", employers);

        return "employers-list";
    }

    @GetMapping("/employer-create")
    public String createEmployerForm(Employer employer) {
        return "employer-create";
    }

    @PostMapping("/employer-create")
    public String createEmployer(Employer employer) {
        employerService.saveEmployer(employer);
        return "redirect:/employers";
    }

    @GetMapping("employer-delete/{id}")
    public String deleteEmployer(@PathVariable("id") Integer id) {
        employerService.deleteById(id);
        return "redirect:/employers";
    }

    @GetMapping("employer-update/{id}")
    public String updateEmployerForm(@PathVariable("id") Integer id, Model model) {
        Employer employer = employerService.findById(id);
        model.addAttribute("employer", employer);
        return "/employer-update";
    }

    @PostMapping("/employer-update")
    public String updateEmployer(Employer employer) {
        employerService.saveEmployer(employer);
        return "redirect:/employers";
    }
}
