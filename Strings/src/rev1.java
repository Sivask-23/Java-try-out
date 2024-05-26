public class rev1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Siva");
        String S1="malayalam";
        String str = " ";
        System.out.println(sb.length());
        for (int i=sb.length()-1;i>=0;i--){
            str += sb.charAt(i);
        }
        System.out.println(str);
    }
}