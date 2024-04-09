public class EqualStrings {
    public static void main(String[] args) {
        String[] word1 = {"a", "cb"}, word2 = {"a", "bc"};
        String s1 = "", s2 ="";
        for(int i = 0; i < word1.length; i++){
            s1+=word1[i];
        }
        System.out.println(s1);
        for(int i = 0; i < word1.length; i++){
            s2+=word2[i];
        }
        boolean flag = false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                System.out.println(s1.charAt(i) + " " + s2.charAt(i));
            }
        }
        System.out.println(s2);

        int[] nums = {2,3,-5};
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                sum+=nums[i];
            }
            else
                sum-=nums[i];
            
        }
        System.out.println(sum);




    }   
}
