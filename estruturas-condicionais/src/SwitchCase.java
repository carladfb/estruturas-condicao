public class SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // Sistema Média

        String sigla = "A";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }

        // Switch case é bom para casos em que há bastante repetição, o uso de breaks é
        // essencial
    }
}
