package com.unialfa.timefutebol.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produtor {

    @EqualsAndHashCode.Include
    private Long id;
    private String nome;
    private String propriedade;

}
