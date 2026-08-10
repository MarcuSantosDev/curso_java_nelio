package secao5_estruturaCondicional;

public class metodos_interessantes {
    public static void main(String[] args) {
        String original =  "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); // String tudo minúsculo
        String s02 = original.toUpperCase(); // String tudo maiúsculo
        String s03 = original.trim(); // Elimina os espaçoes em brancos no final da string
        String s04 = original.substring(2); // Extrair uma parte de uma String a partir do índice 2
        String s05 = original.substring(2,9); // Extrair uma parte de uma String do índice 2 ao 9
        String s06 = original.replace('a','x'); // Substitui o um valor por outro
        int i = original.indexOf("bc"); // procura a primeira ocorrência da sequência "bc" dentro da string original e retorna o índice onde ela começa.
        int j = original.lastIndexOf("bc");

        System.out.println("ToLowerCase:" + s01 + "-");
        System.out.println("ToUpperCase:" + s02 + "-");
        System.out.println("Trim:" + s03 + "-");
        System.out.println("Substring:" + s04 + "-");
        System.out.println("Substring:" + s05 + "-");
        System.out.println("Replace:" + s06 + "-");
        System.out.println("IndexOf:" + i);
        System.out.println("Last index Of:" + j);
    }
}
