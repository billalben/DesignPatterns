import me.billal.observer.Chart;
import me.billal.observer.DataSource;
import me.billal.observer.SpreadSheet;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        System.out.println("---------------------------");

        dataSource.addObserver(sheet1);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

        System.out.println("---------------------------");

        dataSource.removeObserver(sheet1);

        dataSource.setValue(2);
    }
}