package me.billal.abstractFactory.material;

import me.billal.abstractFactory.Button;

public class MaterialButton implements Button {
  @Override
  public void render() {
    System.out.println("Material Button");
  }
}
