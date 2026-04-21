
public class HelloApp {
    public static void main(String[] args) {
        String message = "";
        if(args.length == 0) {
            message = "world";
        }else{
            for(int i =0; i < args.length;i++) {
                message += args[i];

                if ( i < args.length-1){
                    message+=",";
                }
            }
        }
        System.out.println("hello,"+message + "!");
    }
}