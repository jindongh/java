import java.util.List;
import lombok.Getter;
import lombok.Setter;

class Address {
    @Getter @Setter
    private String number;
    @Getter @Setter
    private String street;
    @Getter @Setter
    private String city;
}

/**
 * normal config used in app
 */
public abstract class Config {
    /**
     * name of user
     */
    public abstract String getName();
    /**
     * addresses of user
     */
    public abstract List<Address> getAddresses();

    /**
     * phones of user
     */
    public abstract List<String> getPhones();

    public String toString() {
        String result = "name:" + getName() + "\n";
        for (Address address : getAddresses()) {
            result += String.format("address: %s %s %s\n", address.getNumber(),
                    address.getStreet(), address.getCity());
        }
        for (String phone : getPhones()) {
            result += "phone:" + phone + "\n";
        }
        return result;
    }
};
