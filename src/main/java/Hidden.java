public class Hidden extends Palavra{

    private String hidden;
    private int i = 0;


    public void criaHidden(){

        this.hidden = "_";

        for (i = 1; i < this.getTam(); i++) {

            this.hidden = this.hidden + " _";


        }

        preencheHidden(' ');

    }

    public boolean preencheHidden(char letra){
        int ofset;

        int v = this.checkLeter(letra);

        StringBuilder s = new StringBuilder(this.hidden);

        if (v == 0){             //confere se a letra foi encontrada alguma vez na palavra. senao retorna false.

            return false;
        }




        for (v /= 10 ; v > 0; v /= 10){           //substiu a letra no lugar correto

            ofset = (v % 10) * 2;

            s.setCharAt(ofset, letra);

        }

        this.hidden = s.toString();

        return true;
    }

    public void printHidden()
    {

        System.out.println(hidden);

    }

}
