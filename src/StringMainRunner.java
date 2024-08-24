public class StringMainRunner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.printf("Integer cache value from -127 to 127");
        System.out.printf("if i1& i2 have value in that range using '==' returns true");
        Integer i1 = 128;  // Uses Integer cache
        Integer i2 = 128;  // Uses Integer cache
        System.out.println(i1 == i2); // true
    }
}