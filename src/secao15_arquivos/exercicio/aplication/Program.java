package secao15_arquivos.exercicio.aplication;

import secao15_arquivos.exercicio.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();
        File sourceFile = new File(sourceFileStr);

        String souceFolderStr = sourceFile.getParent();
        boolean sucess = new File(souceFolderStr + "\\out").mkdir();
        if (sucess) {
            System.out.println("Folder created, " + sucess);
        }
        else{
            System.out.println("Folder " + souceFolderStr + "\\out already exist" );
        }

        String targetFileStr = souceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            List<String> lines = br.lines().toList();

            for (String line : lines) {
                String[] lineSplitted = line.split(",");

                String name = lineSplitted[0];
                double price = Double.parseDouble(lineSplitted[1]);
                int quantity = Integer.parseInt(lineSplitted[2]);

                products.add(new Product(name, price, quantity));
            }
        }

        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }


        try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
            for(Product p:products){
                bw.write(p.toString());
                bw.newLine();

                System.out.println(p);
            }
        }

        catch (IOException e){
            System.out.println("Error Writing File: " + e.getMessage());
        }

        sc.close();
    }

}
