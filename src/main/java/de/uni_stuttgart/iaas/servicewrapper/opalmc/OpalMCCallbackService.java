package de.uni_stuttgart.iaas.servicewrapper.opalmc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2019-03-27T13:49:03.107+01:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "OpalMCCallbackService", 
                  wsdlLocation = "file:/D:/TraDE/GitHub/trade-opalMC-wrapper/src/main/resources/opalMC.wsdl",
                  targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/") 
public class OpalMCCallbackService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/", "OpalMCCallbackService");
    public final static QName OpalMCCallbackServicePort = new QName("http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/", "OpalMCCallbackServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/TraDE/GitHub/trade-opalMC-wrapper/src/main/resources/opalMC.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OpalMCCallbackService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/TraDE/GitHub/trade-opalMC-wrapper/src/main/resources/opalMC.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OpalMCCallbackService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OpalMCCallbackService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OpalMCCallbackService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public OpalMCCallbackService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OpalMCCallbackService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OpalMCCallbackService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns OpalMCCallback
     */
    @WebEndpoint(name = "OpalMCCallbackServicePort")
    public OpalMCCallback getOpalMCCallbackServicePort() {
        return super.getPort(OpalMCCallbackServicePort, OpalMCCallback.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OpalMCCallback
     */
    @WebEndpoint(name = "OpalMCCallbackServicePort")
    public OpalMCCallback getOpalMCCallbackServicePort(WebServiceFeature... features) {
        return super.getPort(OpalMCCallbackServicePort, OpalMCCallback.class, features);
    }

}
