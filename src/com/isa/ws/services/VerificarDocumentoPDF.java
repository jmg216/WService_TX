package com.isa.ws.services;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;

import py.gov.hacienda.digital.doc.CampoTipoValor;
import py.gov.hacienda.digital.doc.DocumentoElectronico;
import py.gov.hacienda.digital.doc.WsException;

import com.isa.ws.entities.VerifyResponse;
import com.isa.ws.exceptions.WService_TXException;
import com.isa.ws.trustedx.facade.FacadeServicesTX;
import com.isa.ws.utiles.UtilesSWHelper;
import com.isa.ws.utiles.UtilesWs;

@WebService
public class VerificarDocumentoPDF {

	private static Logger logger = Logger.getLogger(VerificarDocumentoPDF.class);
	
	@WebMethod
	public VerifyResponse validarDocumentoByParams (String tipoDocumento, CampoTipoValor[] listaParametros ) throws WService_TXException{
		logger.info("VerificarDocumentoPDF::validarDocumentoByParams");
		
		VerifyResponse verifyResponse = new VerifyResponse();

		try {
			logger.info("Previo obtenerPDF");
			DocumentoElectronico docElectronico = UtilesWs.getInstancePortWS().obtenerPdfParaValidar(tipoDocumento, listaParametros);
			
			//init validación real
			String artifact = FacadeServicesTX.getServicioAA().login( UtilesSWHelper.getAdminUsuario(), UtilesSWHelper.getAdminPassword() );
			String dataSigned = new String( docElectronico.getObjetoPdf() );
			verifyResponse = FacadeServicesTX.getServicioDSV().verifySignedPdf(artifact, dataSigned);
			FacadeServicesTX.getServicioAA().logut(UtilesSWHelper.getAdminUsuario(), artifact);
				
		} catch (WsException e) {
			e.printStackTrace();
			logger.error("ERROR: " + e.getMessage(), e);
			throw new WService_TXException("Error en servicios para obtener documento.", e.getMessage(), e.getCause());
			
		} catch (RemoteException e) {
			e.printStackTrace();
			logger.error("ERROR: " + e.getMessage(), e);
			throw new WService_TXException("Error en web servicios remotos.", e.getMessage(), e.getCause());
			
		} catch (IOException e) {
			e.printStackTrace();
			logger.error("ERROR: " + e.getMessage(), e);
			throw new WService_TXException("Error accediendo a archivos de configuración.", e.getMessage(), e.getCause());
			
		} catch (ServiceException e) {
			e.printStackTrace();
			logger.error("ERROR: " + e.getMessage(), e);
			throw new WService_TXException("Error services exception.", e.getMessage(), e.getCause());
		}
		return verifyResponse;
	}
	
	@WebMethod
	public VerifyResponse validarDocumentoByDoc( byte[] documento ) throws WService_TXException{
		VerifyResponse verifyResponse = new VerifyResponse();
		try{
			logger.info("VerificarDocumentoPDF::validarDocumentoByDoc");
			
			String artifact = FacadeServicesTX.getServicioAA().login( UtilesSWHelper.getAdminUsuario(), UtilesSWHelper.getAdminPassword() );
			String dataSigned = new String( documento );
			verifyResponse = FacadeServicesTX.getServicioDSV().verifySignedPdf(artifact, dataSigned);
			FacadeServicesTX.getServicioAA().logut(UtilesSWHelper.getAdminUsuario(), artifact);		
			
		}
		catch (IOException e) {
			e.printStackTrace();
			logger.error("ERROR: " + e.getMessage());
			throw new WService_TXException("Error accediendo a archivos de configuración.", e.getMessage(), e.getCause());
			
		}		
		return verifyResponse;		
	}
	
}
