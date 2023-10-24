import java.util.Scanner;
import java.util.Stack;

  class IntStack {
    Stack<Integer> stack = new Stack<Integer>();


public void push(int value){
    stack.push(value);
}

      public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");}
        return stack.pop();
    }
 public int remove(int value) {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        return stack.remove(value);
    }


public boolean  isEmpty(){
    return stack.empty();
}
 public boolean containValue(int value){
    return stack.contains(value);
 }
 public int size() {
    return stack.size();
}
public void removeByValue(int value) {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        if (stack.contains(value)) {
            stack.removeElement(value);
        } else {
            System.out.println("Елемент " + value + " не знайдено у стеці.");
        }
    }
}


public class MyStack {
    public static void main(String[] args) {
            IntStack stack = new IntStack(); // Створюємо об'єкт IntStack
    
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть цiлi числа до стеку (для завершення введіть 'q'): ");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("q")) {
                    break; 
                }
                try {
                    int value = Integer.parseInt(input);
                    stack.push(value);
                } catch (NumberFormatException e) {
                    System.err.println("Будь ласка, введіть цiле число.");
                }
            }
           

            System.out.println("Введiть 'p' для вилучення елемента, 'c' для пошуку елемента, 'q' для завершення:");
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("q")) {
                    break;
                }
                switch (input.toLowerCase()) {
                    case "p":
                    if (!stack.isEmpty()) {
                        System.out.print("Введiть число для вилучення: ");
                        String removeInput = scanner.nextLine();
                        try {
                            int removeValue = Integer.parseInt(removeInput);
                            stack.removeByValue(removeValue);
                          }
                           catch (NumberFormatException e) {
                            System.err.println("Будь ласка, введiть цiле число.");
                        }
                    } else {
                        System.out.println("Стек порожнiй");
                    }
                    break;
                case "c":
                    System.out.print("Введiть число для пошуку: ");
                    String searchInput = scanner.nextLine();
                    try {
                        int searchValue = Integer.parseInt(searchInput);
                        if (stack.containValue(searchValue)) {
                            System.out.println("Елемент " + searchValue + " знайдено в стецi");
                        } else {
                            System.out.println("Елемент " + searchValue + " не знайдено в стецi");
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Будь ласка, введiть цiле число.");
                    }
                    break;
                default:
                    System.err.println("Невiрна команда. Введiть 'p' для вилучення, 'c' для пошуку або 'q' для завершення.");
            }
        }

        System.out.println("Елементи стеку:");
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.println(value);
        }
            scanner.close();
        }
}
