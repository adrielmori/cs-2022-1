package com.aula08.tarefa008;

import java.util.ArrayList;

/**
 * Enum representa um o Tipo do Enderco e é 
 * criada para trabalhar com seus atibutos
 *  que recebe somente valores para classificar
 * entre endereco Comercial e Residencial.
 * @author Adriel Lenner Vinhal Mori
 * @date 15/07/2022 
 * @version 2.0 tarefa008
 */

public enum TipoEndereco {    

    COMERCIAL,
    RESIDENCIAL;   

    ArrayList<TipoEndereco> enderecos = new ArrayList<>();    
}
