import java.util.*;
import java.io.*;
public class InsSortInt {
    public static void main(String[] args){
        ArrayList<Integer> listOfNums = new ArrayList<Integer>();
        try {
            File numbers = new File("randInts.txt");
            Scanner scanTime = new Scanner(numbers);
            Integer currentNum = 0;
            while (scanTime.hasNextInt()) {
                currentNum = scanTime.nextInt();
                listOfNums.add(currentNum);
            }
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        int[] array = new int[listOfNums.size()];
        for(int i = 0; i < listOfNums.size(); i++){
            array[i] = listOfNums.get(i);
        }
        //System.out.println(Arrays.toString(array));
        sorted(array);

    }
    public static void sorted(int[] unsorted){
        for(int j = 0; j < unsorted.length; j++) {
            for(int i = 1; i < unsorted.length; i++){
                if(unsorted[i] < unsorted[i-1]){
                    int temp = unsorted[i - 1];
                    unsorted[i - 1] = unsorted[i];
                    unsorted[i] = temp;
                }
            }
        }
        //System.out.println("\n sorted: " + Arrays.toString(unsorted));
        System.out.println("sorted. smallest: "+ unsorted[0] + " biggest: " + unsorted[unsorted.length -1]);
    }
}
