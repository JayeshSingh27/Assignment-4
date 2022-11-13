public class Assignment4_Q3 
{
    public static void main(String[] args) {
        String str="2552";
        String ans="";
        for(int i=str.length()-1;i>=0;i--)
        {
            ans=ans+str.charAt(i);
        }
        if(str.equals(ans))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }    
}
