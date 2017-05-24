package phone;

/**
 * Created by redi on 5/22/17.
 */
public interface IpTelephone extends FixedPhone {
    void sendData(String name);
    void launchVideoCall();
    void setupConference();
}
