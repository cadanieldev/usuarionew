package com.javanauta.usuario.business.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder // ajuda a conversao dos dados

public class UsuarioDTO {


    //Não expor dados e transformar em entidades


    private String nome;
    private String email;
    private String senha;
    private List<EnderecoDTO> enderecos;
    private List<TelefoneDTO> telefones;

}
