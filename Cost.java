import java.util.*;

public class Cost{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextInt();
    float pen = sc.nextInt();
    float eraser = sc.nextInt();
   
    float cost = pencil+pen+eraser;
    System.out.println(cost);
}
}