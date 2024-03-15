package exAula08;

public class QuadradoConcreto extends Quadrado {
    public QuadradoConcreto() {
        super();
    }

    public QuadradoConcreto(String cor, double lado) {
        super(cor, lado);
    }

    @Override
    public double area() {
        return this.getLado1() * this.getLado2();
    }

    @Override
    public String toString() {
        return "Quadrado [area=" + area() + ", cor=" + super.getCor() + "]";
    }
}