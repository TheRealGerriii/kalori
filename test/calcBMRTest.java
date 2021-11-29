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

        calcbmr.setData(weight, height, age);

        double expectedBMR = 1658.393;

        double actualBMR = calcbmr.calcWomenBMR();

        assertEquals(expectedBMR, actualBMR, 0.01);
    }
    @Test
    void calcManBMRTest(){

        double weight = 80;
        double height = 180;
        double age = 20;

        calcbmr.setData(weight, height, age);

        double expectedBMR = 1910.602;

        double actualBMR = calcbmr.calcManBMR();

        assertEquals(expectedBMR, actualBMR, 1);
    }
}
