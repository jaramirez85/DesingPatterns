package edu.meli.desingpatterns.observer;

public class Main {

  public static void main(String[] args) {
    PictureManager pictureManager = new PictureManager();
    ImageListener imageListener = pictureManager.images.get(5);
    imageListener.update("red");
    pictureManager.notify(imageListener);
  }
}
