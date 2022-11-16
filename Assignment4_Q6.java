public class Assignment4_Q6 {
    public static void main(String[] args) 
    {
        String str = "The Quick Brown fox jumps over the lazy dog";
        str=str.replace(" ", "");
        str = str.toLowerCase();      
        int[] ans = new int[26];
        for(int i=0;i<ans.length;i++)
        {
            int a = (int) str.charAt(i);
            ans[a-97]++;
        }     
        int c=0;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]==0)
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Not a Pangram");
        }
        else{
            System.out.println("Yes Pangram");
        }

    }
}
