public class Main {

    public static void main(String[] args) {

        Hidden palavra = new Hidden();
        Letra letra = new Letra();

        palavra.setPalavra();

        //debug
        palavra.criaHidden();

        palavra.preencheHidden('a');

        palavra.printHidden();


        //mais debug


//        while (true) {
//
//            letra.setLetra();
//
//            letra.printJaTentadas();
//        }




        // Debug
//        palavra.checkLeter(letra.getLetra());
//        System.out.println(palavra.getPalavra());
//        System.out.println(palavra.getTam());


    }

}
