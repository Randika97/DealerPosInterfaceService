package com.integration.rest.soap;


import org.springframework.beans.factory.annotation.Autowired;

import com.integration.rest.service.DealerPosInterfaceServiceImpl;

import ws.dealerposinterface.service.DealerPosInterfaceService;
import ws.dealerposinterface.service.DecisionRequest;
import ws.dealerposinterface.service.DecisionResponse;


@javax.jws.WebService(serviceName = "DealerPosInterfaceService",
portName = "DealerPosInterfaceService",
targetNamespace = "ws/dealerposinterface/service",
wsdlLocation = "classpath:wsdl/DealerPosInterface.wsdl",
endpointInterface = "ws.dealerposinterface.service.DealerPosInterfaceService")
public class DealerPosInterfaceServiceSOAPBindingImpl implements DealerPosInterfaceService{
	
	@Autowired
	private DealerPosInterfaceServiceImpl dealerPosInterfaceServiceImpl;

//	@Override
//	public DecisionResponse getDecision(DecisionRequest request) {
//		DecisionResponse response = new DecisionResponse();
//		response.setStatus("Internal Proposal Number " +request.getInternalProposalNumber());
//        return response;
//	}

	@Override
	public DecisionResponse getDecision(DecisionRequest request) {
        return dealerPosInterfaceServiceImpl.getDecision(request.getInternalProposalNumber());
	}
}
