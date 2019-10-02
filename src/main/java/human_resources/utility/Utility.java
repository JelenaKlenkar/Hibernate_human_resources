/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.w3c.dom.Document;

/**
 *
 * @author Jelena
 */
public class Utility {

    public static String getNameOfApplication() {
        return "Human resources APP V1";
    }

    public static String getFormatDateAndTime() {
        return "dd. MM. YYYY. HH:mm:ss";
    }

    public static boolean isDev() {
        return true;
    }

    public static String getPersonalIdentificationNumber() {
        String html
                = Utility.loadURL("http://oib.itcentrala.com/oib-generator/");
        if (html == null) {
            return null;
        }

        TagNode root = new HtmlCleaner().clean(html);

        try {
            Document doc = new DomSerializer(new CleanerProperties()).createDOM(root);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String oib = (String) xPath.evaluate("/html/body/div[1]/div[1]/text()",
                    doc, XPathConstants.STRING);
            return oib;
        } catch (Exception ex) {

        }

        return null;

    }

    private static String loadURL(String address) {
        try {
            URL url = new URL(address);
            InputStreamReader isr = new InputStreamReader(url.openStream(),"UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line;
            StringBuilder sb = new StringBuilder();
            
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                
            }
            return sb.toString();
           
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
