package matricula;
public class MenuIniciar {
    public static void main(String[] args) throws Exception {

        Aluno a1 = new Aluno("Matheus",2871,0.2,new Curso("Engenharia", 1000));

        a1.info();
        System.out.println("Pagamento: " + a1.pagamento());


    }
}
