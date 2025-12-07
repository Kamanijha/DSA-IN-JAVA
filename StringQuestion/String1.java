

public class String1 {
    public static void main(String[] args) {
        String s = "time to work";
        // for(int i = 0;i<s.length();i++){
        //     System.out.println(s.charAt(i));
        // }

        // for(int i = s.length()-1;i>=0;i--){
        //     System.out.println(s.charAt(i));
        // }

        // for(int i = 0;i<s.length();i++){

        // }
        reverseWord(s);
    }

    public static void reverseWord(String s){
        String temp = " "; String word = " ";
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i) != ' '){
                word = c+word;
            }
        }
        System.out.println(word);
    }
}
