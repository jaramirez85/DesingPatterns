package edu.meli.desingpatterns.observer;

import java.util.Objects;
import java.util.UUID;

public class Image implements ImageListener{
  Boolean IsPaint = false;
  UUID id = UUID.randomUUID();
  String Color = "";

  void Log() {
    System.out.println("Color: " + this.Color + "; IsPaint: " + this.IsPaint.toString() + "; id: " + this.id);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(id, image.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  void paint(String color) {
    this.Color = color;
    this.IsPaint = true;
    this.Log();
  }

  @Override
  public String getColor() {
    return this.Color;
  }

  @Override
  public void update(String color) {
    paint(color);
  }

}
