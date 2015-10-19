package com.isa.ws.trustedx.dsv;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.isa.ws.entities.Signature;
import com.isa.ws.entities.VerifyResponse;
import com.isa.ws.exceptions.WService_TXException;
import com.isa.ws.utiles.UtilesMsg;
import com.isa.ws.utiles.UtilesSWHelper;
import com.safelayer.trustedx.client.smartwrapper.Constants;
import com.safelayer.trustedx.client.smartwrapper.SmartSignatureResult;
import com.safelayer.trustedx.client.smartwrapper.SmartVerifyRequest;
import com.safelayer.trustedx.client.smartwrapper.SmartVerifyResponse;


public class ServicioDSV {


    public VerifyResponse verifySignedPdf(String artifact, String dataSigned) throws WService_TXException {
        try{
            SmartVerifyRequest iReq = new SmartVerifyRequest( UtilesSWHelper.getURLTrustedX() );
            iReq.setHeader( UtilesSWHelper.crearSmartHeader( artifact ));
            iReq.setProfile(Constants.Profile.PDF);
            iReq.setInputPdfBase64Data(dataSigned);

            SmartVerifyResponse iResp = iReq.send();
            
            VerifyResponse verifyResponse = new VerifyResponse();
            
            if (UtilesSWHelper.RESULTMAJOR_SUCCESS_FIRMA.equals(iResp.getResultMajor()) && 
                    (UtilesSWHelper.RESULTMINOR_SUCCESS_VERIFY.equals(iResp.getResultMinor()) ||
                    UtilesSWHelper.RESULTMINOR_SUCCESS_VERIFY_MULTISIGN_PDF.equals(iResp.getResultMinor()))){
            	System.out.println("FIRMAS VALIDAS");
            	verifyResponse.setSignatures( getSignatures(iResp));
            	verifyResponse.setValida(true);
            }
            else{
            	System.out.println("FIRMAS NO VALIDAS");
            	verifyResponse.setValida(false);
            	verifyResponse.setSignatures( getSignatures(iResp));
            }
            return verifyResponse;
        }  
        catch(Exception ex){
            Logger.getLogger(ServicioDSV.class.getName()).log(Level.ERROR, null, ex);
            throw new WService_TXException(UtilesMsg.ERROR_VALIDAR_FIRMA, ex.getMessage(), ex.getCause());                         
        } 
    }
    
    
    private Signature[] getSignatures( SmartVerifyResponse iresp ) throws Exception{
    	
    	Signature[] arrsing = new Signature[iresp.getNumberSignatures()]; 
    	
    	for (int i = 0; i < iresp.getNumberSignatures(); i++){
    		SmartSignatureResult signatureResponse = iresp.getSignature(i);
    		Signature signature = new Signature();
    		signature.setFecha( signatureResponse.getSigningTime() );
    		signature.setCn(UtilesSWHelper.getCN(signatureResponse.getSignerIdentity()));
    		signature.setVerify(UtilesSWHelper.verifySmartSignature(signatureResponse));
    		
    		arrsing[i] = signature;
    	}
    	return arrsing;
    }
    
    
}
