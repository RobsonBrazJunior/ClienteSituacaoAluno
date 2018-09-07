package app;

import clientews3.Nota;
import java.util.ArrayList;
import java.util.List;

public class Principal3 {
    public static void main(String[] args) {
        clientews3.SituacaoPonderadaAluno2_Service service = new clientews3.SituacaoPonderadaAluno2_Service();
        clientews3.SituacaoPonderadaAluno2 port = service.getSituacaoPonderadaAluno2Port();
        
        List<Nota> listaNotas = new ArrayList();
        Nota notaTemp;
        
        notaTemp = new Nota();
        notaTemp.setPeso(1);
        notaTemp.setValor(8);
        listaNotas.add(notaTemp);
        
        notaTemp = new Nota();
        notaTemp.setPeso(2);
        notaTemp.setValor(7);
        listaNotas.add(notaTemp);
        
        notaTemp = new Nota();
        notaTemp.setPeso(3);
        notaTemp.setValor(6);
        listaNotas.add(notaTemp);
        
        notaTemp = new Nota();
        notaTemp.setPeso(2);
        notaTemp.setValor(8);
        listaNotas.add(notaTemp);
        
        System.out.println("Situacao = " + port.obterSituacaoPonderadaAluno2(listaNotas));
    }
}
