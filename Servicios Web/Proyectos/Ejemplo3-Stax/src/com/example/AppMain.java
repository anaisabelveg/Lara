package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;

public class AppMain {

	public static void main(String[] args) throws Exception{
		// Con Stax puedo leer documentos XML
		// puedo escribir y tambien  modificar
		// Funciona por eventos
		XMLEventFactory factory = XMLEventFactory.newInstance();
		
		FileInputStream fInput = new FileInputStream("empleados.xml");
		XMLEventReader reader = XMLInputFactory.newInstance()
				.createXMLEventReader(fInput);
		
		FileOutputStream fOutput = new FileOutputStream("empleados2.xml");
		XMLEventWriter writer = XMLOutputFactory.newInstance()
				.createXMLEventWriter(fOutput);
		
		while (reader.hasNext()) {
			XMLEvent event = (XMLEvent) reader.next();
			
			if(event.getEventType() == event.CHARACTERS) {
				XMLEvent contenido = event.asCharacters();
				Characters dato = contenido.asCharacters();
				
				if ("Ventas".equalsIgnoreCase(dato.getData())) {
					writer.add(factory.createCharacters("Nuevo Dpto"));
				} else {
					writer.add(event);
				}
			} else {
				writer.add(event);
			}
			writer.flush();		
		}
	}

	
}









