package exam1;

import sun.management.counter.LongArrayCounter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam01 {

    public Exam01(){
    }

    public long findNumber(long number){
       String allNumber=String.valueOf(number);
        int count = allNumber.length()-1;
        if (number>9){
            for(int i=0;i<count;i++ ){
                String allDigit=String.valueOf(number);
                if (Character.getNumericValue(allDigit.charAt(i))<=Character.getNumericValue(allDigit.charAt(i+1))){
                    continue;
                }
                else {
                    number--;
                    i=-1;
                    allNumber=String.valueOf(number);
                    count = allNumber.length()-1;
                }
            }
        }
        return number;
    }

}