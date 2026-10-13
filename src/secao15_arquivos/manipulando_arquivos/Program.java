package secao15_arquivos.manipulando_arquivos;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Mostra pastas no diretório
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for(File folder:folders){
            System.out.println(folder);
        }

        // Mostra arquivos no diretório
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files :");
        for(File file:files){
            System.out.println(file);
        }

        // Cria pasta no diretório
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso");


        sc.close();
    }
}
