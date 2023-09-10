import java.util.Scanner;

public class triangulo {

    public static boolean ehTriangulo(double L1, double L2, double L3) {
        if (L1 <= 0 || L2 <= 0 || L3 <= 0) {
            return false;
        }
        return (L1 + L2 > L3) && (L1 + L3 > L2) && (L2 + L3 > L1);
    }

    public static String tipoTriangulo(double L1, double L2, double L3) {
        if (!ehTriangulo(L1, L2, L3)) {
            return "Não é Triângulo";
        } else if (L1 == L2 && L2 == L3) {
            return "Equilátero";
        } else if (L1 == L2 || L2 == L3 || L1 == L3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado do triângulo:");
        double L1 = scanner.nextDouble();
        System.out.println("Digite o valor do segundo lado do triângulo:");
        double L2 = scanner.nextDouble();
        System.out.println("Digite o valor do terceiro lado do triângulo:");
        double L3 = scanner.nextDouble();
        scanner.close();

        if (ehTriangulo(L1, L2, L3)) {
            String tipo = tipoTriangulo(L1, L2, L3);
            System.out.println("É um triângulo " + tipo);
        } else {
            System.out.println("Não é um triângulo ");
        }
    }
}
