package exam1;

public class Exam01 {

    public Exam01(){

    }
    public long findInteger(long number){
        String allNumber=String.valueOf(number);
        if (number>9){

            for(int i=0;i<allNumber.length();i++ ){
                String allDigit=String.valueOf(number);
                if (Character.getNumericValue(allDigit.charAt(i))<=Character.getNumericValue(allDigit.charAt(i+1))){
                    continue;
                }
                else {
                    number--;
                    i=0;
                }
                return number;
            }
        }
        return number;
    }

}