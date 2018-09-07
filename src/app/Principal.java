package app;

public class Principal {

    public static void main(String[] args) {
        clientews.ServicoSituacaoAluno_Service service = new clientews.ServicoSituacaoAluno_Service();
        clientews.ServicoSituacaoAluno port = service.getServicoSituacaoAlunoPort();
        System.out.println("Aluno01: "+port.obterSituacaoAluno(2, 5, 10, 9));
        System.out.println("Aluno02: "+port.obterSituacaoAluno(9, 6, 8, 7));
        System.out.println("Aluno03: "+port.obterSituacaoAluno(4, 3, 7, 5));
    }    
}
