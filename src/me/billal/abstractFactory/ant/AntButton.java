package me.billal.abstractFactory.ant;

import me.billal.abstractFactory.Button;

public class AntButton implements Button {
  @Override
  public void render() {
    System.out.println("Ant Button");
  }
}
