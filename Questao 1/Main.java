public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "12345");
        aluno1.cadastrarNota(new double[]{8.0, 7.5, 9.0});

        Aluno aluno2 = new Aluno("Maria", "67890");
        aluno2.cadastrarNota(new double[]{6.0, 5.5, 7.0});

        Aluno aluno3 = new Aluno("Pedro", "54321");
        aluno3.cadastrarNota(new double[]{9.0, 8.5, 9.5});

        Turma turma = new Turma(30);//cria uma turma de 30 alunos
        Aluno[] alunos = {aluno1, aluno2, aluno3};//array de alunos pra adicionar na turma

        for(Aluno aluno : alunos) { //loop pra adicionar cada aluno na turma
            turma.adiconarAluno(aluno);
        }
        turma.alunosAprovados();
        turma.alunosReprovados();
    }
}
