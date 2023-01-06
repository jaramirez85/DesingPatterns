package edu.meli.desingpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PictureManager {
  public List<ImageListener> images = new ArrayList<>();

  public PictureManager() {
    attach(new Image());
    attach(new Image());
    attach(new Image());
    attach(new Image());
    attach(new Image());
    attach(new Image());
    attach(new Image());
    attach(new Image());
    attach(new Image());
    attach(new Image());
  }

  public void notify(ImageListener image) {
    detach(image);
    for (ImageListener imageListener: images) {
      imageListener.update(image.getColor());
    }
  }
  
  public void attach(ImageListener imageListener) {
    this.images.add(imageListener);
  }

  public void detach(ImageListener imageListener) {
    images.remove(imageListener);
    System.out.println("size = " + images.size());
  }
}
