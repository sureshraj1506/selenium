package Selenium;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import Selenium.Constants;

public class ReadXmlFile {

	private static Element eElement;
	private Constants datas;
	private Log log = LogFactory.getLog(getClass());
	private static final String UsrInfConst="./src/main/resources/userinfo.xml";
	
	
	public ReadXmlFile() {
	
	
		log.info("@ReadXMLFile Constructor::loading *****Constants******");
		
		
	}

	public void Constansts(String properties){
		
		try {
			File fXmlFile = new File(properties);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

		
			NodeList nList = doc.getElementsByTagName("Selenium");
			

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					eElement = (Element) nNode;

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public void loadConstants() {
		Constansts(UsrInfConst);
		
	}
	
	public String getValue(String elementName) {

		NodeList nlList = eElement.getElementsByTagName(elementName).item(0)
				.getChildNodes();
		Node nValue = (Node) nlList.item(0);		
		if(nValue==null){
			 return null; 
		  }

		return nValue.getNodeValue();
	}


}