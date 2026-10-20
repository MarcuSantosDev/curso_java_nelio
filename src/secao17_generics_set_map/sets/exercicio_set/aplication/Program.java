package secao17_generics_set_map.sets.exercicio_set.aplication;

import secao17_generics_set_map.sets.exercicio_set.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
    String path = "C:\\users.txt";
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("UTC"));
    Set<LogEntry> set = new HashSet<>();

    String line;
    try (BufferedReader br = new BufferedReader(new FileReader(path))){
        while((line = br.readLine()) != null){
            String[] fields = line.split(" ");
            String username = fields[0];
            Date moment = Date.from(Instant.parse(fields[1]));
            LogEntry logEntry = new LogEntry(username,moment);

            set.add(new LogEntry(username,moment));
        }
    }
    catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }

    for(LogEntry user:set){
        System.out.println(user.getUsername());
    }
        System.out.println("Total Users: " + set.size());

    }
}
