package me.billal.abstractFactory.material;

import me.billal.abstractFactory.Button;
import me.billal.abstractFactory.TextBox;
import me.billal.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
  @Override
  public Button createButton() {
    return new MaterialButton();
  }

  @Override
  public TextBox createTextBox() {
    return new MaterialTextBox();
  }
}
