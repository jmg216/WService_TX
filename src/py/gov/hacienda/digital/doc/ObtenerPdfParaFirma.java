/**
 * ObtenerPdfParaFirma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class ObtenerPdfParaFirma  implements java.io.Serializable {
    private java.lang.String tipoDocumento;

    private py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros;

    private java.lang.String cedulaFirmante;

    public ObtenerPdfParaFirma() {
    }

    public ObtenerPdfParaFirma(
           java.lang.String tipoDocumento,
           py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros,
           java.lang.String cedulaFirmante) {
           this.tipoDocumento = tipoDocumento;
           this.listaParametros = listaParametros;
           this.cedulaFirmante = cedulaFirmante;
    }


    /**
     * Gets the tipoDocumento value for this ObtenerPdfParaFirma.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this ObtenerPdfParaFirma.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the listaParametros value for this ObtenerPdfParaFirma.
     * 
     * @return listaParametros
     */
    public py.gov.hacienda.digital.doc.CampoTipoValor[] getListaParametros() {
        return listaParametros;
    }


    /**
     * Sets the listaParametros value for this ObtenerPdfParaFirma.
     * 
     * @param listaParametros
     */
    public void setListaParametros(py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros) {
        this.listaParametros = listaParametros;
    }

    public py.gov.hacienda.digital.doc.CampoTipoValor getListaParametros(int i) {
        return this.listaParametros[i];
    }

    public void setListaParametros(int i, py.gov.hacienda.digital.doc.CampoTipoValor _value) {
        this.listaParametros[i] = _value;
    }


    /**
     * Gets the cedulaFirmante value for this ObtenerPdfParaFirma.
     * 
     * @return cedulaFirmante
     */
    public java.lang.String getCedulaFirmante() {
        return cedulaFirmante;
    }


    /**
     * Sets the cedulaFirmante value for this ObtenerPdfParaFirma.
     * 
     * @param cedulaFirmante
     */
    public void setCedulaFirmante(java.lang.String cedulaFirmante) {
        this.cedulaFirmante = cedulaFirmante;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerPdfParaFirma)) return false;
        ObtenerPdfParaFirma other = (ObtenerPdfParaFirma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento()))) &&
            ((this.listaParametros==null && other.getListaParametros()==null) || 
             (this.listaParametros!=null &&
              java.util.Arrays.equals(this.listaParametros, other.getListaParametros()))) &&
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
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        if (getListaParametros() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaParametros());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaParametros(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCedulaFirmante() != null) {
            _hashCode += getCedulaFirmante().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerPdfParaFirma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "obtenerPdfParaFirma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaParametros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaParametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "campoTipoValor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
