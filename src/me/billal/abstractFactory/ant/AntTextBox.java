package me.billal.abstractFactory.ant;

import me.billal.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
  @Override
  public void render() {
    System.out.println("Ant TextBox");
  }
}
