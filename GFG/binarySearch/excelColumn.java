public class excelColumn{
    public static void main(String[] args) {
        
    }

    String colName (long n)
    {
        // your code here
        String s = "";
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            long num = n % 26;
            char ch = (char)(num + 'A');
            s += ch;
            n /= 26;
        }
        sb.append(s);
        return sb.reverse().toString(); 
    }
}