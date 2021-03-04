package ada.wm2.helper;

public class SalaryHelper {
    public static double grossToNett(double salary, int year, boolean isPrivateSector, boolean isStateSector, double LUFinPercentage, int concession) {
        double realSalary = salary - concession; //vergiye celb olunan mebleg
        double taxSalary; //gelir vergisi
        double dsmf;
        double laborUnionFee;
        double insurance; //issizlikden sigorta haqqi
        double healthInsurance; //tibbi sigorta haqqi
        double nettSalary = 0;

        if(year == 2017) {
            isPrivateSector = false;
            isStateSector = false;
            if(realSalary <= 2500) taxSalary = (realSalary - 155) * 14 / 100;
            else taxSalary = 350 + ((realSalary - 2500) * 25 / 100);
            dsmf = salary * 3 / 100;
            laborUnionFee = salary * LUFinPercentage / 100;
            nettSalary = salary - taxSalary - dsmf - laborUnionFee;
        }

        if(year == 2018) {
            isPrivateSector = false;
            isStateSector = false;
            if(realSalary <= 2500) taxSalary = (realSalary - 173) * 14 / 100;
            else taxSalary = 350 + ((realSalary - 2500) * 25 / 100);
            dsmf = salary * 3 /100;
            insurance = salary * 0.5 / 100;
            laborUnionFee = salary * LUFinPercentage / 100;
            nettSalary = salary - taxSalary - dsmf - insurance - laborUnionFee;
        }
        if(year == 2019) {
            if(isPrivateSector) {
                if(realSalary <= 8000) taxSalary = 0;
                else taxSalary = (realSalary - 8000)  * 14 / 100;
                if(salary <= 200) dsmf = salary * 3 / 100;
                else dsmf = 6 + ((salary - 200) * 10 / 100);
                insurance = salary * 0.5 / 100;
                laborUnionFee = salary * LUFinPercentage / 100;
                nettSalary = salary - taxSalary - dsmf - insurance - laborUnionFee;
            }
            if(isStateSector) {
                if(realSalary <= 2500) taxSalary = (realSalary - 200) * 14 / 100;
                else taxSalary = 350 + ((realSalary - 2500) * 25 / 100);
                dsmf = salary * 3 / 100;
                insurance = salary * 0.5 / 100;
                laborUnionFee = salary * LUFinPercentage / 100;
                nettSalary = salary - taxSalary - dsmf - insurance - laborUnionFee;
            }
        }
        if(year == 2020) {
            if(isPrivateSector) {
                if(realSalary <= 8000) taxSalary = 0;
                else taxSalary = (realSalary - 8000) * 14 / 100;
                if(salary <= 200) dsmf = salary * 3 / 100;
                else dsmf = 6 + ((salary - 200) * 10 / 100);
                insurance = salary * 0.5 / 100;
                laborUnionFee = salary * LUFinPercentage / 100;
                if(salary <= 8000) healthInsurance = (salary * 2 / 100) / 2;
                else healthInsurance = 160 / 2 + ((salary - 8000) * 0.5 / 100);
                nettSalary = salary - taxSalary - dsmf - insurance - healthInsurance - laborUnionFee;
            }
            if(isStateSector) {
                if(realSalary <= 2500) taxSalary = (realSalary - 200) * 14 / 100;
                else taxSalary = 350 + ((realSalary - 2500) * 25 / 100);
                dsmf = salary * 3 / 100;
                insurance = salary * 0.5 / 100;
                laborUnionFee = salary * LUFinPercentage / 100;
                if(salary <= 8000) healthInsurance = salary * 2 / 100;
                else healthInsurance = 160 + ((salary - 8000) * 0.5 / 100);
                nettSalary = salary - taxSalary - dsmf - insurance - healthInsurance - laborUnionFee;
            }
        }

        return Math.round(nettSalary * 100.0) / 100.0;
    }
    public static double nettToGross(double salary, boolean isPrivateSector, boolean isStateSector) {
        double grossSalary = 0;
        if(salary <= 2086.72) grossSalary = (salary - 24.22) / 0.825;
        else grossSalary = (salary - 275) / 0.715;
        return Math.round(grossSalary * 100.0) / 100.0;
    }
}
