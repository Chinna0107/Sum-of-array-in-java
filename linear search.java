class Solution {

    static int search(int arr[], int x) {

        // Your code here
      int[] arr={10,20,30,40,50};
      int x=50;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
         return -1;
    }
}
