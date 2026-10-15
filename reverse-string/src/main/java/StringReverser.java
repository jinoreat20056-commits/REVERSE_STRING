public class StringReverser {
    public String reverse(String s) {
        if (s == null) throw new IllegalArgumentException("Text must not be null");
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) { System.out.println(new StringReverser().reverse("hello")); }
}
