
package secao15_arquivos.informacoes_caminho_arq;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");

        String strPath = sc.nextLine();

        // Cria um objeto File que representa o caminho informado.
        File path = new File(strPath);

        // Retorna o nome do arquivo ou do último diretório do caminho
        System.out.println("getName: " + path.getName());

        // Retorna o caminho do diretório pai.
        // Retorna null se o caminho não possuir um diretório pai identificado.
        System.out.println("getParent: " + path.getParent());

        // Retorna o diretório completo
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
