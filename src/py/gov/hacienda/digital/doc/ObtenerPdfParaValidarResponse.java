
package py.gov.hacienda.digital.doc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerPdfParaValidarResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerPdfParaValidarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultPdfParaValidar" type="{http://doc.digital.hacienda.gov.py/}documentoElectronico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPdfParaValidarResponse", propOrder = {
    "resultPdfParaValidar"
})
public class ObtenerPdfParaValidarResponse {

    protected DocumentoElectronico resultPdfParaValidar;

    /**
     * Gets the value of the resultPdfParaValidar property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoElectronico }
     *     
     */
    public DocumentoElectronico getResultPdfParaValidar() {
        return resultPdfParaValidar;
    }

    /**
     * Sets the value of the resultPdfParaValidar property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoElectronico }
     *     
     */
    public void setResultPdfParaValidar(DocumentoElectronico value) {
        this.resultPdfParaValidar = value;
    }

}
