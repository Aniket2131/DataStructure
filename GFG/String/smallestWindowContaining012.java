import java.util.HashMap;

public class smallestWindowContaining012 {
    public static void main(String[] args) {
        String s = "011210210001011201002222020110211022101010200212121110202021020220221212112000212101122200211000002011202220002010101221212120001010021212101202122202202220101221022202111221100201022121101002222210002012220012201102122000112111010002201112020201120201221020112212220210000111211221200010221";    
        // String s= "0112012";
        System.out.println(smallestSubstring(s));
    }

    public static int smallestSubstring(String S) {
        // Code here
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE,  i = 0;
    
        for(int j = 0; S.length() > j; j++){
            
            char ch = S.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            if(map.size() == 3){
                ans = Math.min(ans, j - i + 1);
                while(i < S.length() && map.size() >= 3){
                    char ch1 = S.charAt(i++);
                    
                    if(map.get(ch1) > 1){
                        map.put(ch1, map.getOrDefault(ch1, 0) -1);
                    }
                    else {
                        map.remove(ch1);
                        break;
                    }
                    ans = Math.min(ans, j - i + 1);
                }
            }
        }
        return ans;
    }

}
