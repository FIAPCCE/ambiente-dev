package br.com.fiap;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRoutBuilder extends RouteBuilder{
	public void configure() throws Exception {
		from("file:/home/ibm/Exercicios/inputFolder?noop=true")
			.to("file:/home/ibm/Exercicios/outputFolder");
	}
}
