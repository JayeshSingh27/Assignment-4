public class Assignment4_Q2 
{
    public static void main(String[] args) 
    {
        String str = "abaadcndd";
        char[] ch = str.toCharArray();
        System.out.print("The Duplictes Are : "+" ");
        for(int i=0;i<ch.length-1;i++)
        {
            int count=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
                if(count>1)
                {
                    System.out.print(ch[j]+" ");
                }
                break;
            }
        }

    }       
}
