package me.billal.factory.sharp;

import me.billal.factory.matcha.Controller;
import me.billal.factory.matcha.ViewEngine;

public class SharpController extends Controller {
  @Override
  protected ViewEngine createViewEngine() {
    return new SharpViewEngine();
  }
}
