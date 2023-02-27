class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
           ArrayList<Integer> list=new ArrayList<>();

        int maxi=arr[n-1];

        list.add(maxi);

        for(int i=n-2;i>=0;i--){

            if(arr[i]>=maxi){

                list.add(arr[i]);

                maxi=arr[i];

            }

        }

        Collections.reverse(list);

        return list;

    }

}

