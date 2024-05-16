package snacks.snackThree;

public class SnackThree {
    public static void main(String[] args){
        int[] numbList = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < numbList.length; i++){
            if(i % 2 != 0){
                sum += numbList[i];
            }
        }
        System.out.println(sum);
    }
}
