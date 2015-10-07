/**
 * GuardarPdfFirmadoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class GuardarPdfFirmadoResponse  implements java.io.Serializable {
    private py.gov.hacienda.digital.doc.ResultOperacion resultPdfFirmado;

    public GuardarPdfFirmadoResponse() {
    }

    public GuardarPdfFirmadoResponse(
           py.gov.hacienda.digital.doc.ResultOperacion resultPdfFirmado) {
           this.resultPdfFirmado = resultPdfFirmado;
    }


    /**
     * Gets the resultPdfFirmado value for this GuardarPdfFirmadoResponse.
     * 
     * @return resultPdfFirmado
     */
    public py.gov.hacienda.digital.doc.ResultOperacion getResultPdfFirmado() {
        return resultPdfFirmado;
    }


    /**
     * Sets the resultPdfFirmado value for this GuardarPdfFirmadoResponse.
     * 
     * @param resultPdfFirmado
     */
    public void setResultPdfFirmado(py.gov.hacienda.digital.doc.ResultOperacion resultPdfFirmado) {
        this.resultPdfFirmado = resultPdfFirmado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuardarPdfFirmadoResponse)) return false;
        GuardarPdfFirmadoResponse other = (GuardarPdfFirmadoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultPdfFirmado==null && other.getResultPdfFirmado()==null) || 
             (this.resultPdfFirmado!=null &&
              this.resultPdfFirmado.equals(other.getResultPdfFirmado())));
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
        if (getResultPdfFirmado() != null) {
            _hashCode += getResultPdfFirmado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuardarPdfFirmadoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "guardarPdfFirmadoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultPdfFirmado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultPdfFirmado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "resultOperacion"));
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
