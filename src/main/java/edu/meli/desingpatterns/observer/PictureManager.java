package edu.meli.desingpatterns.observer;

import java.util.List;

public class PictureManager {
  public List<Image> images;
  int imagesActives = 0;

  public PictureManager() {
    images.add(new Image());
    images.add(new Image());
    images.add(new Image());
    images.add(new Image());
    images.add(new Image());
    images.add(new Image());
    images.add(new Image());
    images.add(new Image());
    images.add(new Image());
    images.add(new Image());
  }

  public void RunDemon() throws InterruptedException {
    Thread.sleep(1000);

    Image lastedImageChanged = null;
    int imageschanged = 0;
    for (Image currentImage: images) {
      if (currentImage.IsPaint) {
        lastedImageChanged = currentImage;
        imageschanged++;
      }
    }

    if (imagesActives != imageschanged) {
      imagesActives = imageschanged;
      this.PainPicture(lastedImageChanged.Color, lastedImageChanged);
    }

    if (this.images.size() < this.imagesActives) {
      this.RunDemon();
    }
  }

  private void PainPicture(String color, Image image) {
    image.paint(color);

    for (Image currentImage: images) {
        boolean isSameImage = currentImage.equals(image);
        if (isSameImage || currentImage.IsPaint) {
          return;
        }

        currentImage.Color = color;
    }
  }
}
