package com.mycompany.exerciciojavamap.Exer1;

import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {
        System.out.println("Dicionaria de estados e suas populações: ");
        Map<String, Double> populacaoEstadual = new HashMap<>(){{
            put("PE", 9616621.0);
            put("AL", 3351453.0);
            put("CE", 9187103.0);
            put("RN", 3534265.0);
        }};
        System.out.println(populacaoEstadual);
        
        System.out.println("Substuição do valor de RN: ");
        populacaoEstadual.put("RN", 3534165.0);
        System.out.println(populacaoEstadual);
        
        System.out.println("O estado PB está no dicionário? ");
        if (!populacaoEstadual.containsKey("PB")){
            populacaoEstadual.put("PB", 4039277.0);
        }
        System.out.println(populacaoEstadual);
        
        System.out.println("População do estado de PE: " + populacaoEstadual.get("PE"));
    }
}
