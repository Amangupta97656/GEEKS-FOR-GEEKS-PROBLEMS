class Solution
{
    //Function to get the maximum total value in the knapsack.
     double fractionalKnapsack(int W, Item arr[], int n)
    {
        Comparator<Item> comp = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double ratio1 = (double)o1.value/o1.weight;
                double ratio2 = (double)o2.value/o2.weight;
                if(ratio1<ratio2){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Arrays.sort(arr,comp);
        double val=0;
        for(int i=0;i<arr.length;i++){
            if(W>=arr[i].weight){
                val+=arr[i].value;
                W-=arr[i].weight;
            }else if(W>0){
                val+=((double)arr[i].value/arr[i].weight)*W;
                break;
            }else{
                break;
            }
        }
        return val;
    }
}