public class Assignment4_Q5 
{  
    public static void main(String[] args) 
    {
        String str1 = "race";
        String str2 = "care";
        boolean ans = anagram(str1, str2);
        if(ans == true)
        {
            System.out.println("Yes , Strings Are Anagram");
        }
        else
        {
            System.out.println("No , Strings Are Not Anagram");
        }
       
    }

    public static boolean anagram(String str1 , String str2)
    {
        int[] arr = new int[256];
        for(int i=0;i<str1.length();i++)
        {
            int a = (int) str1.charAt(i);
            arr[a] += 1;
        } 
        for(int i=0;i<str2.length();i++)
        {
            int b = (int) str2.charAt(i);
            arr[b]-=1;
        }
        boolean check = true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)
            {
                check = false;
            }
        }
        return check;
    } 
}
