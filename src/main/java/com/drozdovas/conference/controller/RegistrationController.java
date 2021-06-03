package com.drozdovas.conference.controller;

import com.drozdovas.conference.dto.RegistrationReportDto;
import com.drozdovas.conference.model.Registration;
import com.drozdovas.conference.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration")Registration registration) {
        return "registration";
    }

    @GetMapping("registrations")
    public @ResponseBody List<Registration> getRegistrations() {
        return registrationService.getAll();
    }

    @GetMapping("registration-reports")
    public @ResponseBody List<RegistrationReportDto> getRegistrationReports() {
        return registrationService.getAllReports();
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute ("registration") Registration registration,BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        }else{
            registrationService.add(registration);
        }

        System.out.println("Registration: " + registration.getName());

        return "redirect:registration";
    }

}
