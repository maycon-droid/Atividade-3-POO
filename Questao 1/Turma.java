public class Turma {
    private Aluno[] alunos;
    private int quantidadeAlunos;

    public Turma(int tamanho) {
        this.alunos = new Aluno[tamanho];
        this.quantidadeAlunos = 0;
    }

    public void adiconarAluno(Aluno aluno) {
        if(quantidadeAlunos >= alunos.length) {
            System.out.println("Não é possível adicionar mais alunos.");
            return;
        }
        this.alunos[quantidadeAlunos] = aluno;
        this.quantidadeAlunos++;
    }

    public void alunosAprovados(){
        System.out.println("Alunos aprovados com média >= 7.0: ");
        for(int i = 0; i < quantidadeAlunos; i++) {
            Aluno aluno = this.alunos[i];
            if(aluno.calcularMedia() >= 7.0){
                System.out.println(aluno.getNome());
            }
        }
        System.out.println();
    }

    public void alunosReprovados(){
        System.out.println("Alunos reprovados com média < 7.0: ");
        for(int i = 0; i < quantidadeAlunos; i++) {
            Aluno aluno = this.alunos[i];
            if(aluno.calcularMedia() < 7.0){
                System.out.println(aluno.getNome());
            }
        }
        System.out.println();
    }

}
