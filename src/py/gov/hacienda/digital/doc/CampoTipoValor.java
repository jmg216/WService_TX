
package py.gov.hacienda.digital.doc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for campoTipoValor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="campoTipoValor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://doc.digital.hacienda.gov.py/}tipoDato" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "campoTipoValor", propOrder = {
    "campo",
    "tipo",
    "valor"
})
public class CampoTipoValor {

    protected String campo;
    protected TipoDato tipo;
    protected String valor;

    /**
     * Gets the value of the campo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampo() {
        return campo;
    }

    /**
     * Sets the value of the campo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampo(String value) {
        this.campo = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDato }
     *     
     */
    public TipoDato getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDato }
     *     
     */
    public void setTipo(TipoDato value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

}
