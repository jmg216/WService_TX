/**
 * ObtenerPdfParaFirmaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class ObtenerPdfParaFirmaResponse  implements java.io.Serializable {
    private py.gov.hacienda.digital.doc.DocumentoElectronico resultPdfParaFirma;

    public ObtenerPdfParaFirmaResponse() {
    }

    public ObtenerPdfParaFirmaResponse(
           py.gov.hacienda.digital.doc.DocumentoElectronico resultPdfParaFirma) {
           this.resultPdfParaFirma = resultPdfParaFirma;
    }


    /**
     * Gets the resultPdfParaFirma value for this ObtenerPdfParaFirmaResponse.
     * 
     * @return resultPdfParaFirma
     */
    public py.gov.hacienda.digital.doc.DocumentoElectronico getResultPdfParaFirma() {
        return resultPdfParaFirma;
    }


    /**
     * Sets the resultPdfParaFirma value for this ObtenerPdfParaFirmaResponse.
     * 
     * @param resultPdfParaFirma
     */
    public void setResultPdfParaFirma(py.gov.hacienda.digital.doc.DocumentoElectronico resultPdfParaFirma) {
        this.resultPdfParaFirma = resultPdfParaFirma;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerPdfParaFirmaResponse)) return false;
        ObtenerPdfParaFirmaResponse other = (ObtenerPdfParaFirmaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultPdfParaFirma==null && other.getResultPdfParaFirma()==null) || 
             (this.resultPdfParaFirma!=null &&
              this.resultPdfParaFirma.equals(other.getResultPdfParaFirma())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResultPdfParaFirma() != null) {
            _hashCode += getResultPdfParaFirma().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerPdfParaFirmaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "obtenerPdfParaFirmaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultPdfParaFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultPdfParaFirma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
