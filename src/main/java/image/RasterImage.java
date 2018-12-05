package image;

import javafx.scene.paint.Color;

public abstract class RasterImage implements Image{
    //Allocation de la matrice représentant l'image
    public void createRepresentation(int height, int width) {
        System.out.println("Allocation du tableau colors avec width= " + width + " et height= " + height);
    }

}
