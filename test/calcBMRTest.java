/*
 * File: calcBMRTest.java
 * Created Date: 2021-11-29 08:18:10
 * Author: Hermányi Gergely
 * Github: https://github.com/TheRealGeriii
 * Group: SZOFT II/N
 * -----
 * Last Modified: 2021-11-29
 * Modified By: Hermányi Gergely
 * -----
 * Copyright (c) 2021 Hermányi Gergely
 * 
 * GNU GPL v2
 */
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class calcBMRTest {

    calcBMR calcbmr;

    @BeforeEach
    void setUp(){
        this.calcbmr = new calcBMR();
    }
    @Test
    void calcWomenBMRTest(){
        double weight = 80;
        double height = 180;
        double age = 20;

        double expectedBMR = 1658.393;

        double actualBMR = calcbmr.calcWomenBMR(weight, height, age);

        assertEquals(expectedBMR, actualBMR, 0.01);
    }
    @Test
    void calcManBMRTest(){
        double weight = 80;
        double height = 180;
        double age = 20;

        double expectedBMR = 1910.602;

        double actualBMR = calcbmr.calcManBMR(weight, height, age);

        assertEquals(expectedBMR, actualBMR, 0.01);
    }
    @Test
    void calcWomenBMRszelsoertekTest(){
        double weight = 1;
        double height = 180;
        double age = 25;

        double expectedBMR = 906.23;

        double actualBMR = calcbmr.calcWomenBMR(weight, height, age);

        assertEquals(expectedBMR, actualBMR, 0.01);
    }
    @Test
    void calcMenBMRszelsoertekTest(){
        double weight = 1;
        double height = 180;
        double age = 25;

        double expectedBMR = 823.904;

        double actualBMR = calcbmr.calcManBMR(weight, height, age);

        assertEquals(expectedBMR, actualBMR, 0.01);
    }
    @Test
    void calcManBMRkiveteletTest01(){
        double weight = 0;
        double height = 180;
        double age = 20;

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            calcbmr.calcManBMR(weight, height, age);
        });
        assertEquals("nem lehet ekkora a testömeg!", exception.getMessage());
    }
    @Test
    void calcManBMRkiveteletTest02(){
        double weight = 80;
        double height = 0;
        double age = 20;

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            calcbmr.calcManBMR(weight, height, age);
        });
        assertEquals("nem lehet ekkora a magasság!", exception.getMessage());
    }
    @Test
    void calcManBMRkiveteletTest03(){
        double weight = 80;
        double height = 180;
        double age = 0;

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            calcbmr.calcManBMR(weight, height, age);
        });
        assertEquals("nem lehet ekkora az életkor!", exception.getMessage());
    }
    @Test
    void calcWomanBMRkiveteletTest01(){
        double weight = 0;
        double height = 180;
        double age = 20;

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            calcbmr.calcWomenBMR(weight, height, age);
        });
        assertEquals("nem lehet ekkora a testömeg!", exception.getMessage());
    }
    @Test
    void calcWomanBMRkiveteletTest02(){
        double weight = 80;
        double height = 0;
        double age = 20;

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            calcbmr.calcWomenBMR(weight, height, age);
        });
        assertEquals("nem lehet ekkora a magasság!", exception.getMessage());
    }
    @Test
    void calcWomanBMRkiveteletTest03(){
        double weight = 80;
        double height = 180;
        double age = 0;

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            calcbmr.calcWomenBMR(weight, height, age);
        });
        assertEquals("nem lehet ekkora az életkor!", exception.getMessage());
    }
}
