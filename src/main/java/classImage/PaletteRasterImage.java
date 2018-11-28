package classImage;

import image.Image;

import java.awt.*;

public class PaletteRasterImage implements Image {
    private Color color;
    private int width;
    private int height;
    private Color[][] pixels;

    public PaletteRasterImage(Color color, int width, int height){
        this.color = color;
        this.width = width;
        this.height = height;
        createRepresentation();
    }

    public PaletteRasterImage(Color[][] pixels){
        this.pixels = pixels;
        createRepresentation();
    }

    public void createRepresentation(){

        pixels = new Color[width][height];
        /*alloue la liste pour stocker la palette et la matrice représentant
        l’image (à utiliser dans le constructeur).*/
    }

    public int getWidth() {
        return width;
        /*retourne la largeur de l’image.*/
    }

    public int getHeight() {
        return height;
        /*retourne la hauteur de l’image.*/
    }

    public Color getPixelColor(int x, int y) {
        return pixels[y][x];
        /*retourne la couleur d’un pixel.*/
    }

    protected void setWidth(int width) {
        this.width = width;
        /*fixe la largeur de l’image.*/
    }

    protected void setHeight(int height) {
        this.height=height;
        /*fixe la hauteur de l’image*/
    }

    public void setPixelsColor(Color[][] pixels) {
        this.pixels=pixels;
        /*met à jour les valeurs de couleurs de l’image
        en utilisant les valeurs de la matrice donnée en paramètre.*/
    }

    private void setPixelsColor(Color color) {
        this.color = color;
        /*change les valeurs de tous les pixels pour qu’ils
        soient tous de la couleur donnée en paramètre.*/
    }

    public void setPixelColor(Color color, int x, int y) {
        for (int i = 0 ; i < width ; i++)
            for (int j = 0 ; j < height ; j++) {
                if (pixels[y][x] != color)
                    pixels[y][x] = color;
            }
        /*fixe la couleur d’un pixel (en ajoutant
        la couleur à la palette si elle n’était pas dans la palette).*/
    }
}



