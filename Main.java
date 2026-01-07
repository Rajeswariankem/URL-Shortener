import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        URLShortener url=new URLShortener();
        
        while (true) {
            System.out.println("*****MENU*****");
            System.out.println("1.Shorten URL");
            System.out.println("2.Get Original URL");
            System.out.println("3.Exit");
            System.out.println("Enter your choice :");

            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the URL to shorten : ");
                    String longurl=sc.nextLine();
                    String res=url.shorttolong(longurl);
                    if(res.equals("Invalid URL"))
                        System.out.println("Invalid URL entered. Try again!");
                    else
                        System.out.println("Short URL : "+url.shorttolong(longurl));
                    break;
                case 2:
                    System.out.println("Enter short URL : ");
                    String shorturl=sc.nextLine();
                    res=url.getOriginal(shorturl);
                    if(res.equals("Invalid URL"))
                        System.out.println("Invalid URL entered. Try again!");
                    else
                        System.out.println("Original URL : "+res);
                    break;
                case 3:
                    System.out.println("Thank you for using URL Shortener!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
