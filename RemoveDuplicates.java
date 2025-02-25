

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,3,4,5,6,7,4,5,7,8,9,10};
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            boolean found = false;
            for(int k=0; k<i; k++){
                if(arr[i] == arr[k]){
                    found = true;
                    break;
                }
            }
            if(!found){
                temp[j++] = arr[i];
            }
        }
        int[] res = new int[j];
        for(int i=0; i<j; i++){
            res[i] = temp[i];
        }
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
