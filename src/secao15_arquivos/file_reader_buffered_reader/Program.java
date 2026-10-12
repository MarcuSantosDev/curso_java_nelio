package secao15_arquivos.file_reader_buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// JEITO RUIM DE LER ARQUIVOS (JEITO CERTO -> bloco try with resources

public class Program {
    public static void main(String[] args) {
        String path = "c:\\Windows\\Temp\\test.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while(line!= null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if(br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
               e.printStackTrace();
            }
        }
    }
}
