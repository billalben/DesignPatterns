package me.billal.state;

public class SelectionToll implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dash rectangle");
    }
}
