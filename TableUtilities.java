 

public class TableUtilities {
    public static String getRowofMultiplicationTable(int number, int limit) {
        String rowOfTable = "";
        for(int i = 1; i <= limit; i++){ 
            rowOfTable = rowOfTable + String.format("%3d |" , number * i );
        }
        return rowOfTable;
    }
    
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String multiplicationTableStr = "";
        for(int i = 1; i <= tableSize; i++){
            multiplicationTableStr = multiplicationTableStr + 
                                        getRowofMultiplicationTable(i, tableSize);
            multiplicationTableStr += "\n";
        }
        return multiplicationTableStr;
    }
}
