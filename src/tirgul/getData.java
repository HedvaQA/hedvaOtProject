package tirgul;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class getData{
public static String getDataURL (String URL) {

        File configXmlFile = new File("C:\\Users\\or\\Documents\\hedvaL\\test.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = null;
        try{
        dBuilder = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
        e.printStackTrace();
        }
        Document doc = null;
        try {
        assert dBuilder != null;
        doc = dBuilder.parse(configXmlFile);
        } catch (SAXException | IOException e) {
        e.printStackTrace();
        }
        if (doc != null) {
        doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(URL).item(0).getTextContent();
        }

}

