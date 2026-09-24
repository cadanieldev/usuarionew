package com.javanauta.usuario.infrastructure.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "via-cep", url = "${viacep.url}") // local para armazenar url e adicionar na properties
public interface ViaCepClient {

    //Apontar para a uri que vai trazer os dados do usuario
    @GetMapping("/ws/{cep}/json/")
    // sempre apontar o URI no get
    // anotacao metodo get
    ViaCepDTO buscaDadosEndereco(@PathVariable("cep") String cep);

}
