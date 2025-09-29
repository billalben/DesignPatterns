import me.billal.bridge.AdvancedRemoteControl;
import me.billal.bridge.RemoteControl;
import me.billal.bridge.SamsungTV;
import me.billal.bridge.SonyTV;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
        remoteControl.turnOff();

        var remoteControl2 = new AdvancedRemoteControl(new SonyTV());
        remoteControl2.setChannel(2);

        var remoteControl3 = new AdvancedRemoteControl(new SamsungTV());
        remoteControl3.turnOn();
    }
}
