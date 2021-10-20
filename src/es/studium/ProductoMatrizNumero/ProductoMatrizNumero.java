package es.studium.ProductoMatrizNumero;

import java.util.Scanner;

public class ProductoMatrizNumero
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
        int[][]matriz1=new int[3][3];
        int[][]matriz2=new int[3][3];
        int numero;
        System.out.println("Indique el número que multiplicará a la matriz: ");
        numero = teclado.nextInt();
        for (int i=0;i<=2;i++)
        {
                    for (int j=0;j<=2;j++)
                    {
                               System.out.println("Indique el número de la matriz situado en la posición "+i+","+j);
                               matriz1[i][j] = teclado.nextInt();
                    }
        }
        System.out.println("");                                    
        System.out.println("La matriz es:\n");
        for (int i=0;i<=2;i++)
        {
                    for (int j=0;j<=2;j++)
                    {
                               System.out.print("\t"+matriz1[i][j]);
                    }
                    System.out.println("");
        }
        System.out.println(""); 
        for (int i=0;i<=2;i++)
        {
                    for (int j=0;j<=2;j++)
                    {
                               matriz2[i][j]=matriz1[i][j]*numero;
                    }
        }
        System.out.println("La matriz producto es:\n");
        for (int i=0;i<=2;i++)
        {
                    for (int j=0;j<=2;j++)
                    {
                               System.out.print("\t"+matriz2[i][j]);
                    }
                    System.out.println("");
        }
        teclado.close();                                              



	}

}
