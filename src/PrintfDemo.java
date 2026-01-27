public class PrintfDemo {
    public static void main(String[] args) {

        String name = "Me";
        double price = 12.304;

        System.out.printf("You are %s\n", name);
        System.out.printf("%.2f\n", price);
        System.out.printf("%+.2f\n", 12.4604);
        System.out.printf("%04d\n", 12);
    }
}
