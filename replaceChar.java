public class replaceChar {
    public static void main(String[] args) {
        String str= "Aatif";
        char a='a';
        char b='@';
        str=str.toLowerCase();
       String result= str.replace(a, b);
       System.out.println(result);
    }
}
