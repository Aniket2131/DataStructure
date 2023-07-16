import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q1125{
    public static void main(String[] args) {
        String[] req_skills = {"java","nodejs","reactjs"};
        List<List<String>> people = new ArrayList<>();
        List<String> p1 = new ArrayList<>();
        p1.add("java");
        List<String> p2 = new ArrayList<>();
        p2.add("nodejs");
        List<String> p3 = new ArrayList<>();
        p3.add("nodejs");
        p3.add("reactjs");
        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(smallestSufficientTeam(req_skills, people));
    }

    public static ArrayList<Integer> sol = new ArrayList<>();  
    public static int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] sk = new int[people.size()];
        for(int i = 0; req_skills.length > i; i++){
            map.put(req_skills[i], i);
        }
        for(int i = 0; people.size() > i; i++){
            for(int j = 0; people.get(i).size() > j; j++){
                int n = map.get(people.get(i).get(j));
                sk[i] = sk[i] | (1 << n);
            }
        }

        helper(sk, 0, new ArrayList<>(), 0, req_skills.length);
        int[] res = new int[sol.size()];
        for(int i = 0; sol.size() > i; i++) res[i] = sol.get(i);
        return res; 
    }

    public static void helper(int[] sk, int cp, ArrayList<Integer> ans, int mask, int req_skills){
        if(sol.size() > 0 && ans.size() >= sol.size()-1 ||  cp == sk.length)
            return ;
        ans.add(cp);
        if((mask | sk[cp]) == ((1 << req_skills) - 1)){
            sol = new  ArrayList<>(ans);

            ans.remove(ans.size() - 1);
            return;
        }
        else if((mask | sk[cp]) > mask){  
            helper(sk, cp + 1, ans, (mask | sk[cp]), req_skills);
        }
        ans.remove(ans.size() - 1);
        helper(sk, cp + 1, ans, mask, req_skills);
    }
}