package com.integration.rest.service;

import org.springframework.stereotype.Service;

import ws.dealerposinterface.service.DecisionResponse;


@Service
public class DealerPosInterfaceServiceImpl {
	public DecisionResponse getDecision(long proposalNumber ) {
		DecisionResponse response = new DecisionResponse();
        response.setStatus("Internal Proposal Number " +proposalNumber);
		return response;
	}

}
