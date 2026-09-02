class Solution {
    public int maxProfit(int[] prices) {
        
        int l=0,r=1,profit=0,m=0;
        while(r<prices.length){
            profit=prices[r]-prices[l];
            if(profit<0){
                l=r;
            } else{
                m=Math.max(m,profit);
                r++;
            }
        }
        return m;
    }
}
