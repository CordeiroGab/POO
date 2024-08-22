public class Main {

    public static void main(String[] args) {

        Disciplina programação = new Disciplina("Programação 01", "Pro01", 8, 1);
        Disciplina bandoDeDados = new Disciplina("Bando de dados 01", "Banc01", 8, 1);
        Disciplina logica = new Disciplina("Lógica", "Log01", 10, 2);
        Disciplina ingles = new Disciplina("Inglês","Ingl02", 10, 2);


        Estudante estudante1 = new Estudante("Gabriel", 20, "12312315");
        Estudante estudante2 = new Estudante("Maria ", 22, "12344564");
        Estudante estudante3 = new Estudante("João",21 , "1234145");
        Estudante estudante4 = new Estudante("Guilherme", 19, "12341412");


        estudante1.adicionarDisciplina(programação);
        estudante1.adicionarDisciplina(bandoDeDados);


        estudante2.adicionarDisciplina(logica);
        estudante2.adicionarDisciplina(bandoDeDados);
        estudante2.removerDisciplina(programação);

        estudante4.adicionarDisciplina(ingles);
        estudante4.adicionarDisciplina(logica);




        estudante1.imprimirDisciplinas();
        estudante2.imprimirDisciplinas();
        estudante3.imprimirDisciplinas();
        estudante4.imprimirDisciplinas();

    }
}

