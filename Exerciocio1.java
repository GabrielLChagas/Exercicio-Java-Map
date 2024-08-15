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
        
        
        System.out.println("Exiba na order que foi informada: ");
        Map<String, Double> pEOdenador = new LinkedHashMap<>(){{
            put("PE", 9616621.0);
            put("AL", 3351453.0);
            put("CE", 9187103.0);
            put("RN", 3534265.0);
        }};
        System.out.println(pEOdenador);
        
        
        System.out.println("Exiba em order alfabética: ");
        Map<String, Double> pEAlfabetico = new TreeMap<>(populacaoEstadual);
        System.out.println(pEAlfabetico);
        
        
        Collection<Double> populacao = populacaoEstadual.values();
        String maiorPopulacao = "";
        String menorPopulacao = "";
        for(Map.Entry<String, Double> nPopulacao : populacaoEstadual.entrySet()){
            if(nPopulacao.getValue().equals(Collections.max(populacao))) maiorPopulacao = nPopulacao.getKey();
            if(nPopulacao.getValue().equals(Collections.min(populacao))) menorPopulacao = nPopulacao.getKey();
        }
        
        System.out.println("O maior estador é: " + maiorPopulacao + ". Com populacao de " + Collections.max(populacao));
        System.out.println("O menor estador é: " + menorPopulacao + ". Com populacao de " + Collections.min(populacao));
        
        
        int soma = 0;
        Iterator<Double> iterator = populacaoEstadual.values().iterator();
        while (iterator.hasNext()) soma += iterator.next();
        System.out.println("População total: " + soma);
        
        System.out.println("População média: " + soma/populacaoEstadual.size());
        
        Iterator<Double> removedor = populacaoEstadual.values().iterator();
        while (removedor.hasNext()){
            if (removedor.next() <= 4000000) removedor.remove();
         }
        System.out.println(populacaoEstadual);
        
        
        populacaoEstadual.clear();
        System.out.println("O dicionario esta vazio: " + populacaoEstadual.isEmpty());
    }
}
