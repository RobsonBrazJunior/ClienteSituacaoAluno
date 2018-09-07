
package clientews3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientews3 package. 
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

    private final static QName _ObterSituacaoPonderadaAluno2Response_QNAME = new QName("http://servico/", "obterSituacaoPonderadaAluno2Response");
    private final static QName _ObterSituacaoPonderadaAluno2_QNAME = new QName("http://servico/", "obterSituacaoPonderadaAluno2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObterSituacaoPonderadaAluno2 }
     * 
     */
    public ObterSituacaoPonderadaAluno2 createObterSituacaoPonderadaAluno2() {
        return new ObterSituacaoPonderadaAluno2();
    }

    /**
     * Create an instance of {@link ObterSituacaoPonderadaAluno2Response }
     * 
     */
    public ObterSituacaoPonderadaAluno2Response createObterSituacaoPonderadaAluno2Response() {
        return new ObterSituacaoPonderadaAluno2Response();
    }

    /**
     * Create an instance of {@link Nota }
     * 
     */
    public Nota createNota() {
        return new Nota();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterSituacaoPonderadaAluno2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "obterSituacaoPonderadaAluno2Response")
    public JAXBElement<ObterSituacaoPonderadaAluno2Response> createObterSituacaoPonderadaAluno2Response(ObterSituacaoPonderadaAluno2Response value) {
        return new JAXBElement<ObterSituacaoPonderadaAluno2Response>(_ObterSituacaoPonderadaAluno2Response_QNAME, ObterSituacaoPonderadaAluno2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObterSituacaoPonderadaAluno2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servico/", name = "obterSituacaoPonderadaAluno2")
    public JAXBElement<ObterSituacaoPonderadaAluno2> createObterSituacaoPonderadaAluno2(ObterSituacaoPonderadaAluno2 value) {
        return new JAXBElement<ObterSituacaoPonderadaAluno2>(_ObterSituacaoPonderadaAluno2_QNAME, ObterSituacaoPonderadaAluno2 .class, null, value);
    }

}
