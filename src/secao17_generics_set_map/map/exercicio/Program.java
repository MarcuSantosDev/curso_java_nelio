package secao17_generics_set_map.map.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\eleicao.txt";
        Map<String,Integer> votes = new HashMap<>();

        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            while((line = br.readLine()) != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (votes.containsKey(name)){
                    int votesSoFar = votes.get(name);
                    votes.put(name,count += votesSoFar);
                }
                else {
                    votes.put(name,count);
                }

            }
            for (Map.Entry<String,Integer> entry:votes.entrySet()){
                System.out.println("Candidato: " + entry.getKey() + " Votos: " + entry.getValue());
            }
        }

        catch (IOException e){
            System.out.println("error: " + e.getMessage());
        }
    }
}
