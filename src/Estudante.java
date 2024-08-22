import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private int idade;
    private String id;
    private List<Disciplina> disciplinas;

        public Estudante(String nome, int idade, String id) {

            this.nome = nome;
            this.idade = idade;
            this.id = id;
            this.disciplinas = new ArrayList<>();
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public List<Disciplina> getDisciplinas(){
            return disciplinas;
        }
        public void adicionarDisciplina(Disciplina disciplina){
            disciplinas.add(disciplina);

        }
        public void removerDisciplina(Disciplina disciplina){
            disciplinas.remove(disciplina);
        }
        public void imprimirDisciplinas(){
            if(disciplinas.isEmpty()){
                System.out.println("_____________________________________________________________________________");
                System.out.println(nome+" não está matriculado.");
            }else {
                System.out.println("_____________________________________________________________________________");
                System.out.println("Aluno:"+nome);
                for(Disciplina disciplina : disciplinas){
                    System.out.println(disciplina);
                }
            }
        }
}
