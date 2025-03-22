public class HelloWorld{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        scanner.nextline();
        System.out.println("Enter your full name");
        String fullName = scanner.nextline();
        System.out.println("Hello!" + fullName);
        scanner.close();
    }
}