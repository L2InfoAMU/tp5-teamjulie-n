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
        setWidth(width);
        setHeight(height);
        createRepresentation();
        setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels){
        setWidth(pixels.length);
        setHeight(pixels[0].length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation(){
        palette = new Vector<Color>();
        indexesOfColors = new int[width][height];
    }

    /**
     *
     * @return la largeur de l’image
     */
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected void setHeight(int height) {
        this.height=height;
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int x = 0 ; x < width ; x++)
            for (int y = 0 ; y < height ; y++)
                setPixelColor(pixels[x][y],x,y);
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
        if (!paletteContains(color))
            palette.add(color);

        indexesOfColors[x][y] = getIndexOfColor(color);
    }


    public Integer getIndexOfColor(Color color) {
        for(int i = 0 ; i < palette.size() ; i++)
            if(palette.get(i) == color)
                return i;
    }

    public boolean paletteContains(Color color) {
        for(int i = 0 ; i < palette.size() ; i++)
            if(palette.get(i) == color)
                return true;
    }
}
