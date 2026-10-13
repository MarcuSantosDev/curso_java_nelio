package secao15_arquivos.file_writer_buffered_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};

        String path = "c:\\Windows\\Temp\\test2.txt";

        // parâmetro true indica que eu não quero recriar o arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for(String line:lines){
                bw.write(line); // Escreve / Sobrescreve no arquivo caso ele n exista
                bw.newLine(); // quebra de linha
            }
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
