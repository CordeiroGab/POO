import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private String cod;
    private int semanas;
    private int numbModulo;

    public Disciplina(String nome, String cod, int semanas, int numbModulo) {
        this.nome = nome;
        this.cod = cod;
        this.semanas = semanas;
        this.numbModulo = numbModulo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public int getSemanas() {
        return semanas;
    }
    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }
    public int getNumbModulo() {
        return numbModulo;
    }
    public void setNumbModulo(int numbModulo) {
        this.numbModulo = numbModulo;
    }
    public String toString() {
        return "Disciplina:"+nome+ " | Código: " + cod + " | Periodo: " + semanas + " semanas | Módulo: " + numbModulo;
    }
}
