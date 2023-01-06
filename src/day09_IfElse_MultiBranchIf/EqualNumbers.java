package day09_IfStatements;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1 = 1,
            n2 = 2,
            n3 = 3;
        String result = "";

        if(n1==n2 && n1==n3){
            result = "all equal";
        }else if(n1==n2 && n1!=n3) {
            result = "n1&n2 are equal";
        }else if(n1!=n2 && n2==n3) {
            result = "n2&n3 are equal";
        }else if(n1!=n2 && n1==n3) {
            result = "n3&n1 are equal";
        }else{
            result ="none of them are equal";
        }
            System.out.println(result);

    }
}
