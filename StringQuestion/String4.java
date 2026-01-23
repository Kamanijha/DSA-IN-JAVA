public class String4 {
    public static void main(String[] args) {
        String s = "abcdefg";
      //String res=   PrefixReverse(s,'d');
      // String res =  reverse(s,0,s.length());
      //String res =  expandString("A4B2C3");
      //System.out.println(res);
      sumofallnumbers("a23sd");

    }
   // q. 62
    public static String PrefixReverse(String s,char ch){
        int index= s.indexOf(ch);
        if(index == -1){
            return s;
        }

        String reverse = reverse(s, 0, index);
        String remming = s.substring(index+1);

        return reverse + remming;
    }

    public static String reverse(String word,int st,int end){
        String rev = "";
        for(int i = st;i<=end;i++){
            char c = word.charAt(i);
            rev = c + rev;
        }
        return rev;
    }

    // 63
    public static String expandString(String s){
        String expand= "";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9'){
                int n = c -'0';
                while (n>0) {
                    expand = expand + s.charAt(i-1);
                    n--;
                }
            }
        }
        return expand;
    }

    // q. 65
    public static void sumofallnumbers(String s){
        for(int i = 0;i<s.length();i++){
            char c= s.charAt(i);
            char c1 = s.charAt(i+1);
            if((c >= '0' && c<='9' ) && (c1 >='0' && c1<='9')){
                int num = (c -'0') + (c1-'0');
                System.out.println(num);
            }
        }
    }
}
