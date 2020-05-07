package fila;

public class Coracao {
	
	 public static void main(String args[])
     {
        int mat[][]= {
              {0,0,1,1,1,1,0,0,1,1,1,1,0,0},
              {0,1,0,0,0,0,1,1,0,0,0,0,1,0},
              {1,0,0,0,0,0,0,0,0,0,0,0,0,1},
              {1,0,0,0,0,0,0,0,0,0,0,0,0,1},
              {0,1,0,0,0,0,0,0,0,0,0,0,1,0},
              {0,0,1,0,0,0,0,0,0,0,0,1,0,0},
              {0,0,0,1,0,0,0,0,0,0,1,0,0,0},
              {0,0,0,0,1,0,0,0,0,1,0,0,0,0},
              {0,0,0,0,0,1,0,0,1,0,0,0,0,0},
              {0,0,0,0,0,0,1,1,0,0,0,0,0,0},
              {0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
     
        mostrarMatriz(mat);
        int x=3, y=7; //ponto de inicio da pintura  
        System.out.println("Coordenadas iniciais: x = " + x + ", y = " + y + "\n\n");
        Fila f = new Fila(1000);
        f.enfileirar(x);
        f.enfileirar(y); 
	        while(!f.vazia())
	        {
	           x=f.desenfileirar();
	           y=f.desenfileirar(); 
	           if(mat[x][y] == 0) //pode ser pintado?
	           {
	              mat[x][y] = 2; //pintei
	              if((x+1)<mat.length && mat[x+1][y] == 0) //baixo
	              {
	                 f.enfileirar(x+1);
	                 f.enfileirar(y);
	              }
	              if((x-1)>=0 && mat[x-1][y] == 0) //cima
	              {
	                 f.enfileirar(x-1);
	                 f.enfileirar(y);
	              }
	              
	              if((y+1)<mat[0].length && mat[x][y+1] == 0) //direita
	              {
	                 f.enfileirar(x);
	                 f.enfileirar(y+1);
	              }
	              if((y-1)<mat[0].length && mat[x][y-1] == 0) //esquerda
	              {
	                 f.enfileirar(x);
	                 f.enfileirar(y-1);
	              }
	           }
	        }
	        mostrarMatriz(mat);
        }
	 
	 public static void mostrarMatriz(int mat[][]) {
		 for (int l = 0 ; l < mat.length ; l++) { //-> linha
			 for (int c = 0 ; c < mat[0].length ; c++) { // _> coluna
				 if (mat[l][c] == 0 ) { System.out.print(" "); 
				 } else if (mat[l][c] == 1) { System.out.print("-"); }
						 else if (mat[l][c] == 2) {System.out.print("*");}
			 }
			 System.out.println();
		 }
					 
	}
}
