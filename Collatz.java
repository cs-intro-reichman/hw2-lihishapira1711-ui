// Demonstrates the Collatz conjecture.
public class Collatz {
    
    public static void main(String args[]) {

        int N_limit = Integer.parseInt(args[0]);
        String mode = args[1];
        int originalN = N_limit; 
        if (mode.equals("v")) {
            for (int seed = 1; seed <= N_limit; seed++) {
                long current = seed;
                int total_sequence_length; 
                if (seed == 1) {
                    System.out.println("1 4 2 1 (4)");
                    continue; 
                }
                System.out.print(current);
                total_sequence_length = 1; 
                while (current != 1) {
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = 3 * current + 1;
                    }
                    
                    System.out.print(" " + current);
                    total_sequence_length++;
                }
                System.out.println(" (" + total_sequence_length + ")");
            }
            
            System.out.println("Every one of the first " + originalN + " hailstone sequences reached 1.");
            
        } else if (mode.equals("c")) {
            
            for (int seed = 1; seed <= originalN; seed++) {
                long current = seed;
                while (current != 1) {
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = 3 * current + 1;
                    }
                }
            }
            
            System.out.println("Every one of the first " + originalN + " hailstone sequences reached 1."); 
        }
    }
}