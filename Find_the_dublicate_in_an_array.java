vclass Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }
        }
        ArrayList<Integer>ar=new ArrayList<Integer>();
        for(int i:hm.keySet())
        {
            if(hm.get(i)>1)
            ar.add(i);
        }
        Collections.sort(ar);
        if(ar.size()==0)
        {
            ar.add(-1);
            return ar;
        }
        
       return ar;
        }
        
    }

 