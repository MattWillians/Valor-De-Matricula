package matricula;

public class Aluno {
    
    String nome;
    int matricula;
    double desconto;
    Curso curso;

    public Aluno(String nome, int matricula, double desconto, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.desconto = desconto;
        this.curso = curso;
    }

    void info(){

        System.out.println("Nome do Aluno: " +nome); 
        System.out.println("Matricula Cadastrada: "+ matricula); 
        System.out.println("Desconto do Aluno: " +desconto); 
        curso.info();

    }

    double pagamento(){
        return curso.mensalidade*(1 - desconto);
    }
    

}
