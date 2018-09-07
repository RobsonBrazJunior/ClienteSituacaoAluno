package app;

import clientews2.Nota;

public class Principal2 {
    
    public static void main(String[] args) {
        clientews2.SituacaoPonderadaAluno1_Service service = new clientews2.SituacaoPonderadaAluno1_Service();
        clientews2.SituacaoPonderadaAluno1 port = service.getSituacaoPonderadaAluno1Port();
        
        Nota notaTemp1 = new Nota();
        notaTemp1.setPeso(1);
        notaTemp1.setValor(8);
        
        Nota notaTemp2 = new Nota();
        notaTemp2.setPeso(2);
        notaTemp2.setValor(7);
        
        Nota notaTemp3 = new Nota();
        notaTemp3.setPeso(3);
        notaTemp3.setValor(6);
        
        Nota notaTemp4 = new Nota();
        notaTemp4.setPeso(2);
        notaTemp4.setValor(8);
        
        System.out.println("Situacao = " + port.obterSituacaoPonderadaAluno(
                notaTemp1, notaTemp2, notaTemp3, notaTemp4));
    }    
}
