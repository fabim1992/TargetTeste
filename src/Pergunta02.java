    import java.util.Scanner;

    public class Pergunta02{
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            int x= 0;
            int y = 1;
            int k = 0;
            int aux = 0;
            boolean isfibo = false;

            System.out.println("Informe o numero para saber se esta na sequencia fibonacci");
            k = scanner.nextInt();

            while(k >= aux){
                aux = x+y;
                x = y;
                y = aux;

                if (k == aux){
                    isfibo = true;
                }

            }

            if (isfibo) {
                System.out.println("O numero " + k + " esta na sequencia fibonacci");
            }
            else{
                System.out.println("O numero " + k + " nao esta na sequencia fibonacci");
                }

                }
            }