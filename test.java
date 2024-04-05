public class test {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{0,0,1},{1,0,0}};
        int[] row = new int[3];
        int[] col = new int[3];
        int count;
        // count 1s in rows
        for(int i = 0; i < 3; i++){
            count = 0;
            for(int j = 0; j < 3; j++){
                if(arr[i][j] == 1){
                    count += 1;   
                }
                row[i] = count;
            }
        }
        
        for(int i = 0; i < 3; i++){
            System.out.print(row[i] + " ");
        }

        for(int j = 0; j < 3; j++){
            count = 0;
            for(int i = 0; i < 3; i++){
                if(arr[i][j] == 1){
                    count += 1;
                }
                col[j] = count;
            }
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.print(col[i] + " ");
        }

        int sum = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(row[i]==1 && col[j]==1){
                    sum+=1;
                    
                }
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
