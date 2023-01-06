package edu.meli.desingpatterns.observer;

public class Main {

  public static void main(String[] args) {
    PictureManager pictureManager = new PictureManager();

    ImageListener imageListener = pictureManager.images.get(5);
    imageListener.update("red");
    pictureManager.notify(imageListener);

    imageListener = pictureManager.images.get(2);
    imageListener.update("blue");
    pictureManager.notify(imageListener);

    imageListener = pictureManager.images.get(1);
    imageListener.update("black");
    pictureManager.notify(imageListener);
  }
}
