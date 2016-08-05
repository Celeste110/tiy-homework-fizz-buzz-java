/**
 * Created by katherine_celeste on 8/5/16.
 */
public class FizzBuzz {

    public static void doIt(int start, int end)
    {
        int counter = 1;

        //multiples of both 3 & 5
        while (start <= end)
        {
            if (counter%28 == 0)
            {
                System.out.println();
            }

            if ((start % 3 == 0) && (start % 5 ==0)) {
                System.out.print("FizzBuzz ");
            }
            //multiples of 3
            else if (start % 3 == 0) {
                System.out.print("Fizz ");
            }
            //multiples of 5
            else if (start % 5 ==0) {
                System.out.print("Buzz ");
            }
            else //print number to screen if it's not a multiple of 3 or 5
                {
                    System.out.print(start+" ");

                }
            start++;
            counter++;
        }

    }
}

