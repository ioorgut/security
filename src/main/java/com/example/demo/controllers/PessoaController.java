package com.example.demo.controllers;

import com.example.demo.models.PessoaModel;
import com.example.demo.services.PessoaService;
import org.hibernate.mapping.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll(){
        return pessoaService.findAll();
    }

    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoaModel){
        return pessoaService.criarPessoa(pessoaModel);
    }
}
