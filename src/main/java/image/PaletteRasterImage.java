package image;
import image.Image;
import javafx.scene.paint.Color;
import java.util.List;
import java.util.Vector;
public class PaletteRasterImage implements Image {
    private List<Color> palette;
    private int width;
    private int height;
    private int[][] indexesOfColors;
    public PaletteRasterImage(Color color, int width, int height){
        this.width = width;
        this.height = height;
        createRepresentation();
        setPixelsColor(color);
    }
    public PaletteRasterImage(Color[][] pixels){
        width = pixels.length;
        height = pixels[0].length;
        createRepresentation();
        setPixelsColor(pixels);
    }
    public void createRepresentation(){
        palette = new Vector<Color>();
        indexesOfColors = new int[width][height];
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
        return palette.get(indexesOfColors[y][x]);
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
        for (int i = 0 ; i < width ; i++)
            for (int j = 0 ; j < height ; j++)
                setPixelColor(pixels[i][j],i,j);
        /*met à jour les valeurs de couleurs de l’image
        en utilisant les valeurs de la matrice donnée en paramètre.*/
    }
    private void setPixelsColor(Color color) {
        for (int i = 0 ; i < width ; i++)
            for (int j = 0 ; j < height ; j++)
                setPixelColor(color,i,j);
        /*change les valeurs de tous les pixels pour qu’ils soient
        tous de la couleur donnée en paramètre.*/
    }
    public void setPixelColor(Color color, int x, int y) {
        for(int i = 0 ; i < palette.size() ; i++)
            if(palette.get(i) == color)
                indexesOfColors[y][x]= i;
            else {
                palette.add(color);
                setPixelColor(color, x, y);
            }
        /*fixe la couleur d’un pixel (en ajoutant
        la couleur à la palette si elle n’était pas dans la palette).*/
    }
}
