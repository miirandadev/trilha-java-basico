public class  TiposVariaveis {

    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2021;
        int cep = 35950000; //se começar com zero talvez tenha que ser outro tipo, provavelmente uma string
        long cpf = 13627117646l; // se começar com zero talvez tenha que ser outro tipo
        float pi = 3.12f;
        double salario = 3500.50;
   
        short numCurto = 1;
        int numCurto1 = numCurto;
        short numCurto2 = (short) numCurto1;

        int numero = 2;

        numero = 10;

        final String NOME_ESCRITO_EM_MAIUSCULA = "o valor nao pode ser mudado";

    }

}