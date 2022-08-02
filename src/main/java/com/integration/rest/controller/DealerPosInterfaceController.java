package com.integration.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.integration.rest.service.DealerPosInterfaceServiceImpl;

import ws.dealerposinterface.service.DecisionResponse;

@RestController
public class DealerPosInterfaceController {
	
	@Autowired
	private DealerPosInterfaceServiceImpl dealerPosInterfaceServiceImpl;
	
	@GetMapping(value="/getDecision/{proposalNumber}", produces = "application/json")
	public DecisionResponse getDecision(@PathVariable("proposalNumber") long proposalNumber) {
		return dealerPosInterfaceServiceImpl.getDecision(proposalNumber);
	}

}
