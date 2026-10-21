class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> arr=new ArrayList<>();
        int carry=0, i=digits.length-1;
        digits[i]+=1;
        while(i>=0)
        {
            int tot=digits[i]+carry;
            int val=tot%10;
            carry=tot/10;
            arr.add(val);
            i--;
        }
        if(carry!=0)
        arr.add(carry);
        int res[]=new int[arr.size()];
        int k=arr.size()-1;
        for(int it:arr)
        {
            res[k--]=it;
        }
        return res;
    }
}
