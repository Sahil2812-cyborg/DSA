import java.util.*;
public class Binary_string {
    public static int OperationsBinaryString(String str){
        int res=0;
        if(str==null){
            return -1;
        }
        for(int i=1;i<str.length()-1;i++){
            int prev = str.charAt(i-1);
            if(str.charAt(i) == 'A'){
                res = res & str.charAt(i+1);
            }
            else if(str.charAt(i) == 'B'){
                res = res | str.charAt(i+1);
            }
            else{
                res = res ^ str.charAt(i+1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(OperationsBinaryString(s));

    }
    
}
