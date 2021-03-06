


public class NumberUtilities {

    public static String getRange(int stop) {
        
        return getRange(0,stop);
    }

    public static String getRange(int start, int stop) {
        
        return getRange(start,stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String answer = "";
        for(int i = start; i < stop; i += step){
            answer = answer + i;
        }
        return answer;
    }

    public static String getEvenNumbers(int start, int stop) {
        
        if(start % 2 != 0) start++;
        
        return getRange(start,stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        
        if(start % 2 == 0) start++;
        
        return getRange(start,stop, 2);
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String answer = "";
        for(int i = start; i <= stop; i++){
            int pow = (int)Math.pow(i, exponent);
            answer = answer + pow;
        }
        return answer;
    }
}
