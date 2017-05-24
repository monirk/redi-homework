package phone;

/**
 * Created by redi on 5/22/17.
 */
public interface MobilPhone extends Phone {
    void sendSMS(String sms,String name);
    void reciveSMS(String name);
}
