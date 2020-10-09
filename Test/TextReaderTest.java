import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * Created by Johan Rune
 * Date: 2020-10-08
 * Time: 10:31
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class TextReaderTest {

    TextReader t = new TextReader();

    //Plan:
    // lägg strings i lista.
    //konvertera listan till double.
    // räkna ut värden.


    @Test
    public final void arrayCreatorTest(){
        List<Double> tempList = t.arrayCreator("temp.txt");
        assertTrue(tempList.get(0) == 13.3);
        assertFalse(tempList.get(0) == 18);
    }


    @Test
    public final void highestTempTest(){
        List<Double> tempList = t.arrayCreator("temp.txt");
        //assertTrue(t.highestTemp(tempList) == 8.8); //jag använde vid testet egna siffror.

    }

    @Test
    public final void averageTempTest(){
        List<Double> tempList = t.arrayCreator("temp.txt");
        //assertTrue(t.averageTemp(tempList) == 5.0); //jag använde vid testet egna siffror.
        assertFalse(t.averageTemp(tempList) == 8);
    }

    /*
    @Test
    public final void arrayStringCreatorTest(){
        t.arrayCreator();
        System.out.println(t.tempString.get(1));
        assertTrue(t.tempString.get(0).equals("13,3"));
    }
*/


    @Test
    public final void toPunktTest(){
        //t.arrayCreator();
        String s = "13,3";
        assertTrue(t.toPunkt(s).equals("13.3"));
    }



}
