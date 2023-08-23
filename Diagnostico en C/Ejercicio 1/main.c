#include <stdio.h>
#include <stdlib.h>

#define CANT_FILAS 5

int main()
{
    if (CANT_FILAS == 0)
    {
        printf ("Matriz vacia.");
        return 1;
    }

    int matriz [CANT_FILAS][CANT_FILAS] =
    {
        {2,2,3,1,1},
        {4,2,6,1,1},
        {7,8,4,1,1},
        {1,1,1,8,1},
        {1,1,1,1,15}
    };

    int acum;

    for (int i = CANT_FILAS - 1; i > 0; i--)
    {
        acum = 0;
        for (int j = i - 1; j >= 0; j--)
        {
            acum += matriz [j][j];
        }
        if (acum != matriz [i][i])
        {
            printf ("No comprueba la regla");
            return -1;
        }
    }

    printf ("Comprueba la regla");

    return 0;
}
