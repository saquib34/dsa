class Solution {
    public void nextPermutation(int[] nums) {
        int piv=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piv=i;
                break;
            }
        }
        if(piv==-1){
           for (int i = 0; i < n / 2; i++) {
            int t = nums[i];
            nums[i] = nums[n- 1 - i];
            nums[n- 1 - i] = t;

        }
        System.out.println(nums);
        return;      

        }
        for(int i=n-1;i>piv;i--){
            if(nums[i]>nums[piv]){
                int t=nums[i];
                nums[i]=nums[piv];
                nums[piv]=t;
                break;
            }
            
        }
        int i=piv+1,j=n-1;
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
        System.out.println(nums);
    }
}