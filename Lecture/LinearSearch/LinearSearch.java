public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 18,12,19,14,7,50};

        if(-1 != linearSearch(arr, 0)){
            System.out.println("Found");
        }
        else {
            System.out.println("NOt found");
        }

    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0)
            return -1;

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
