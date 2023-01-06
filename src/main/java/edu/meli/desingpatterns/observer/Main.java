package edu.meli.desingpatterns.observer;

public class Main {
  PictureManager pictureManager = new PictureManager();

  void main() throws InterruptedException {
    pictureManager.images.get(5).paint("red");
    pictureManager.RunDemon();
    Thread.sleep(10);
  }
}
