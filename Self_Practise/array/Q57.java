package Self_Practise.array;

public class Q57 {
    public static void main(String[] args) {
        int [] array = { 1, 5, 8,  9, 10, 15 };
        boolean isSorted = false;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i + 1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
