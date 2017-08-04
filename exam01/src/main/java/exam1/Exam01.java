package exam1;

import sun.management.counter.LongArrayCounter;


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
                    allDigit=allDigit.substring(0,i+1);
                    for(int j=i;j<count;j++){
                        allDigit=allDigit.concat("9");
                    }
                    number = Long.parseLong(allDigit);
                    number = number - (long)(Math.pow(10,(count-i)));
                    i=-1;
                    allNumber=String.valueOf(number);
                    count = allNumber.length()-1;
                }
            }
        }
        return number;
    }

}