public class Count_Vowel{
    public static void main(String args[]){
        String s = "ChiragDiya";
        int count=0;

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                count++;
            }
        }
        System.out.print(count);
    }
}