package leetcode;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println("trying negatvie");
        System.out.println(reverseInt(-3544));
    }

    public static int reverseInt(int input)
    {
        StringBuilder reverseInt = new StringBuilder("");
        char[] c = String.valueOf(input).toCharArray();
        for (int i = c.length -1 ; i >= 0; i--) {
            reverseInt.append(c[i]);
        }
        // Check if the input was negative
        if (input < 0) {
            // Remove the negative sign from the end and place it at the beginning
            reverseInt.deleteCharAt(reverseInt.length() - 1);
            reverseInt.insert(0, '-');
        }
        return Integer.parseInt(reverseInt.toString());
    }



        public static int reverseUsingWhile(int x) {
            int reversed = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;

                // Check for overflow before multiplying and adding
                if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

                reversed = reversed * 10 + pop;
            }
            return reversed;
        }

        public static int reverse(int x)
    {
        String userInput = String.valueOf(x);
        StringBuilder strBuilder = new StringBuilder();
        boolean isInputNegative = false;
        long reverseLong = 0;

        if(x<0)
        {
            isInputNegative = true;
            userInput = userInput.substring(1);
        }

        for (int i = userInput.length() -1 ; i >= 0; i--) {
            strBuilder.append(userInput.charAt(i));
        }
        strBuilder = isInputNegative ? strBuilder.insert(0, '-') : strBuilder;

        reverseLong = Long.parseLong(strBuilder.toString(), 10);

        if(reverseLong<=Integer.MAX_VALUE && reverseLong>=Integer.MIN_VALUE)
        {
            return Integer.valueOf(strBuilder.toString());
        }
        else
        {
            return 0;
        }
    }

}
