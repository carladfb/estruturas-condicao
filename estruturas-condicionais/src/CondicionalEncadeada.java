public class CondicionalEncadeada {
    public static void main(String[] args) {
        // Condicional Encadeda
        // Sistema Escolar

        int nota = 8;

        if (nota >= 6) {
            System.out.println("Aprovado");
        } else if (nota >= 4 && nota < 6) {
            System.out.println("Prova de recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
