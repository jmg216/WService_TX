/**
 * DocumentoElectronico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class DocumentoElectronico  implements java.io.Serializable {
    private byte[] objetoPdf;

    private java.lang.Object[] parametros;

    private java.lang.String tipoDocumento;

    public DocumentoElectronico() {
    }

    public DocumentoElectronico(
           byte[] objetoPdf,
           java.lang.Object[] parametros,
           java.lang.String tipoDocumento) {
           this.objetoPdf = objetoPdf;
           this.parametros = parametros;
           this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the objetoPdf value for this DocumentoElectronico.
     * 
     * @return objetoPdf
     */
    public byte[] getObjetoPdf() {
        return objetoPdf;
    }


    /**
     * Sets the objetoPdf value for this DocumentoElectronico.
     * 
     * @param objetoPdf
     */
    public void setObjetoPdf(byte[] objetoPdf) {
        this.objetoPdf = objetoPdf;
    }


    /**
     * Gets the parametros value for this DocumentoElectronico.
     * 
     * @return parametros
     */
    public java.lang.Object[] getParametros() {
        return parametros;
    }


    /**
     * Sets the parametros value for this DocumentoElectronico.
     * 
     * @param parametros
     */
    public void setParametros(java.lang.Object[] parametros) {
        this.parametros = parametros;
    }

    public java.lang.Object getParametros(int i) {
        return this.parametros[i];
    }

    public void setParametros(int i, java.lang.Object _value) {
        this.parametros[i] = _value;
    }


    /**
     * Gets the tipoDocumento value for this DocumentoElectronico.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this DocumentoElectronico.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentoElectronico)) return false;
        DocumentoElectronico other = (DocumentoElectronico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objetoPdf==null && other.getObjetoPdf()==null) || 
             (this.objetoPdf!=null &&
              java.util.Arrays.equals(this.objetoPdf, other.getObjetoPdf()))) &&
            ((this.parametros==null && other.getParametros()==null) || 
             (this.parametros!=null &&
              java.util.Arrays.equals(this.parametros, other.getParametros()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento())));
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
        if (getObjetoPdf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjetoPdf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjetoPdf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParametros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParametros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParametros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentoElectronico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "documentoElectronico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objetoPdf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objetoPdf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
