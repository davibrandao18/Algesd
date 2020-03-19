package recursividade1;

public class Exercicio2 {
	public static int alg1 (int n) {
        if (n == 0) return 2;
        else return 2 * alg1 (n - 1) + 3;
    }

    public static int alg2(int n) {
        if (n == 0) return 1;
        else return 3 * alg2(n/2) + 1;
    }

    public static int alg3(int n) {
        if (n <= 0) return 2;
        else return 2 * alg3(n - 2) + 1;
    }

    public static int alg4(int n) {
        if (n <= 0) return 2;
        else return alg4(n - 1) * alg4(n - 2);
    }

    public static int alg5(int n, int k) {
        if(n == 0) return 0;
        else return alg5(n - 1, k) + k;
    }
}
