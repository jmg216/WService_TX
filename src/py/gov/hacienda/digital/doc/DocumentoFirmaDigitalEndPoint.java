/**
 * DocumentoFirmaDigitalEndPoint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package py.gov.hacienda.digital.doc;

public interface DocumentoFirmaDigitalEndPoint extends java.rmi.Remote {
    public py.gov.hacienda.digital.doc.ResultOperacion guardarPdfFirmado(py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado, java.lang.String cedulaFirmante) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException;
    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaValidar(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException;
    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaFirma(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros, java.lang.String cedulaFirmante) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException;
}
