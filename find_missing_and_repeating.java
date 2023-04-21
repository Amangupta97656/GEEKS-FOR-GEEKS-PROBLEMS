class Solve {
    int[] findTwoElement(int arr[], int n) {
          Arrays.sort(arr);       
       int array[]=new int[2];

//  for missing element

             int mis=1;
        for(int i=0;i<n;i++){
            if(arr[i]==mis){
                mis++;
            }
        }
        array[1]=mis;

   //  for repeating element
          for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                array[0]=arr[i];
                break;
            }
        }
        return array;
    }
}