package java_simple_apps;

public class ZamienApp {
    public static void main(String[] args) {
        Zamien test = new Zamien("test");
        //System.out.println(test.getSlowo());
        String zamienMethod = new ZamienMethod().change_word(test);
        System.out.println(zamienMethod);
    }
}
