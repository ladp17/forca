import java.util.Scanner;

public class Palavra {

    private int tam;
    private String palavra;

    public void setPalavra(){

        Scanner scanner = new Scanner(System.in);
        this.palavra = scanner.nextLine();
        if (this.palavra.isEmpty()){
            System.out.println("Palavra invalida. tente novamente");
            this.setPalavra();
        }

    }

    public String getPalavra(){

        return this.palavra;

    }

    public int getTam(){
        return this.palavra.length();
    }


    public int checkLeter(char letra){
        int[] a = new int[5];

        for (int i = 0; i < this.getTam(); i++) {

            a[i] = 0;
            if (this.palavra.chars().equals(letra)) { //esse comando n ta funcionando. era pra printar 00010 com a entrada porta
                a[i] = i;
            }
            System.out.println(a[i]);


        }

        return 0;
    }



}

