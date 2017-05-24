package phone;

/**
 * Created by redi on 5/22/17.
 */
public class App {
    public static void main(String[] args){
        Factory factory=new Factory();
        Phone mobilPhone=factory.createInstance("Mobile Phone");
        if (mobilPhone instanceof MobilPhone){
            ((MobilPhone)mobilPhone).sendSMS("+490000","How are you");
        }
    }
}
