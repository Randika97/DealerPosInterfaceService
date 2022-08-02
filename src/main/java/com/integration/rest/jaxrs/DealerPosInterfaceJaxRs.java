package com.integration.rest.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.integration.rest.service.DealerPosInterfaceServiceImpl;

import ws.dealerposinterface.service.DecisionResponse;

public class DealerPosInterfaceJaxRs {
	
	@Autowired
	private DealerPosInterfaceServiceImpl dealerPosInterfaceServiceImpl;
	
	@Path("/getDecision/{proposalNumber}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public DecisionResponse test(@PathParam("proposalNumber") long proposalNumber) {
		return dealerPosInterfaceServiceImpl.getDecision(proposalNumber);
	}

}
