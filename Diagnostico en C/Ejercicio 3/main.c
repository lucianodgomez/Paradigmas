#include <stdio.h>
#include <stdlib.h>

#define CANT_FILAS 3
#define CANT_COLUM 4

int main()
{
    if (CANT_COLUM * CANT_FILAS == 0)
    {
        printf ("Matriz vacia.");
        return 1;
    }

    int matriz [CANT_FILAS][CANT_COLUM] =
    {
        {8, 2, -3, 4},
        {5, -6, -6, 20},
        {21, 1, -5, 0}
    };

    int resultado [CANT_FILAS][CANT_COLUM];

    for (int i = 0; i < CANT_FILAS; i++)
    {
        for (int j = 0; j < CANT_COLUM; j++)
        {
            resultado[i][j] = matriz [i][j];
            resultado[i][j] += (i - 1 >= 0 ? matriz[i-1][j] : 0);
            resultado[i][j] += (i + 1 < CANT_FILAS ? matriz[i+1][j] : 0);
            resultado[i][j] += (j + 1 < CANT_COLUM ? matriz[i][j+1] : 0);
            resultado[i][j] += (j - 1 >= 0 ? matriz[i][j-1] : 0);
        }
    }

    printf ("El resultado es:");

    for (int i = 0; i < CANT_FILAS; i++)
    {
        printf ("\n");
        for (int j = 0; j < CANT_COLUM; j++)
        {
            printf ("%3d ", resultado[i][j]);
        }
    }

    return 0;
}
