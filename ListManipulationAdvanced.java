import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        List<String> output = new ArrayList<>();
        String input = scanner.next();
        for (int i = 0; i < parts.length; i++) {
            output.add(parts[i]);
        }

        while (!input.equals("end")) {
            String[] temp = scanner.nextLine().split(" ");

                if (output.contains(temp[1])) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }



            if (temp[1].equals("even")) {
                    for (int i = 0; i < output.size(); i++) {
                        int number = Integer.parseInt(output.get(i));
                        if (number % 2 == 0) {
                            System.out.print(output.get(i) + " ");
                        }
                }
                System.out.println();
            }

            if (temp[1].equals("odd")) {
                    for (int i = 0; i < output.size(); i++) {
                        int number = Integer.parseInt(output.get(i));
                        if (number % 2 == 1) {
                            System.out.print(output.get(i) + " ");
                        }
                }
                System.out.println();
            }


            if (temp[1].equals("sum")) {
                int sum = 0;
                    for (int i = 0; i < output.size(); i++) {
                        int number = Integer.parseInt(output.get(i));
                        sum += number;
                }
                System.out.println(sum);
            }

            if (temp[1].equals(">=")){
                    for (int i = 0; i < output.size(); i++) {
                        int number = Integer.parseInt(output.get(i));
                        if (number >= Integer.parseInt(temp[2])) {
                            System.out.print(number + " ");
                        }
                    }
                System.out.println();
            }

            if (temp[1].equals(">")){
                for (int i = 0; i < output.size(); i++) {
                    int number = Integer.parseInt(output.get(i));
                    if (number > Integer.parseInt(temp[2])) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            }

            if (temp[1].equals("<")){
                for (int i = 0; i < output.size(); i++) {
                    int number = Integer.parseInt(output.get(i));
                    if (number < Integer.parseInt(temp[2])) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            }

            if (temp[1].equals("<=")) {
                for (int i = 0; i < output.size(); i++) {
                    int number = Integer.parseInt(output.get(i));
                    if (number <= Integer.parseInt(temp[2])) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            }

            input = scanner.next();

        }
    }
}