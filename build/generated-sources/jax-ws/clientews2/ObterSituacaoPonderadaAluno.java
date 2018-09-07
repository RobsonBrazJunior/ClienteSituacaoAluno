
package clientews2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de obterSituacaoPonderadaAluno complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="obterSituacaoPonderadaAluno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://servico/}nota" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://servico/}nota" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://servico/}nota" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://servico/}nota" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterSituacaoPonderadaAluno", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3"
})
public class ObterSituacaoPonderadaAluno {

    protected Nota arg0;
    protected Nota arg1;
    protected Nota arg2;
    protected Nota arg3;

    /**
     * Obtém o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link Nota }
     *     
     */
    public Nota getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link Nota }
     *     
     */
    public void setArg0(Nota value) {
        this.arg0 = value;
    }

    /**
     * Obtém o valor da propriedade arg1.
     * 
     * @return
     *     possible object is
     *     {@link Nota }
     *     
     */
    public Nota getArg1() {
        return arg1;
    }

    /**
     * Define o valor da propriedade arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link Nota }
     *     
     */
    public void setArg1(Nota value) {
        this.arg1 = value;
    }

    /**
     * Obtém o valor da propriedade arg2.
     * 
     * @return
     *     possible object is
     *     {@link Nota }
     *     
     */
    public Nota getArg2() {
        return arg2;
    }

    /**
     * Define o valor da propriedade arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link Nota }
     *     
     */
    public void setArg2(Nota value) {
        this.arg2 = value;
    }

    /**
     * Obtém o valor da propriedade arg3.
     * 
     * @return
     *     possible object is
     *     {@link Nota }
     *     
     */
    public Nota getArg3() {
        return arg3;
    }

    /**
     * Define o valor da propriedade arg3.
     * 
     * @param value
     *     allowed object is
     *     {@link Nota }
     *     
     */
    public void setArg3(Nota value) {
        this.arg3 = value;
    }

}
