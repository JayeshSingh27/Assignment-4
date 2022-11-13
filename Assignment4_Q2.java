public class Assignment4_Q2 
{
    public static void main(String[] args) 
    {
        String str = "abacad";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.print(ch[j]);
                }                
            }
        }
    }      
}
