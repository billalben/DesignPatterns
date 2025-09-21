import me.billal.command.*;
import me.billal.command.editor.BoldCommand;
import me.billal.command.editor.History;
import me.billal.command.editor.HtmlDocument;
import me.billal.command.editor.UndoCommand;
import me.billal.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);

        var button = new Button(command);
        button.click();

        System.out.println("----------------------------");

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());

        composite.execute();

        System.out.println("----------------------------");

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello world");

        var boldCommand = new BoldCommand(document, history);

        boldCommand.execute();
        System.out.println(document.getContent());

        boldCommand.unexecute();
        System.out.println(document.getContent());


        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }
}