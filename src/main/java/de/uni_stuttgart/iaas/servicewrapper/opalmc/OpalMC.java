package de.uni_stuttgart.iaas.servicewrapper.opalmc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2019-03-27T13:49:03.084+01:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/", name = "opalMC")
@XmlSeeAlso({ObjectFactory.class})
public interface OpalMC {

    @WebMethod(action = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/runOpalMC")
    @RequestWrapper(localName = "runOpalMC", targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/", className = "de.uni_stuttgart.iaas.servicewrapper.opalmc.RunOpalMC")
    @ResponseWrapper(localName = "runOpalMCResponse", targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/", className = "de.uni_stuttgart.iaas.servicewrapper.opalmc.RunOpalMCResponse")
    public void runOpalMC(
        @WebParam(name = "simulationIdentifier", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TSimulationIdentifier simulationIdentifier,
        @WebParam(name = "replyToCallbackAddress", targetNamespace = "")
        java.lang.String replyToCallbackAddress,
        @WebParam(name = "dataModelRef", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataModelReference dataModelRef,
        @WebParam(name = "opalInput", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataElementRef opalInput,
        @WebParam(name = "opalBccLattice", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataElementRef opalBccLattice,
        @WebParam(name = "numberOfSnapshots", targetNamespace = "")
        int numberOfSnapshots,
        @WebParam(name = "resultSnapshots", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataElementRef resultSnapshots,
        @WebParam(name = "resultSaturation", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataElementRef resultSaturation,
        @WebParam(name = "resultReport", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataElementRef resultReport,
        @WebParam(mode = WebParam.Mode.OUT, name = "simulationID", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> simulationID,
        @WebParam(mode = WebParam.Mode.OUT, name = "started", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Boolean> started,
        @WebParam(mode = WebParam.Mode.OUT, name = "message", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> message
    );

    @WebMethod(action = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/prepareOpalMCInputs")
    @RequestWrapper(localName = "prepareOpalMCInputs", targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/", className = "de.uni_stuttgart.iaas.servicewrapper.opalmc.PrepareOpalMCInputs")
    @ResponseWrapper(localName = "prepareOpalMCInputsResponse", targetNamespace = "http://www.uni-stuttgart.de/iaas/serviceWrapper/opalMC/", className = "de.uni_stuttgart.iaas.servicewrapper.opalmc.PrepareOpalMCInputsResponse")
    public void prepareOpalMCInputs(
        @WebParam(name = "simulationIdentifier", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TSimulationIdentifier simulationIdentifier,
        @WebParam(name = "replyToCallbackAddress", targetNamespace = "")
        java.lang.String replyToCallbackAddress,
        @WebParam(name = "dataModelRef", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataModelReference dataModelRef,
        @WebParam(name = "energyConfiguration", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataElementRef energyConfiguration,
        @WebParam(name = "lx", targetNamespace = "")
        int lx,
        @WebParam(name = "ly", targetNamespace = "")
        int ly,
        @WebParam(name = "lz", targetNamespace = "")
        int lz,
        @WebParam(name = "numberOfSnapshots", targetNamespace = "")
        int numberOfSnapshots,
        @WebParam(name = "snapshotFrequency", targetNamespace = "")
        int snapshotFrequency,
        @WebParam(name = "checkpointFrequency", targetNamespace = "")
        int checkpointFrequency,
        @WebParam(name = "resultOpalInput", targetNamespace = "")
        de.uni_stuttgart.iaas.servicewrapper.opalmc.TDataElementRef resultOpalInput,
        @WebParam(mode = WebParam.Mode.OUT, name = "simulationID", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> simulationID,
        @WebParam(mode = WebParam.Mode.OUT, name = "prepared", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.Boolean> prepared,
        @WebParam(mode = WebParam.Mode.OUT, name = "message", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> message
    );
}
