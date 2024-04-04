public class test {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        for(int i  = 0; i < nums.length; i++){
            mx = Math.max(mx, nums[i]);
            mn = Math.max(mn, nums[i]);
        }
        int count = 0;
        System.out.println(mn);
        System.out.println(mx);
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i]!= mn && nums[i]!= mx) 
        //         count+=1;
        // }
        
    }
}