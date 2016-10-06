package fr.inria.diverse.melange.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Helper to edit plugin.xml files
 */
public class PluginXmlChanger {
	
	String filepath;
	Document doc;
	
	public void load(String fileLocation){
		filepath = fileLocation;
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		try {
			docBuilder = docFactory.newDocumentBuilder();
			doc = docBuilder.parse(filepath);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param identSize Number of white spaces used for indentation
	 */
	public void save(int indentSize){
		if(doc != null){
			removeEmptyNodes(); //clean up before saving
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer;
			try {
				transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(indentSize));
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(filepath));
				transformer.transform(source, result);
			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void removeEmptyNodes(){
		try {
			// XPath to find empty text nodes.
			XPathFactory xpathFactory = XPathFactory.newInstance();	
			XPathExpression xpathExp = xpathFactory.newXPath().compile(
			    	"//text()[normalize-space(.) = '']");
			NodeList emptyTextNodes = (NodeList) 
					xpathExp.evaluate(doc, XPathConstants.NODESET);
			
			// Remove each empty text node from document.
			for (int i = 0; i < emptyTextNodes.getLength(); i++) {
				Node emptyTextNode = emptyTextNodes.item(i);
				emptyTextNode.getParentNode().removeChild(emptyTextNode);
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}  
	}
	
	public List<Node> getExtensions(String point){
		List<Node> res = new ArrayList<Node>();
		if(doc != null) {
			NodeList extensions = doc.getElementsByTagName("extension");
			for(int i = 0; i < extensions.getLength(); i++){
				Node node = extensions.item(i);
				if(isMatching(node,point)){
					res.add(node);
				}
			}
		}
		
		return res;
	}
	
	private boolean isMatching(Node extension, String point){
		NamedNodeMap attributes = extension.getAttributes();
		String comparedPoint = attributes.getNamedItem("point").getNodeValue();
		return comparedPoint.equals(point);
	}
	
	public void deleteExtensions(String point){
		if(doc != null) {
			Node pluginTag = doc.getElementsByTagName("plugin").item(0);
			
			List<Node> toRemove = getExtensions(point);
			for (Node node : toRemove) {
				pluginTag.removeChild(node);
			}
		}
	}
	
	public Element addExtension(String point){
		if(doc != null) {
			Node pluginTag = doc.getElementsByTagName("plugin").item(0);
			
			Element newExtension = doc.createElement("extension");
			Attr attr = doc.createAttribute("point");
			attr.setNodeValue(point);
			newExtension.getAttributes().setNamedItem(attr);
			
			pluginTag.appendChild(newExtension);
			
			return newExtension;
		}
		return null;
	}
	
	public Attr addAttribute(Element tag, String name, String value){
		if(doc != null) {
			Attr attr = doc.createAttribute(name);
			attr.setNodeValue(value);
			tag.getAttributes().setNamedItem(attr);
			return attr;
		}
		return null;
	}
	
	public Element addChild(Element tag, String name){
		if(doc != null) {
			Element child = doc.createElement(name);
			tag.appendChild(child);
			return child;
		}
		return null;
	}
}
