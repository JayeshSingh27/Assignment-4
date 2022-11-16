public class Assignment4_Q8 {
    public static void main(String[] args) 
    {
        String str = "abcaade";
        char c = highestOccuringChar(str);
        System.out.println("Highest Ocuuring Character is : "+c);

    }

    public static char highestOccuringChar(String str) {
	    char ch = ' ';
        int max = -1;
        int[] word = new int[256];
        for (int i = 0; i < str.length() ; i++) {
            word[str.charAt(i)]++;
        }
           for (int i = 0; i < str.length() ; i++) {
            if (word[str.charAt(i)] > max){
                max = word[str.charAt(i)];
                ch = str.charAt(i);
                // System.out.println(ch);
            }
        }      
        return ch;
	}
}
