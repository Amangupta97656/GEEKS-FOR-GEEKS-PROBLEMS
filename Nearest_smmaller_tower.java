class Solution{
	int [] nearestSmallestTower(int [] arr){
	 int n = arr.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++)
            ans[i] = arr[i];
        Arrays.sort(ans);
        int min = ans[0];
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]==min){
                arr1[i] = -1;
                continue;
            }
            int p1 = i+1;
            int p2 = i-1;
            while(p1<n && p2>=0 && arr[p1]>=arr[i] && arr[p2]>=arr[i]){
                p1++;
                p2--;
            }
            
            if(p1>=n || p2<0){
                if(p1>=n && p2<0)
                    arr1[i] = -1;
                else if(p2>=0){
                    int cc= 0;
                    for(int j=p2; j>=0; j--){
                        if(arr[j]<arr[i]){
                            arr1[i] = j;
                            cc = 1;
                            break;
                        }
                    }
                    if(cc==0)
                        arr1[i] = -1;
                }
                else{
                    int cc = 0;
                    for(int j=p1; j<n; j++){
                        if(arr[j]<arr[i]){
                            arr1[i] = j;
                            cc = 1;
                            break;
                        }
                    }
                    if(cc==0)
                        arr1[i] = -1;
                }
            }
            else if(arr[p1]<arr[i] && arr[p2]>=arr[i])
                arr1[i] = p1;
            else if(arr[p1]>=arr[i] && arr[p2]<arr[i])
                arr1[i] = p2;
            else if(arr[p1]<arr[i] && arr[p2]<arr[i]){
                if(arr[p1]==arr[p2])
                    arr1[i] = Math.min(p1,p2);
                else if(arr[p1]<arr[p2])
                    arr1[i] = p1;
                else 
                    arr1[i] = p2;
            }
        }
        return arr1;
    }
}