public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private int quantidadeNotas = 0;

    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void cadastrarNota(double[] notas) {
        if(quantidadeNotas + notas.length > 4) {
            System.out.println("Não é possível cadastrar mais de 4 notas.");
            return;
        }
        //for each pra percorrer o array de notas e adicionar cada nota ao array de notas do aluno
        for(double nota : notas) {
            this.notas[quantidadeNotas] = nota;
            this.quantidadeNotas++;
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for(int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }
        return soma / quantidadeNotas;
    }

    public void verificarAprovacao(){
        double media = calcularMedia();
        if(media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }
}