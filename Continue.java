import java.util.*;

public class Continue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }    
}