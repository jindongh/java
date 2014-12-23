import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;
import java.io.StringReader;

public class Main {
    public static void main(String args[]) throws Exception {
        String xml = new StringBuilder()
            .append("<myConfig>")
            .append(" <name>HankJin</name>")
            .append(" <addressList>")
            .append("  <address>")
            .append("   <number>xxx</number>")
            .append("   <street>Robson</street>")
            .append("  </address>")
            .append("  <address>")
            .append("   <number>xxxx</number>")
            .append("   <street>E xth Ave</street>")
            .append("  </address>")
            .append(" </addressList>")
            .append(" <phone>604xxxxxx5</phone>")
            .append(" <phone>182xxxxxxx9></phone>")
            .append("</myConfig>")
            .toString();
        JAXBContext context = JAXBContext.newInstance(XmlConfig.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Config config = (Config)unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(config.toString());

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(config, System.out);
    }
}
