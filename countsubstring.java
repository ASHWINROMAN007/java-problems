class Solution {
    public static int countSubstring(String s) {
        // code here
        int n = s.length();
        int c=0;
        char[] arr=s.toCharArray();
        int[] a = new int[3];
        a[0]=-1;
        a[1]=-1;
        a[2]=-1;
        for(int i =0;i<n;i++)
        {
            a[arr[i]-'a']=i;
            if(a[0]!=-1&&a[1]!=-1&&a[2]!=-1)
            {
                c=c+(1+Math.min(Math.min(a[0],a[1]),a[2]));
            }
        }
        return c;
    }
}
