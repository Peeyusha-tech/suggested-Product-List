import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuggestedProducts {

    public static List<List<String>> suggestedProductList(String[] product, String searchWord){

        int n= searchWord.length();
        int THRESHOLD=3;
        Arrays.sort(product);

        List<List<String>> result= new ArrayList<>();

        for(int i=0; i<n;i++){
            result.add(new ArrayList<>());
        }
        for(String str:product){
            for(int i=0; i<n;i++){
                if(i<str.length()&&str.charAt(i)==searchWord.charAt(i)){
                    if(result.get(i).size()<THRESHOLD){
                        result.get(i).add(str);
                    }
                }else{
                    break;
                }
            }

        }



        return result;
    }



    public static void main(String args[]){
        String[] product={"mobile","mouse","moneypot","monitor","mousepad"};
        String searchWord= "mouse";
        List<List<String>> result=  suggestedProductList(product,searchWord);
        System.out.println("Result::"+result);

    }

}
