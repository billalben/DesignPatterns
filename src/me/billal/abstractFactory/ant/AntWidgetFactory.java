package me.billal.abstractFactory.ant;

import me.billal.abstractFactory.Button;
import me.billal.abstractFactory.TextBox;
import me.billal.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
  @Override
  public Button createButton() {
    return new AntButton();
  }

  @Override
  public TextBox createTextBox() {
    return new AntTextBox();
  }
}
