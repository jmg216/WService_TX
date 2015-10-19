
package py.gov.hacienda.digital.doc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for guardarPdfFirmado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guardarPdfFirmado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="postFirmado" type="{http://doc.digital.hacienda.gov.py/}documentoElectronico" minOccurs="0"/>
 *         &lt;element name="cedulaFirmante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFirmaCliente" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarPdfFirmado", propOrder = {
    "postFirmado",
    "cedulaFirmante",
    "fechaFirmaCliente"
})
public class GuardarPdfFirmado {

    protected DocumentoElectronico postFirmado;
    protected String cedulaFirmante;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFirmaCliente;

    /**
     * Gets the value of the postFirmado property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoElectronico }
     *     
     */
    public DocumentoElectronico getPostFirmado() {
        return postFirmado;
    }

    /**
     * Sets the value of the postFirmado property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoElectronico }
     *     
     */
    public void setPostFirmado(DocumentoElectronico value) {
        this.postFirmado = value;
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

    /**
     * Gets the value of the fechaFirmaCliente property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFirmaCliente() {
        return fechaFirmaCliente;
    }

    /**
     * Sets the value of the fechaFirmaCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFirmaCliente(XMLGregorianCalendar value) {
        this.fechaFirmaCliente = value;
    }

}
