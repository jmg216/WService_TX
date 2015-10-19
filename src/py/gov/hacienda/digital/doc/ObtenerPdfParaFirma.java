
package py.gov.hacienda.digital.doc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerPdfParaFirma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerPdfParaFirma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaParametros" type="{http://doc.digital.hacienda.gov.py/}campoTipoValor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cedulaFirmante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPdfParaFirma", propOrder = {
    "tipoDocumento",
    "listaParametros",
    "cedulaFirmante"
})
public class ObtenerPdfParaFirma {

    protected String tipoDocumento;
    protected List<CampoTipoValor> listaParametros;
    protected String cedulaFirmante;

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the listaParametros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaParametros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaParametros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampoTipoValor }
     * 
     * 
     */
    public List<CampoTipoValor> getListaParametros() {
        if (listaParametros == null) {
            listaParametros = new ArrayList<CampoTipoValor>();
        }
        return this.listaParametros;
    }

    /**
     * Gets the value of the cedulaFirmante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaFirmante() {
        return cedulaFirmante;
    }

    /**
     * Sets the value of the cedulaFirmante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaFirmante(String value) {
        this.cedulaFirmante = value;
    }

}
