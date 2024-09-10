import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first mark: ");
        int a = input.nextInt();
        System.out.println("enter your seconde mark: ");
        int b = input.nextInt();
        System.out.println("enter your third mark: ");
        int c = input.nextInt();
        if (a>33 && b>33 && c>33) {
            float moy = (a+b+c)/3;
            if (moy>40) {
                System.out.printf("you pass whith a gpa of %f ",moy);
            }else{
                System.out.println("you fail");
            }
        }else{
            System.out.println("you con not pass whith a module under 33%");
        }
    }
}
