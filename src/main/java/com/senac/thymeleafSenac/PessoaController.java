package com.senac.thymeleafSenac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PessoaController{

    @GetMapping("/")
    public String inicial(Model model){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alysson"));
        pessoas.add(new Pessoa("Guste"));
        pessoas.add(new Pessoa("Pedro"));
        pessoas.add(new Pessoa("Henrique"));

        model.addAttribute("pessoas", pessoas);

        return "index";
    }


    /*public String adicionaPessoas(String nome){
        if(nome != null && !nome.isEmpty()){
            return "a";
        }
        return "";
    }*/

}
