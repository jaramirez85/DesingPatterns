package edu.meli.desingpatterns.observer;

public class Image {
  Boolean IsPaint = false;

  String Color = "";

  void Log() {
    System.out.println("Color: " + this.Color + "; IsPaint: " + this.IsPaint.toString());
  }

  void paint(String color) {
    this.Color = color;
    this.IsPaint = true;
    this.Log();
  }
}
