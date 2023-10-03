package com.senac.thymeleafSenac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PessoaController{
    private List<Pessoa> pessoaList = new ArrayList<>();

    @GetMapping("/")
    public String inicial(Model model){
        model.addAttribute("pessoas", model);
        return "index";
    }


    public String adicionaPessoas(String nome){
        if(nome != null && !nome.equals("")){
            return "a";
        }
        return "";
    }

}
