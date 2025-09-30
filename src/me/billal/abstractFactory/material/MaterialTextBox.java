package me.billal.abstractFactory.material;

import me.billal.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
  @Override
  public void render() {
    System.out.println("Material TextBox");
  }
}
