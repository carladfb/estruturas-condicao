public class CondicionalTernaria {
    public static void main(String[] args) {
        // Condição Ternária
        // Sistema Escolar

        double nota = 6;

        // if else simples
        String resultado = nota >= 6 ? "Aprovado" : "Reprovado";

        System.out.println("Sua situação é: " + resultado);

        // if else if else
        String resultado2 = nota >= 6 ? "Aprovado" : nota >= 4 && nota < 6 ? "Recuperação" : "Reprovado";

        System.out.println("Sua situação é: " + resultado2);
    }
}
