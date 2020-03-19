package recursividade1;

public class Exercicio1 {
	public static int fatorial(int n) { 
        if(n == 0) return 1; 
        else return n * fatorial(n - 1); 
    }

    public static int fibonacci(int n) {
        if (n <= 2) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somaNInteiros(int n) {
        if(n == 0) return 0;
        else return somaNInteiros(n - 1) + n; 
    }

    public static double potenciacao (double base, int exp) {
        if (exp == 0) return 1;
        else return potenciacao (base, exp - 1) * base;
    }

    public static int somaVet (int vet[ ], int n) {
        if (n < 0) return 0;
        else return somaVet (vet, n - 1) + vet [ n ];
    }
}
