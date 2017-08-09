package exam1;

import sun.management.counter.LongArrayCounter;


public class Exam01 {

    public Exam01() {
    }

    public long findNumber(long number) {
        String allNumber = String.valueOf(number);
        int count = allNumber.length() - 1;
            for (int i = 0; i < count; i++) {
                if (Character.getNumericValue(allNumber.charAt(i)) > Character.getNumericValue(allNumber.charAt(i + 1))) {
                    allNumber = allNumber.substring(0, i + 1);
                    for (int j = i; j < count; j++) {
                        allNumber = allNumber.concat("9");
                    }
                    number = Long.parseLong(allNumber);
                    number -= (long) (Math.pow(10, (count - i)));
                    i = (i - 2 < -1) ? -1 : i - 2;
                    allNumber = String.valueOf(number);
                    count = allNumber.length() - 1;
                }
            }
        return number;
    }

}