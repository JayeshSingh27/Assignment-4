import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Assignment4_Q4 
{
    public static void main(String[] args) {
        String str = "J@yesh $ingh";
        str=str.toLowerCase();
        int consonants=0,vowels=0,spch=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
           if(ch >= 'a' && ch<='z')
           {
                if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u')
                {
                    vowels++;
                }
                else{
                    consonants++;
                }
           }
           else if(ch==' ')
           {
                continue;
           }
           else
           {
                spch++;
           }
        }
        System.out.println("No Of Consonants Are : "+consonants);
        System.out.println("No Of Vowels Are : "+vowels);
        System.out.println("No Of Special Characters Are : "+spch);
    }
}
