import me.billal.state.BrushTool;
import me.billal.state.Canvas;
import me.billal.state.EraserTool;
import me.billal.state.SelectionToll;

public class Main {
    public static void main(String[] args) {
    var canvas = new Canvas();
    canvas.setCurrentTool(new SelectionToll());

    canvas.mouseDown();
    canvas.mouseUp();

    System.out.println("--------------------");

    canvas.setCurrentTool(new BrushTool());

    canvas.mouseDown();
    canvas.mouseUp();

    System.out.println("--------------------");

    canvas.setCurrentTool(new EraserTool());

    canvas.mouseDown();
    canvas.mouseUp();
    }
}