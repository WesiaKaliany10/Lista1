package exAula08;

import java.util.Scanner;

public class MenuFiguras {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean sair = false;
            
            while (!sair) {
                System.out.println("\nSelecione o tipo de figura geométrica:");
                System.out.println("1. Quadrado");
                System.out.println("2. Triângulo");
                System.out.println("3. Círculo");
                System.out.println("4. Retângulo");
                System.out.println("0. Sair");
                
                int escolha = scanner.nextInt();
                
                switch (escolha) {
                    case 0 -> sair = true;
                    case 1 -> criarQuadrado(scanner);
                    case 2 -> criarTriangulo(scanner);
                    case 3 -> criarCirculo(scanner);
                    case 4 -> criarRetangulo(scanner);
                    default -> System.out.println("Escolha inválida. Por favor, tente novamente.");
                }
            }
            
            System.out.println("Programa encerrado.");
        }
    }

    private static void criarQuadrado(Scanner scanner) {
        System.out.println("Digite a cor do quadrado:");
        String cor = scanner.next();
        System.out.println("Digite o tamanho do lado do quadrado:");
        double lado = scanner.nextDouble();

        Quadrado quadrado = new QuadradoConcreto(cor, lado);
        System.out.println(quadrado);
    }

    private static void criarTriangulo(Scanner scanner) {
        System.out.println("Digite a cor do triângulo:");
        String cor = scanner.next();
        System.out.println("Digite o tamanho da base do triângulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite o tamanho da altura do triângulo:");
        double altura = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(cor, base, altura);
        System.out.println(triangulo);
    }

    private static void criarCirculo(Scanner scanner) {
        System.out.println("Digite a cor do círculo:");
        String cor = scanner.next();
        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(cor, raio);
        System.out.println(circulo);
    }

    private static void criarRetangulo(Scanner scanner) {
        System.out.println("Digite a cor do retângulo:");
        String cor = scanner.next();
        System.out.println("Digite o tamanho da base do retângulo:");
        double base = scanner.nextDouble();
        System.out.println("Digite o tamanho da altura do retângulo:");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(cor, base, altura);
        System.out.println(retangulo);
    }
}