package exAula08;

public class Teste {
    public static void main(String[] args) {
        Quadrado quadrado = new QuadradoConcreto();
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);

        ((QuadradoConcreto) quadrado).setCor("Roxo");
        ((QuadradoConcreto) quadrado).setLado1(4);

        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);
    }
}