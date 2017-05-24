package phone;

/**
 * Created by redi on 5/22/17.
 */
public interface SmartPhone extends MobilPhone  {
    void connectWithInternet();
    void installApp();
    void turnWLANon();
    void turnWLANoff();
}
