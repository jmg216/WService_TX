package com.isa.ws.services;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import py.gov.hacienda.digital.doc.CampoTipoValor;
import py.gov.hacienda.digital.doc.DocumentoElectronico;
import py.gov.hacienda.digital.doc.TipoDato;
import py.gov.hacienda.digital.doc.WsException_Exception;

import com.isa.ws.entities.CampoTipoValorTx;
import com.isa.ws.entities.TipoDatoTx;
import com.isa.ws.entities.VerifyResponse;
import com.isa.ws.exceptions.WService_TXException;
import com.isa.ws.trustedx.facade.FacadeServicesTX;
import com.isa.ws.utiles.UtilesWs;

@WebService
public class VerificarDocumentoPDF {

	private static Logger logger = Logger.getLogger(VerificarDocumentoPDF.class);
	
	@WebMethod
	public VerifyResponse validarDocumentoByParams (String tipoDocumento, CampoTipoValorTx[] listaParametros ) throws WService_TXException{
		logger.info("VerificarDocumentoPDF::validarDocumentoByParams");
		
		VerifyResponse verifyResponse = new VerifyResponse();

		try {
			ArrayList<CampoTipoValor> campotipovalor = null;
			if (listaParametros != null){
				campotipovalor = new ArrayList<CampoTipoValor>();
				for (int i = 0; i < listaParametros.length; i ++){
					CampoTipoValor campotarget = new CampoTipoValor();
					CampoTipoValorTx camposource = listaParametros[i];
					
					campotarget.setCampo( camposource.getCampo() );
					campotarget.setValor( camposource.getValor());
					if (camposource.getTipo().equals(TipoDatoTx.STRING)){
						campotarget.setTipo(TipoDato.STRING);
					}
					else if (camposource.getTipo().equals(TipoDatoTx.INTEGER)){
						campotarget.setTipo(TipoDato.INTEGER);
					}
					else if (camposource.getTipo().equals(TipoDatoTx.DATE)){
						campotarget.setTipo(TipoDato.DATE);
					}
					else if (camposource.getTipo().equals(TipoDatoTx.LONG)){
						campotarget.setTipo(TipoDato.LONG);
					}
					
					campotipovalor.add( campotarget );
				}
			}

			DocumentoElectronico docElectronico = UtilesWs.getInstancePortWS().obtenerPdfParaValidar(tipoDocumento, campotipovalor);
			
			
			DataHandler dh = docElectronico.getObjetoPdf();
			ByteArrayOutputStream buffOS= new ByteArrayOutputStream();
			dh.writeTo(buffOS);
			byte[] buff = buffOS.toByteArray();
			
			byte[] documento = Base64.encodeBase64( buff );
			String dataSigned = new String( documento );
			verifyResponse = FacadeServicesTX.getServicioDSV().verifySignedPdf( dataSigned );
			
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
		catch (WsException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.error("ERROR: " + e.getMessage(), e);
			throw new WService_TXException("Error services exception.", e.getMessage(), e.getCause());
		}
		return verifyResponse;
	}
	
	@WebMethod
	public VerifyResponse validarDocumentoByDoc(byte[] documento ) throws WService_TXException{
		VerifyResponse verifyResponse = new VerifyResponse();

		logger.info("VerificarDocumentoPDF::validarDocumentoByDoc");

		String dataSigned = new String( documento );
		verifyResponse = FacadeServicesTX.getServicioDSV().verifySignedPdf( dataSigned );
		
		return verifyResponse;		
	}
}
