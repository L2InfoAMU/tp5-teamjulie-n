package classImage;

import image.Image;
import java.awt.*;

public class BruteRasterImage implements Image {
    private Color color;
    private int width;
    private int height;
    private Color[][] colors;

    //Constructeur 1
    public BruteRasterImage (Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    //Constructeur 2
    public BruteRasterImage (Color[][] colors) {
        this.colors = colors;
    }

    //Allocation de la matrice représentant l'image
    public void createRepresentation() {
        colors = new Color[width][height];
    }

    //Retourner couleur pixel
    public Color getPixelColor(int x, int y) {
        return colors[x][y];

    }

    //Modification des couleurs de l'image
    public void setPixelColor(Color color, int x, int y) {
        colors[x][y] = color;
    }

    //Mise à jour des couleurs de l'image
    public void setPixelsColor(Color[][] pixels) {
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++)
                if (colors[x][y] != pixels[x][y])
                    colors[x][y] = pixels[x][y];
    }

    //Retourner largeur image
    public int getWidth() {
        return width;
    }

    //Retourner hauteur image
    public int getHeight() {
        return height;
    }

    //Fixer largeur image
    protected void setWidth(int width) {
        this.width = width;
    }

    //Fixer hauteur image
    protected void setHeight(int height) {
        this.height = height;
    }
}
