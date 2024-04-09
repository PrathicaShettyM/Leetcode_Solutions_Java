public class fascinatingNo {
    public static void main(String[] args) {
        int n = 192;
        int n1 = 2*n;
        int n2 = 3*n;
        String s = ""+n+n1+n2; 

        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count+=(s.charAt(i)-'0');
        }
        System.out.println(count);
      }  
      
    }

