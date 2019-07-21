import java.util.Scanner;

public class Palavra {

    public static int tam (String palavra){

        return 0;

    }

    public static void recebe_palavra(){

        String palavra;
        Scanner scanner = new Scanner(System.in);
        palavra = scanner.nextLine();
        if (palavra.isEmpty()){
            System.out.println("Palavra invalida. tente novamente");
            Palavra.recebe_palavra();
        }
        System.out.println(palavra);

    }

}
