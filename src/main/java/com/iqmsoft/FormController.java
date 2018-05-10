package com.iqmsoft;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class FormController {

     @GetMapping("/enter")
     public String greetingForm(Model model){
         model.addAttribute("form", new Form());
         return "form";
     }

     @PostMapping("/generatepdf")
     public String formSubmit(@ModelAttribute Form form){
         System.out.println("controller " +form.getContent());
         WritePDF writePDF = new WritePDF();
         writePDF.pdfCreater(form);
         return "result";
     }

 }