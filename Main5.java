public class Main5 {
    public static void main(String[] args) {
        String str = "Hello World";
        int l = 0;
        if(str.length()>0){

            for(char val : str.toCharArray()) {
                System.out.println(val);
                l++;
            }
        }
        else {System.out.println("no Argument");}

        System.out.println("the length of string: "+l);
    }
}
