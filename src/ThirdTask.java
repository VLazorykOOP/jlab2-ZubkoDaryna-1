import java.util.Scanner;
import java.util.Stack;


public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack stack = new MyStack();
        System.out.println("Print values for stack. If you want to stop, type 'stop'");
        while (true) {
            String input = scanner.next();       //function parses a string argument and returns an integer
            if (input.equals("stop")) {
                break;
            }
            stack.push(Integer.parseInt(input));
        }

        System.out.println("Type 'r' for removing and 's' for searching. If you want to stop, type 'stop'");
        while (true) {
            String option = scanner.next();

            if (option.equals("stop")) {
                break;
            }

            switch (option) {
                case "r":
                    if (!stack.isEmpty()) {
                        while (true) {
                            System.out.println("Enter the value to remove (or 'stop' to stop removing):");
                            String removeInput = scanner.next();
                            if (removeInput.equals("stop")) {
                                break;
                            }

                            int removeValue = Integer.parseInt(removeInput);

                            if (stack.containsValue(removeValue)) {
                                stack.removeValue(removeValue);
                                System.out.println("Value " + removeValue + " has been removed from the stack.");
                            } else {
                                System.out.println("Value " + removeValue + " was not found in the stack.");
                            }
                        }
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case "s":
                    if (!stack.isEmpty()) {
                        while (true) {
                            System.out.println("Enter the value to search (or 'stop' to stop searching):");
                            String searchInput = scanner.next();
                            if (searchInput.equals("stop")) {
                                break;
                            }
                            int searchValue = Integer.parseInt(searchInput);

                            if (stack.containsValue(searchValue)) {
                                System.out.println("Value " + searchValue + " was found in the stack.");
                            } else {
                                System.out.println("Value " + searchValue + " was not found in the stack.");
                            }
                        }
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

            }
        }


        System.out.println("Your stack here:");
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value);
        }
        scanner.close();
    }
    }

