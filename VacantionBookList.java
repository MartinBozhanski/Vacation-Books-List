import java.util.Scanner;

public class VacantionBookList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lists = Integer.parseInt(scanner.nextLine());
        int listsperhour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int time = lists / listsperhour;
        int neededtime = time / days;

        System.out.println(neededtime);
    }
}
