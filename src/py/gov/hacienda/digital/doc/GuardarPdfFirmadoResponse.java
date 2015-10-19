
package py.gov.hacienda.digital.doc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guardarPdfFirmadoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guardarPdfFirmadoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultPdfFirmado" type="{http://doc.digital.hacienda.gov.py/}resultOperacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarPdfFirmadoResponse", propOrder = {
    "resultPdfFirmado"
})
public class GuardarPdfFirmadoResponse {

    protected ResultOperacion resultPdfFirmado;

    /**
     * Gets the value of the resultPdfFirmado property.
     * 
     * @return
     *     possible object is
     *     {@link ResultOperacion }
     *     
     */
    public ResultOperacion getResultPdfFirmado() {
        return resultPdfFirmado;
    }

    /**
     * Sets the value of the resultPdfFirmado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOperacion }
     *     
     */
    public void setResultPdfFirmado(ResultOperacion value) {
        this.resultPdfFirmado = value;
    }

}
