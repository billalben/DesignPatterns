package me.billal.abstractFactory.app;

import me.billal.abstractFactory.WidgetFactory;

public class ContactForm {
  public void render(WidgetFactory factory) {
    factory.createTextBox().render();
    factory.createButton().render();
  }
}
