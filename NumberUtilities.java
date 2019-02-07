


public class NumberUtilities {

    public static String getRange(int stop) {
        String answer = "";
        for(int i = 0; i < stop; i++){
            answer = answer + i;
        }
        return answer;
    }

    public static String getRange(int start, int stop) {
        String answer = "";
        for(int i = start; i < stop; i++){
            answer = answer + i;
        }
        return answer;
    }


    public static String getRange(int start, int stop, int step) {
        String answer = "";
        for(int i = start; i < stop; i += step){
            answer = answer + i;
        }
        return answer;
    }

    public static String getEvenNumbers(int start, int stop) {
        String answer = "";
        if(start % 2 != 0) start++;
        for(int i = start; i < stop; i+= 2){
            answer = answer + i;
        }
        return answer;
    }


    public static String getOddNumbers(int start, int stop) {
        String answer = "";
        if(start % 2 == 0) start++;
        for(int i = start; i < stop; i+= 2){
            answer = answer + i;
        }
        return answer;
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
