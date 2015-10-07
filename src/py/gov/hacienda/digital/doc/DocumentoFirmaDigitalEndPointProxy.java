package py.gov.hacienda.digital.doc;

public class DocumentoFirmaDigitalEndPointProxy implements py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint {
  private String _endpoint = null;
  private py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint documentoFirmaDigitalEndPoint = null;
  
  public DocumentoFirmaDigitalEndPointProxy() {
    _initDocumentoFirmaDigitalEndPointProxy();
  }
  
  public DocumentoFirmaDigitalEndPointProxy(String endpoint) {
    _endpoint = endpoint;
    _initDocumentoFirmaDigitalEndPointProxy();
  }
  
  private void _initDocumentoFirmaDigitalEndPointProxy() {
    try {
      documentoFirmaDigitalEndPoint = (new py.gov.hacienda.digital.doc.DocumentoFirmaDigitalServiceLocator()).getDocumentoFirmaDigitalEndPointPort();
      if (documentoFirmaDigitalEndPoint != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)documentoFirmaDigitalEndPoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)documentoFirmaDigitalEndPoint)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (documentoFirmaDigitalEndPoint != null)
      ((javax.xml.rpc.Stub)documentoFirmaDigitalEndPoint)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint getDocumentoFirmaDigitalEndPoint() {
    if (documentoFirmaDigitalEndPoint == null)
      _initDocumentoFirmaDigitalEndPointProxy();
    return documentoFirmaDigitalEndPoint;
  }
  
  public py.gov.hacienda.digital.doc.ResultOperacion guardarPdfFirmado(py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado, java.lang.String cedulaFirmante) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException{
    if (documentoFirmaDigitalEndPoint == null)
      _initDocumentoFirmaDigitalEndPointProxy();
    return documentoFirmaDigitalEndPoint.guardarPdfFirmado(postFirmado, cedulaFirmante);
  }
  
  public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaValidar(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException{
    if (documentoFirmaDigitalEndPoint == null)
      _initDocumentoFirmaDigitalEndPointProxy();
    return documentoFirmaDigitalEndPoint.obtenerPdfParaValidar(tipoDocumento, listaParametros);
  }
  
  public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaFirma(java.lang.String tipoDocumento, py.gov.hacienda.digital.doc.CampoTipoValor[] listaParametros, java.lang.String cedulaFirmante) throws java.rmi.RemoteException, py.gov.hacienda.digital.doc.WsException{
    if (documentoFirmaDigitalEndPoint == null)
      _initDocumentoFirmaDigitalEndPointProxy();
    return documentoFirmaDigitalEndPoint.obtenerPdfParaFirma(tipoDocumento, listaParametros, cedulaFirmante);
  }
  
  
}