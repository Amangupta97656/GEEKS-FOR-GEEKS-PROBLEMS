static List<String> wordBreak(int n, List<String> dict, String s)
    {
        List<String> list=new ArrayList<>();
        solution(s,dict,"",list);
        return list;
    }
    public static void solution(String s,List<String> dict,String sen,List<String> list)
    {
        if(s.length()==0)
        {
            list.add(sen.trim());
            return;
        }
        for(String x:dict)
        {
            if(s.indexOf(x)==0)
            {
                solution(s.substring(x.length()),dict,sen+" "+x,list);
            }
        }
    }