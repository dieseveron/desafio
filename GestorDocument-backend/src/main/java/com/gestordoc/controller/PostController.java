package com.gestordoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    @PostMapping("/documents")
    public String documents(@RequestParam(value="nameDocument", required=false) String nameDocument, Model model) {
        model.addAttribute("nameDocument", nameDocument);
        return "greeting";
    }
}
