import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "myConfig")
public class XmlConfig extends Config {
    /**
     * name of user
     */
    @XmlElement(name = "name") @Getter @Setter
    private String name;

    /**
     * address of user
     */
    @XmlElementWrapper(name = "addressList")
    @XmlElement(name = "address") @Getter @Setter
    private List<Address> addresses;

    @XmlElement(name = "phone") @Getter @Setter
    private List<String> phones;
}
