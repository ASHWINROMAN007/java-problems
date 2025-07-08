
 public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            int r = guess(mid);
            if(r==0)
            {
                return mid;
            }
            else if(r==1)
            {
                left=mid+1;
            }
            else if(r==-1)
            {
                right = mid-1;
            }
        }
    return -1;
    }
}