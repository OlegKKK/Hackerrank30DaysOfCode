//Day 18: Queues and Stacks

import java.util.LinkedList;
import java.util.Scanner;

public class QueuesAndStacks {
    private LinkedList stack;
    private LinkedList queue;

    public QueuesAndStacks() {
        this.stack = new LinkedList();
        this.queue = new LinkedList();
    }

    private char popCharacter() {
        return (char) this.stack.pop();
    }

    private void pushCharacter(char c) {
        this.stack.push(c);
    }

    private char dequeueCharacter() {
        return (char) this.queue.remove(0);
    }

    private void enqueueCharacter(char c) {
        this.queue.addLast(c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();

        Solution p = new Solution();

        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
