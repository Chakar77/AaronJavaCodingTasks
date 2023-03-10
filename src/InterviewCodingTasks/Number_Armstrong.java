package InterviewCodingTasks;

public class Number_Armstrong {

    /*
    Write a method that can check if a number is Armstrong number
     */

    public boolean isArmStrongNumber(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }

        return c == b;
    }

}
