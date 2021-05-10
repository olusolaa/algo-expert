package com.olushola.school;

import java.util.*;

public class TournamentWinner {
    public static String tournamentWinner(
            List<List<String>> competitions, List<Integer> results) {

        List<String> winners = new ArrayList();

        for(int i=0; i< competitions.size(); i++){
            winners.add(competitions.get(i).get(1-results.get(i)));
        }
        //System.out.println(winners);
        Map<String,Integer> map = new HashMap();
        for(int j=0; j<winners.size(); j++){
                int count= (map.getOrDefault(winners.get(j),0));
                map.put(winners.get(j), count+1);
        }
        Map.Entry<String, Integer> max = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        return max.getKey();
    }

    public static void main(String[] args) {
        List<List<String>> competitions = List.of(List.of("HTML", "Z#"),List.of("C#", "Python"),
                List.of("Python", "HTML") );
        List<Integer> result=  List.of(0,0,1);
        System.out.println(tournamentWinner(competitions, result));
    }
}
