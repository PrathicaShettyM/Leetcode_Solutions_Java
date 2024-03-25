public class test {
    public static void main(String[] args) {
        int[] batteryPercentages = {1,1,2,1,3};
        int count = 0;
        for(int i = 0; i < batteryPercentages.length; i++){
            if(batteryPercentages[i] == 0) continue;
                else if(batteryPercentages[i] > 0){
                // batteryPercentages[j] = Math.max(0, batteryPercentages[j]-1);
                for(int j = i+1; j < batteryPercentages.length; j++){
                    batteryPercentages[j] -= 1;
                    System.out.print(batteryPercentages[j] + " ");
                    count++;
                } 
            }
        } 
        System.out.println(count); 
    }
}