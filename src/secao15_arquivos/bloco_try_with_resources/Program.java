package secao15_arquivos.bloco_try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// JEITO CERTO DE LER ARQUIVOS

public class Program {
    public static void main(String[] args) {
        String path = "c:\\Windows\\Temp\\test.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line!= null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

