import me.billal.adapter.CaramelFilter;
import me.billal.adapter.Image;
import me.billal.adapter.ImageView;
import me.billal.adapter.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}