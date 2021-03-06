package py.gov.hacienda.digital.doc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2015-10-15T14:51:17.970-02:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "http://doc.digital.hacienda.gov.py/", name = "DocumentoFirmaDigitalEndPoint")
@XmlSeeAlso({ObjectFactory.class})
public interface DocumentoFirmaDigitalEndPoint {

    @WebResult(name = "resultPdfFirmado", targetNamespace = "")
    @RequestWrapper(localName = "guardarPdfFirmado", targetNamespace = "http://doc.digital.hacienda.gov.py/", className = "py.gov.hacienda.digital.doc.GuardarPdfFirmado")
    @WebMethod
    @ResponseWrapper(localName = "guardarPdfFirmadoResponse", targetNamespace = "http://doc.digital.hacienda.gov.py/", className = "py.gov.hacienda.digital.doc.GuardarPdfFirmadoResponse")
    public py.gov.hacienda.digital.doc.ResultOperacion guardarPdfFirmado(
        @WebParam(name = "postFirmado", targetNamespace = "")
        py.gov.hacienda.digital.doc.DocumentoElectronico postFirmado,
        @WebParam(name = "cedulaFirmante", targetNamespace = "")
        java.lang.String cedulaFirmante,
        @WebParam(name = "fechaFirmaCliente", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar fechaFirmaCliente
    ) throws WsException_Exception;

    @RequestWrapper(localName = "quitarReserva", targetNamespace = "http://doc.digital.hacienda.gov.py/", className = "py.gov.hacienda.digital.doc.QuitarReserva")
    @WebMethod
    @ResponseWrapper(localName = "quitarReservaResponse", targetNamespace = "http://doc.digital.hacienda.gov.py/", className = "py.gov.hacienda.digital.doc.QuitarReservaResponse")
    public void quitarReserva(
        @WebParam(name = "arg0", targetNamespace = "")
        py.gov.hacienda.digital.doc.DocumentoElectronico arg0
    );

    @WebResult(name = "resultPdfParaValidar", targetNamespace = "")
    @RequestWrapper(localName = "obtenerPdfParaValidar", targetNamespace = "http://doc.digital.hacienda.gov.py/", className = "py.gov.hacienda.digital.doc.ObtenerPdfParaValidar")
    @WebMethod
    @ResponseWrapper(localName = "obtenerPdfParaValidarResponse", targetNamespace = "http://doc.digital.hacienda.gov.py/", className = "py.gov.hacienda.digital.doc.ObtenerPdfParaValidarResponse")
    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaValidar(
        @WebParam(name = "tipoDocumento", targetNamespace = "")
        java.lang.String tipoDocumento,
        @WebParam(name = "listaParametros", targetNamespace = "")
        java.util.List<py.gov.hacienda.digital.doc.CampoTipoValor> listaParametros
    ) throws WsException_Exception;

    @WebResult(name = "resultPdfParaFirma", targetNamespace = "")
    @RequestWrapper(localName = "obtenerPdfParaFirma", targetNamespace = "http://doc.digital.hacienda.gov.py/", className = "py.gov.hacienda.digital.doc.ObtenerPdfParaFirma")
    @WebMethod
    @ResponseWrapper(localName = "obtenerPdfParaFirmaResponse", targetNamespace = "http://doc.digital.hacienda.gov.py/", className = "py.gov.hacienda.digital.doc.ObtenerPdfParaFirmaResponse")
    public py.gov.hacienda.digital.doc.DocumentoElectronico obtenerPdfParaFirma(
        @WebParam(name = "tipoDocumento", targetNamespace = "")
        java.lang.String tipoDocumento,
        @WebParam(name = "listaParametros", targetNamespace = "")
        java.util.List<py.gov.hacienda.digital.doc.CampoTipoValor> listaParametros,
        @WebParam(name = "cedulaFirmante", targetNamespace = "")
        java.lang.String cedulaFirmante
    ) throws WsException_Exception;
}
