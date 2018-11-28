package testClassImage;


import classImage.PaletteRasterImage;
import org.junit.*;


import java.awt.Color;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;


public class TestPaletteRasterImage {

    private final PaletteRasterImage pixel = new PaletteRasterImage(Color.cyan,100,100);

    @Test
    void testConstrutorColorXY(){
        /*assertEquals(Color.cyan,pixel.color);*/
    }

    @Test
    void getWidth(){
        assertEquals(100 , pixel.getWidth());
    }

    @Test
    void getHeight(){

    }

    @Test
    void testConstrutorPixels(){

    }

    @Test
    void createRepresentation(){

    }

    @Test
    void setPixelColorPixels(){

    }

    @Test
    void setPixelColorColor(){

    }

    @Test
    void getPixelColor(){

    }

    @Test
    void setWidth(){

    }

    @Test
    void setHeight(){

    }


}
