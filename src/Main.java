import me.billal.mediator.ArticlesDialogBox;
import me.billal.observer.Chart;
import me.billal.observer.DataSource;
import me.billal.observer.SpreadSheet;

public class Main {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}