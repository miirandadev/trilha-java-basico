public class Operadores {
    
    public static void main(String[] args) {
        int num = 9;
        num++;
        System.out.println(num); 
        
        boolean var = false;
        var = !var;
        System.out.println(var);

        // Operadores ternários
        int a = 6;
        int b = 6;

        // usando If normal
        String resultado = "";
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.err.println(resultado);

        // //Usando operador ternário:
        String resultadoTernario = a == b ? (resultadoTernario = "Res ternario: verdadeiro") : (resultadoTernario = " Res Ternario: falso");

        System.out.println(resultadoTernario);


        //OPERADORES RELACIONAIS

        int num1 = 1;
        int num2 = 2;

        boolean simOuNao = num1 < num2;

        if(num1 > num2){
            System.out.println("Num 1 é maior que num2");
        }
            else{ 
            System.out.println("Num1 não é maior que num 2");
        }

        // // Para comparar outros tipos de valores como strings, classes, objetos, é reeomendado e indicado usar o
        String nome1 = "lucas";
        String nome2 = new String("lucas");

        System.out.println(nome1.equals(nome2));


        //Operadores Lógicos:
        //Caso eu queira verificar se duas condições são verdadeiras para me dar um ponto de execução ou um determinado resultado:

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.print("As duas condições são verdadeiras");
        }

        System.out.println("Fim");

        //Caso eu queira verificar se uma condição ou outra é verdadeira para me dar um ponto de execução:

        if(condicao1 || condicao2) {
            System.out.print("Pelo menos uma das duas condições é verdadeira");
        }

        //podemos usar esse operador lógico de outras maneiras como por exemplo:

        if(condicao1 && (7 > 2)) {
             System.out.print("As duas condições são verdadeiras");
        }
    } 

    
}



