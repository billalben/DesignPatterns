import me.billal.iterator.BrowseHistory;
import me.billal.iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        var value = history.pop();
        System.out.println("popped value:" + value);

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}