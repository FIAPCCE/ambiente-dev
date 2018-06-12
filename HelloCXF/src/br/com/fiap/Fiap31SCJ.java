package br.com.fiap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://fiap.com.br/", endpointInterface = "br.com.fiap.Fiap31SCJSEI", portName = "Fiap31SCJPort", serviceName = "Fiap31SCJService")
public class Fiap31SCJ implements Fiap31SCJSEI {
	public String WhatIsTheAnswer(String interviewer) {
		return "The answer, " + interviewer + " is 42";
	}
}
