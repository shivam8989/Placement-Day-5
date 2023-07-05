public class Main {
    public static void main(String[] args) {
        String a = "My Nmae is Shivam";
        int count = a.length();
        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i)==' '){
                count--;
            }


        }
        System.out.println(count);

        System.out.println("Hello world!");
    }
}