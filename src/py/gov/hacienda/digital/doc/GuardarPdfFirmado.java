/**
 * GuardarPdfFirmado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class GuardarPdfFirmado  implements java.io.Serializable {
    private py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado;

    private java.lang.String cedulaFirmante;

    public GuardarPdfFirmado() {
    }

    public GuardarPdfFirmado(
           py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado,
           java.lang.String cedulaFirmante) {
           this.postFirmado = postFirmado;
           this.cedulaFirmante = cedulaFirmante;
    }


    /**
     * Gets the postFirmado value for this GuardarPdfFirmado.
     * 
     * @return postFirmado
     */
    public py.gov.hacienda.digital.doc.DocumentoElectronico getPostFirmado() {
        return postFirmado;
    }


    /**
     * Sets the postFirmado value for this GuardarPdfFirmado.
     * 
     * @param postFirmado
     */
    public void setPostFirmado(py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado) {
        this.postFirmado = postFirmado;
    }


    /**
     * Gets the cedulaFirmante value for this GuardarPdfFirmado.
     * 
     * @return cedulaFirmante
     */
    public java.lang.String getCedulaFirmante() {
        return cedulaFirmante;
    }


    /**
     * Sets the cedulaFirmante value for this GuardarPdfFirmado.
     * 
     * @param cedulaFirmante
     */
    public void setCedulaFirmante(java.lang.String cedulaFirmante) {
        this.cedulaFirmante = cedulaFirmante;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuardarPdfFirmado)) return false;
        GuardarPdfFirmado other = (GuardarPdfFirmado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postFirmado==null && other.getPostFirmado()==null) || 
             (this.postFirmado!=null &&
              this.postFirmado.equals(other.getPostFirmado()))) &&
            ((this.cedulaFirmante==null && other.getCedulaFirmante()==null) || 
             (this.cedulaFirmante!=null &&
              this.cedulaFirmante.equals(other.getCedulaFirmante())));
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
        if (getPostFirmado() != null) {
            _hashCode += getPostFirmado().hashCode();
        }
        if (getCedulaFirmante() != null) {
            _hashCode += getCedulaFirmante().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuardarPdfFirmado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "guardarPdfFirmado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postFirmado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postFirmado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cedulaFirmante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cedulaFirmante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
