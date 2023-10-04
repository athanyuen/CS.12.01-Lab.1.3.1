import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for(int i = 0 ; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;

    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(string)){
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] array, int value) {
        int leftIndex = 0, rightIndex = array.length-1;
        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex+rightIndex)/2;
            if(array[midIndex] == value)
                return midIndex;
            else if(value > array[midIndex])
                leftIndex = midIndex + 1;

            else
                rightIndex = midIndex - 1;

        }
        return -1;

    }

    public static int binarySearch(String[] array, String string) {
        int leftIndex = 0, rightIndex = array.length-1;
        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex+rightIndex)/2;
            int num = string.compareTo(array[midIndex]);
            if(num == 0)
                return midIndex;
            else if(num > 0)
                leftIndex = midIndex + 1;
            else
                rightIndex = midIndex - 1;
        }
        return -1;

    }
}
