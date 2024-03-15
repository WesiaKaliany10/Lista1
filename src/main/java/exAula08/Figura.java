/**
 *
 * @author Wésia Kaliany <@kalianywesia2005@gmail.com>
 */

package exAula08;
public abstract class Figura {
  private String cor;

    public Figura() {
    }

    public Figura(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura (cor: " + cor + ")";
    }

    public abstract double area();
}