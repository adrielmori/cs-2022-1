package com.aula08.tarefa008;

import java.util.ArrayList;

/**
 * Classe reppresenta um Estado e é 
 * criada para trabalhar com seus atibutos
 * e sua associação com a Cidade.
 * @author Adriel Lenner Vinhal Mori
 * @date 15/07/2022 
 * @version 2.0 tarefa008
 */

public class Estado{

    private String sigla;
    private String nome;
    Pais pais;

    ArrayList<Cidade> cidades = new ArrayList<>();
}
