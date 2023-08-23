#include <stdio.h>
#include <stdlib.h>

#define CANT_FILAS 2
#define CANT_COLUM 3

int main()
{
    if (CANT_COLUM * CANT_FILAS == 0)
    {
        printf ("Matriz vacia.");
        return 1;
    }

    int matriz [CANT_FILAS][CANT_COLUM] =
    {
        {1,2,3},
        {4,0,6}
    };

    for (int i = 0; i < CANT_FILAS; i++)
    {
        for (int j = 0; j < CANT_COLUM; j++)
        {
            if (matriz[i][j] == 0)
            {
                printf ("La multiplicacion da 0");
                return -1;
            }
        }
    }

    printf ("La multiplicacion no da 0");

    return 0;
}

