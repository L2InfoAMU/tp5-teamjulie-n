package image;

import image.Image;
import javafx.scene.paint.Color;

public class BruteRasterImage implements Image {
    private int height;
    private int width;
    private Color[][] colors;

    //Constructeur 1
    public BruteRasterImage (Color color, int width, int height) {
        this.height = height;
        this.width = width;
        createRepresentation();
        for (int x = 0; x < this.width; x++)
            for (int y = 0; y < this.height; y++)
                colors[x][y] = color;
    }

    //Constructeur 2
    public BruteRasterImage (Color[][] colors) {
        this.height = colors.length;
        this.width = colors[0].length;

        createRepresentation();
        for (int x = 0; x < height; x++)
            for (int y = 0; y < width; y++)
                this.colors[x][y] = colors[x][y];
    }

    //Allocation de la matrice représentant l'image
    public void createRepresentation() {
        System.out.println("Allocation du tableau colors avec width= " + width + " et height= " + height);
        colors = new Color[height][width];
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
        for (int x = 0; x < colors[0].length; x++)
            for (int y = 0; y < colors.length; y++)
                if (colors[x][y] != pixels[x][y])
                    colors[x][y] = pixels[x][y];
    }

    //Retourner largeur image
    public int getWidth() {
        return colors.length;
    }

    //Retourner hauteur image
    public int getHeight() {
        return colors[0].length;
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
