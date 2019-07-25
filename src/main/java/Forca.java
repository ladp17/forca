public class Forca {


    public void printForca(int i) {
        int tamforca = 0; //tamanho de vforca

        if (i <= tamforca) {

            // lista com as strings de forca: private (n sei o tipo) vforca;
            // System.out.println(vforca[i]);

        }





    }

    public void start(){

        Hidden palavra = new Hidden();
        Letra letra = new Letra();


        //inicia coisas relevantes pra forca
        palavra.setPalavra();
        palavra.criaHidden();
        palavra.printHidden();


        //jogo
        boolean errou;
        int limite = 5;
        int erro = 0;



        letra.setLetra();
        errou = palavra.preencheHidden(letra.getLetra());
        if (errou){
            erro++;
        }

        while (palavra.checkLeft() && (erro < limite)) {

            printForca(erro);
            letra.printJaTentadas();
            palavra.printHidden();
            letra.setLetra();
            errou = palavra.preencheHidden(letra.getLetra());
            if (errou){
                erro++;
            }

        }


        printForca(erro);
        letra.printJaTentadas();
        palavra.printHidden();

        if (erro == limite) {
            System.out.println("mais sorte na proxima");

        }
        else{
            System.out.println("parabens vc ganhou!");
        }

    }

}
