import me.billal.abstractFactory.ant.AntWidgetFactory;
import me.billal.abstractFactory.app.ContactForm;
import me.billal.abstractFactory.material.MaterialWidgetFactory;
import me.billal.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new MaterialWidgetFactory());
        new ContactForm().render(new AntWidgetFactory());
    }
}
