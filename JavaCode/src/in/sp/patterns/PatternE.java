package in.sp.patterns;
public class PatternE {
    public static void main(String[] args){
        int n = 5;
        int value;
        for(int i=1; i<=n; i++){
            value = i % 2 == 0 ? 0 : 1;
            for(int j=1; j<=i; j++){
                System.out.print(value + " ");
                value =(value == 0)? 1: 0;
            }
            System.out.println();
        }
    }
}
