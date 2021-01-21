package com.example;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class AppMain{

	public static void main(String[] args) throws Exception{
		// Con DOM puedo leer documentos XML
		// tambien crear nuevos elementos
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document =  builder.parse("empleados.xml");
		
		Element raiz = document.getDocumentElement();
		
		Element newEmp = document.createElement("empleado");
		
		Element newId = document.createElement("id");
		Text idText = document.createTextNode("00133");
		newId.appendChild(idText);
		
		Element newNombre = document.createElement("nombre");
		Text nombreText = document.createTextNode("Maria Lopez");
		newNombre.appendChild(nombreText);
		
		Element newDireccion = document.createElement("direccion");
		
		Element newCalle = document.createElement("calle");
		Text calleText = document.createTextNode("Castellana");
		newCalle.appendChild(calleText);
		
		Element newCiudad = document.createElement("ciudad");
		Text ciudadText = document.createTextNode("Madrid");
		newCiudad.appendChild(ciudadText);
		
		Element newCP = document.createElement("codigo_postal");
		Text cpText = document.createTextNode("28027");
		newCP.appendChild(cpText);
		
		newDireccion.appendChild(newCalle);
		newDireccion.appendChild(newCiudad);
		newDireccion.appendChild(newCP);
		
		Element newEmail = document.createElement("email");
		Text emailText = document.createTextNode("maria@gmail.com");
		newEmail.appendChild(emailText);
		
		Element newDpto = document.createElement("dpto");
		Text dptoText = document.createTextNode("Campras");
		newDpto.appendChild(dptoText);
		
		Element newSueldo = document.createElement("sueldo");
		Text sueldoText = document.createTextNode("60000");
		newSueldo.appendChild(sueldoText);
		
		newEmp.appendChild(newId);
		newEmp.appendChild(newNombre);
		newEmp.appendChild(newDireccion);
		newEmp.appendChild(newEmail);
		newEmp.appendChild(newDpto);
		newEmp.appendChild(newSueldo);
		
		raiz.appendChild(newEmp);
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		
		DOMSource source = new DOMSource(document);
		StreamResult resultado = new StreamResult("empleados.xml");
		
		transformer.transform(source, resultado);
	}

	
	
	
}









