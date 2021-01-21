package com.example;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AppMain extends DefaultHandler{

	public static void main(String[] args) throws Exception{
		// Con SAX solo puedo leer documentos XML
		// no los puedo escribir, ni modificar
		// Funciona por eventos
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		saxParser.parse("empleados.xml", new AppMain());
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Empezamos a leer empleados.xml");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("Terminamos de leer empleados.xml");
	}

	@Override
	public void startElement(String uri, String localName, 
			String qName, Attributes attributes) throws SAXException {
		System.out.println("Procesando " + qName);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("Fin " + qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contenido = new String(ch, start, length);
		System.out.println(contenido);
	}
	
	
	
}









