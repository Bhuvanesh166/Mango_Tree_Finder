import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int tree = scanner.nextInt();
        boolean flag=false;
        int  count1=1;
        int  count2=row;
        for (int i = 1; count2 < row*column; i++) {
        if(tree<=row){
            flag=true;
            break;
        }
            else{
                if(tree==count1){
                    flag=true;
                    break;
                }
            if(tree==count2){
                flag=true;
                break;
            }
        }
            count1+=row;
            count2+=row;
        }
        if(flag){
            System.out.println(flag);
        }
        else{
            System.out.println(flag);
        }
    }
}