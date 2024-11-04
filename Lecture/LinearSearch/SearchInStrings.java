public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Santhosh";
        char target = 'o';
        System.out.println(search(name , target));
    }
    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for(int i = 0 ; i< str.length(); i++){
            if(target ==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(target ==ch){
                return true;
            }
        }
        return false;
    }
}
