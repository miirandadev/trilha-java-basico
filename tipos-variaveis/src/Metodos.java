public class Metodos {
    public static void main(String[] args) {
        
    }

    public double somar(int num1, int num2) {
        return num1 + num2;
    }

    public void imprimir(String texto) {
        System.out.println(texto);
    }

     public double dividir(int num1, int num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("Divisão por zero não é permitida!");
        }
        return (double) num1 / num2;
    }

    public boolean validar() {
        // exemplo validação
        return true; 
    }

    public void gravarCliente(String nome, String cpf) {
        System.out.println("Cliente gravado: " + nome + " - CPF: " + cpf);
    }
    
}