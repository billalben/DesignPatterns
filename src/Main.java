import me.billal.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "john");

        ConfigManager other = ConfigManager.getInstance();

        System.out.println(other.get("name"));
    }
}
