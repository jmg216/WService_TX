/**
 * TipoDato.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public class TipoDato implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    protected TipoDato(){
    	
    }
    
    // Constructor
    protected TipoDato(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INTEGER = "INTEGER";
    public static final java.lang.String _LONG = "LONG";
    public static final java.lang.String _STRING = "STRING";
    public static final java.lang.String _DATE = "DATE";
    public static final TipoDato INTEGER = new TipoDato(_INTEGER);
    public static final TipoDato LONG = new TipoDato(_LONG);
    public static final TipoDato STRING = new TipoDato(_STRING);
    public static final TipoDato DATE = new TipoDato(_DATE);
    public java.lang.String getValue() { return _value_;}
    public static TipoDato fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoDato enumeration = (TipoDato)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoDato fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoDato.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://doc.digital.hacienda.gov.py/", "tipoDato"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
