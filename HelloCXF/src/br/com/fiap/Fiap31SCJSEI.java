package br.com.fiap;

import javax.jws.WebService;

@WebService(name = "Fiap31SCJSEI", targetNamespace = "http://fiap.com.br/")
public interface Fiap31SCJSEI {

	String WhatIsTheAnswer(String interviewer);

}