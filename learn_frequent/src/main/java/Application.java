public class Application {

    static void print(Object a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
      int i = 128;
      print((byte)i);
    }
}
