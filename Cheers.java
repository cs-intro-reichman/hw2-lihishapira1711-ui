
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args)
         {
	    // Replace this comment with your code
            String word = args[0];
            int n = Integer.parseInt(args[1]);
            word = word.toUpperCase();
            String spelling = "AEFHILMNORSX";
            for (int i = 0; i < word.length(); i++)
               if (spelling.indexOf(word.charAt(i)) == -1)
              {
                        System.out.println("Give me a  " + word.charAt(i) + ": "+word.charAt(i)+"!");
                }
                 else   System.out.println("Give me an " + word.charAt(i) + ": "+word.charAt(i)+"!");
       
            System.out.println("What does that spell?");
                for (int j = 0; j < n; j++)
                {
                        System.out.println(word + "!!!");
                }

        }
}
