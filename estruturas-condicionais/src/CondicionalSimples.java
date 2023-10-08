public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
        // Condicional Simples
        // Caixa Eletronico
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("Seu novo saldo é de: " + saldo);
        }
    }
}
