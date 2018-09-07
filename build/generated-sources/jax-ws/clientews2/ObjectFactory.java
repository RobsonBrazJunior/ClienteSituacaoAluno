
package clientews2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientews2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObterSituacaoPonderadaAlunoResponse_QNAME = new QName("http://servico/", "obterSituacaoPonderadaAlunoResponse");
    private final static QName _ObterSituacaoPonderadaAluno_QNAME = new QName("http://servico/", "obterSituacaoPonderadaAluno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObterSituacaoPonderadaAluno }
     * 
     */
    public ObterSituacaoPonderadaAluno createObterSituacaoPonderadaAluno() {
        return new ObterSituacaoPonderadaAluno();
    }

    /**
     * Create an instance of {@link ObterSituacaoPonderadaAlunoResponse }
     * 
     */
    public ObterSituacaoPonderadaAlunoResponse createObterSituacaoPonderadaAlunoResponse() {
        return new ObterSituacaoPonderadaAlunoResponse();
    }

    /**
     * Create an instance of {@link Nota }
     * 
     */
    public Nota createNota() {
        return new Nota();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterSituacaoPonderadaAlunoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "obterSituacaoPonderadaAlunoResponse")
    public JAXBElement<ObterSituacaoPonderadaAlunoResponse> createObterSituacaoPonderadaAlunoResponse(ObterSituacaoPonderadaAlunoResponse value) {
        return new JAXBElement<ObterSituacaoPonderadaAlunoResponse>(_ObterSituacaoPonderadaAlunoResponse_QNAME, ObterSituacaoPonderadaAlunoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterSituacaoPonderadaAluno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "obterSituacaoPonderadaAluno")
    public JAXBElement<ObterSituacaoPonderadaAluno> createObterSituacaoPonderadaAluno(ObterSituacaoPonderadaAluno value) {
        return new JAXBElement<ObterSituacaoPonderadaAluno>(_ObterSituacaoPonderadaAluno_QNAME, ObterSituacaoPonderadaAluno.class, null, value);
    }

}
