import java.util.Scanner;

public class pergunta05 {
    public static void main(String[] args) {
        String frase = "";
        String aux = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a String");
        frase = scanner.nextLine();



        for (int i = 1; i <= frase.length(); i++) {
            aux = aux + frase.charAt(frase.length() - (i));
        }
        System.out.println(aux);
    }
}
