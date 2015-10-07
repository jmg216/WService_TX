package com.isa.ws.utiles;

import java.io.IOException;
import java.net.URL;

import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;

import py.gov.hacienda.digital.doc.DocumentoFirmaDigitalEndPoint;
import py.gov.hacienda.digital.doc.DocumentoFirmaDigitalService;
import py.gov.hacienda.digital.doc.DocumentoFirmaDigitalServiceLocator;

public class UtilesWs {

	
    private static DocumentoFirmaDigitalEndPoint port = null;
    public static int CODIGO_RESPUESTA_ERROR = -1; 
    public static int CODIGO_RESPUESTA_OK = 1; 
    
    public static DocumentoFirmaDigitalEndPoint getInstancePortWS() throws IOException, ServiceException{
    	
        if (port == null){
            URL wsdllocation = new URL(UtilesResources.getProperty(UtilesResources.PROP_WS_ENDPOINT));
            DocumentoFirmaDigitalService serviceRes = new DocumentoFirmaDigitalServiceLocator( );
            port = serviceRes.getDocumentoFirmaDigitalEndPointPort(wsdllocation);
//          BindingProvider bindingProvider = (BindingProvider) port; 
//          bindingProvider.getRequestContext().put( BindingProvider.ENDPOINT_ADDRESS_PROPERTY, UtilesResources.getProperty(UtilesResources.PROP_WS_ENDPOINT) );
            if (UtilesResources.TRUE_VALUE.equals(UtilesResources.getProperty(UtilesResources.PROP_WS_AUTH))){
//                bindingProvider.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, UtilesResources.getProperty(UtilesResources.PROP_WS_USER));
//                bindingProvider.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, UtilesResources.getProperty(UtilesResources.PROP_WS_PASSWD));
            }
        }
        return port;
        
    }	
	
}
