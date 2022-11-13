public class Assignment4_Q1 
{
    public static void main(String[] args) 
    {
        String str = "abaadcndd";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    ch[j]='@';
                }
            }
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='@')
            {
                System.out.print(ch[i]);
            }
        }
    }    
}
