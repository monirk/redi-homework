package phone;

/**
 * Created by redi on 5/22/17.
 */
public class Factory {
        public Phone createinstance(String type) {
            if ("Mobile Phone".equalsIgnoreCase(type)) {
                return new MobilPhoneImpl();
            }
            if ("IP Phone".equalsIgnoreCase(type)) {
                return new IpTelephoneImpl();
            }
            if ("Smart Phone".equalsIgnoreCase(type)) {
                return new SmartPhoneImpl();
            }
            if ("Fixd Phone".equalsIgnoreCase(type)) {
                return new FixedPhoneImpl();
            }
                return null;
        }
}

