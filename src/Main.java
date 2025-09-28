import me.billal.decorator.CloudStream;
import me.billal.decorator.EncryptedCloudStream;
import me.billal.decorator.Stream;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("123-456-789");
    }
}
