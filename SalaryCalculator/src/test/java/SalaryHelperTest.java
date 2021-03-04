import org.junit.Test;
import ada.wm2.helper.SalaryHelper;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SalaryHelperTest {
    @Test
    public void testGrossToNett() {
        //year 2020 - no concession - private sector
        double res1 = SalaryHelper.grossToNett(500, 2020, true, false, 10, 0);
        double d1 = 406.5;

        //year 2020 - no concession - state sector
        double res2 = SalaryHelper.grossToNett(500, 2020, false, true, 10, 0);
        double d2 = 380.5;

        //year 2020 - 400 AZN concession - private sector
        double res3 = SalaryHelper.grossToNett(700, 2020, true, false, 5, 400);
        double d3 = 598.5;

        //year 2020 - 200 AZN concession - private sector
        double res4 = SalaryHelper.grossToNett(700, 2020, true, false, 5, 200);
        double d4 = 598.5;

        //year 2020 - 100 AZN concession - private sector
        double res5 = SalaryHelper.grossToNett(700, 2020, true, false, 5, 100);
        double d5 = 598.5;

        //year 2020 - 50 AZN concession - private sector
        double res6 = SalaryHelper.grossToNett(700, 2020, true, false, 5, 50);
        double d6 = 598.5;

        //year 2020 - 400 AZN concession - state sector
        double res7 = SalaryHelper.grossToNett(900, 2020, false, true, 8, 400);
        double d7 = 736.5;

        //year 2020 - 200 AZN concession - private sector
        double res8 = SalaryHelper.grossToNett(900, 2020, false, true, 8, 200);
        double d8 = 708.5;

        //year 2020 - 100 AZN concession - private sector
        double res9 = SalaryHelper.grossToNett(900, 2020, false, true, 8, 100);
        double d9 = 694.5;

        //year 2020 - 50 AZN concession - private sector
        double res10 = SalaryHelper.grossToNett(900, 2020, false, true, 8, 50);
        double d10 = 687.5;

        //year 2019 - no concession - private sector
        double res11 = SalaryHelper.grossToNett(600, 2019, true, false, 7, 0);
        double d11 = 509.0;

        //year 2019 - no concession - state sector
        double res12 = SalaryHelper.grossToNett(600, 2019, false, true, 7, 0);
        double d12 = 481.0;

        //year 2019 - 400 AZN concession - private sector
        double res13 = SalaryHelper.grossToNett(1200, 2019, true, false, 12, 400);
        double d13 = 944.0;

        //year 2019 - 200 AZN concession - private sector
        double res14 = SalaryHelper.grossToNett(1200, 2019, true, false, 12, 200);
        double d14 = 944.0;

        //year 2019 - 100 AZN concession - private sector
        double res15 = SalaryHelper.grossToNett(1200, 2019, true, false, 12, 100);
        double d15 = 944.0;

        //year 2019 - 50 AZN concession - private sector
        double res16 = SalaryHelper.grossToNett(1200, 2019, true, false, 12, 50);
        double d16 = 944.0;

        //year 2019 - 400 AZN concession - state sector
        double res17 = SalaryHelper.grossToNett(2400, 2019, false, true, 11, 400);
        double d17 = 1800.0;

        //year 2019 - 200 AZN concession - state sector
        double res18 = SalaryHelper.grossToNett(2400, 2019, false, true, 11, 200);
        double d18 = 1772.0;

        //year 2019 - 100 AZN concession - state sector
        double res19 = SalaryHelper.grossToNett(2400, 2019, false, true, 11, 100);
        double d19 = 1758.0;

        //year 2019 - 50 AZN concession - state sector
        double res20 = SalaryHelper.grossToNett(2400, 2019, false, true, 11, 50);
        double d20 = 1751.0;

        //year 2018 - no concession
        double res21 = SalaryHelper.grossToNett(3500, 2018, false, false, 16, 0);
        double d21 = 2217.5;

        //year 2018 - 400 AZN concession
        double res22 = SalaryHelper.grossToNett(3500, 2018, false, false, 16, 400);
        double d22 = 2317.5;

        //year 2018 - 200 AZN concession
        double res23 = SalaryHelper.grossToNett(3500, 2018, false, false, 16, 200);
        double d23 = 2267.5;

        //year 2018 - 100 AZN concession
        double res24 = SalaryHelper.grossToNett(3500, 2018, false, false, 16, 100);
        double d24 = 2242.5;

        //year 2018 - 50 AZN concession
        double res25 = SalaryHelper.grossToNett(3500, 2018, false, false, 16, 50);
        double d25 = 2230.0;

        //year 2017 - no concession
        double res26 = SalaryHelper.grossToNett(4800, 2017, false, false, 26, 0);
        double d26 = 2483.0;

        //year 2017 - 400 AZN concession
        double res27 = SalaryHelper.grossToNett(4800, 2017, false, false, 26, 400);
        double d27 = 2583.0;

        //year 2017 - 200 AZN concession
        double res28 = SalaryHelper.grossToNett(4800, 2017, false, false, 26, 200);
        double d28 = 2533.0;

        //year 2017 - 100 AZN concession
        double res29 = SalaryHelper.grossToNett(4800, 2017, false, false, 26, 100);
        double d29 = 2508.0;

        //year 2017 - 50 AZN concession
        double res30 = SalaryHelper.grossToNett(4800, 2017, false, false, 26, 50);
        double d30 = 2495.5;

        ArrayList<Double> desiredResult = new ArrayList<Double>();
        desiredResult.add(d1);
        desiredResult.add(d2);
        desiredResult.add(d3);
        desiredResult.add(d4);
        desiredResult.add(d5);
        desiredResult.add(d6);
        desiredResult.add(d7);
        desiredResult.add(d8);
        desiredResult.add(d9);
        desiredResult.add(d10);
        desiredResult.add(d11);
        desiredResult.add(d12);
        desiredResult.add(d13);
        desiredResult.add(d15);
        desiredResult.add(d16);
        desiredResult.add(d17);
        desiredResult.add(d19);
        desiredResult.add(d20);
        desiredResult.add(d21);
        desiredResult.add(d22);
        desiredResult.add(d23);
        desiredResult.add(d24);
        desiredResult.add(d25);
        desiredResult.add(d26);
        desiredResult.add(d27);
        desiredResult.add(d28);
        desiredResult.add(d29);
        desiredResult.add(d30);

        ArrayList<Double> actualResult = new ArrayList<Double>();
        actualResult.add(res1);
        actualResult.add(res2);
        actualResult.add(res3);
        actualResult.add(res4);
        actualResult.add(res5);
        actualResult.add(res6);
        actualResult.add(res7);
        actualResult.add(res8);
        actualResult.add(res9);
        actualResult.add(res10);
        actualResult.add(res11);
        actualResult.add(res12);
        actualResult.add(res13);
        actualResult.add(res15);
        actualResult.add(res16);
        actualResult.add(res17);
        actualResult.add(res19);
        actualResult.add(res20);
        actualResult.add(res21);
        actualResult.add(res22);
        actualResult.add(res23);
        actualResult.add(res24);
        actualResult.add(res25);
        actualResult.add(res26);
        actualResult.add(res27);
        actualResult.add(res28);
        actualResult.add(res29);
        actualResult.add(res30);

        assertArrayEquals(desiredResult.toArray(), actualResult.toArray());
    }

    @Test
    public void testNettToGross() {
        //actually sectors does not differ in the website
        //private sector
        double res31 = SalaryHelper.nettToGross(5400, true, false);
        double d31 = 7167.83;

        //state sector
        double res32 = SalaryHelper.nettToGross(6000, false, true);
        double d32 = 8006.99;

        ArrayList<Double> desiredResult = new ArrayList<Double>();
        desiredResult.add(d31);
        desiredResult.add(d32);

        ArrayList<Double> actualResult = new ArrayList<Double>();
        actualResult.add(res31);
        actualResult.add(res32);

        assertArrayEquals(desiredResult.toArray(), actualResult.toArray());
    }
}
