public class Assignment4_Q7
{
    public static void main(String[] args) 
    {   
        String str = "abcade";
        str.toLowerCase();
        int[] ans = new int[26];
        for(int i=0;i<str.length();i++)
        {
            int a = (int) str.charAt(i)-97;
            ans[a] += 1; 
        }
        int flag=0;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i] != 0)
            {
                flag++;
            }
        }
        System.out.print("No Of Unique Characters Are : "+flag);
    }
} 