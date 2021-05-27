Idea :
Given 2 nums 'a' and 'b':
If a % k == x and b % k == k - x :
then (a + b) is divisible by k

Proof :

 a % k == x
 b % k == k - x
 (a + b) % k = ((a + b)%k)%k = (a%k + b%k)%k = (x + k - x)%k = k%k = 0 
 Hence, (a + b) % k == 0 and (a + b) is divisible by k.
OR
by @Marthevin

a%k = x             =>       a = nk+x
b%k = k-x           =>       b = mk+k-x
a+b = nk+mk+k+x-x   =>       a+b = (m+n+1)k    => (a+b) % k = 0
Approach :*************************************

**Keep count of remainders of all elements of arr
**frequency[0] keeps all elements divisible by k, and a divisible of k can only form a group with other divisible of k. Hence, total number of such divisibles must be even.
**for every element with remainder of i (i != 0) there should be a element with remainder k-i.
**Hence, frequency[i] should be equal to frequency[k-i]



//////////////////////////////////
class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] frequency = new int[k];
        for(int num : arr){
            num %= k;
            if(num < 0) num += k;
            frequency[num]++;
        }
        if(frequency[0]%2 != 0) return false;
        
        for(int i = 1; i <= k/2; i++)
            if(frequency[i] != frequency[k-i]) return false;
			
        return true;
    }
}
