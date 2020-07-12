package easy;

public class test {

    public static void main(String[] args) {
        int index = 5;
        System.out.println(fun(index));
    }

    private static int fun(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return fun(n-1) + fun(n -2);
    }


}
