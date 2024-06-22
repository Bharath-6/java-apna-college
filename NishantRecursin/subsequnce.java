import java.util.ArrayList;
import java.util.List;

public class subsequnce {
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
        possible(s,"",0,ans);
        return ans;
        
    }
    public void possible(String s,String n,int idx,List<String> ans){
        if(idx==s.length()){
            ans.add(n);
            return;
        }
        char current = s.charAt(idx);
        possible(s,n+current,idx+1,ans);
        possible(s,n,idx+1,ans);
    }
}
