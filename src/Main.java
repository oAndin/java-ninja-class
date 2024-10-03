import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initializing the scanner so i can read the data from the user
        Scanner sc = new Scanner(System.in);

        // Define the int number which will set the array length
        System.out.println("Quantos ninjas você quer criar?");
        int n = sc.nextInt();
        Ninja[] ninjasArray = new Ninja[n];


        for (int i = 0; i < n; i++){
            System.out.println("Crie seu ninja!");
            System.out.println("Digite o nome do seu ninja:");
            String name = sc.next();
            System.out.println("Digite a idade do seu ninja:");
            int age = sc.nextInt();
            ninjasArray[i] = new Ninja(name,age);
        }

        for (int i = 0; i < ninjasArray.length; i++){
            System.out.println(ninjasArray[i]);
        }

        sc.close();
    }
}