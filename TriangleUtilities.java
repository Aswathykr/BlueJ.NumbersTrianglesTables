 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String rowOfStars = "";
        for(int i = 0; i < numberOfStars; i++){
            rowOfStars = rowOfStars + "*";
        }
        return rowOfStars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangleOfStars = "";
        for(int i = 1; i <= numberOfRows; i++){
            triangleOfStars = triangleOfStars + getRow(i);
            triangleOfStars += "\n";
        }
        return triangleOfStars;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
   
}
