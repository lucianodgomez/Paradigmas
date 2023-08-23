#include <stdio.h>
#include <stdlib.h>

#define CANTFILAS 3
#define CANTCOLUM 4

int main()
{
    if (CANTFILAS * CANTCOLUM == 0)
    {
        printf ("Matriz vacia.");
        return 1;
    }

    int matriz [CANTFILAS][CANTCOLUM] =
    {
        {1, 2, 3, 4},
        {-2, -6, -6, -2},
        {10, 15, 11, 10}
    };

    int vector [CANTFILAS];

    int cantOcurrencias, cantOcurrenciasMax;

    for (int i = 0; i < CANTFILAS; i++)
    {
        vector [i] = matriz [i][0];

        cantOcurrenciasMax = 1;

        for (int j = 0; j < CANTCOLUM; j++)
        {
            cantOcurrencias = 1;

            for (int k = j + 1; k < CANTCOLUM; k++)
            {
                cantOcurrencias += matriz [i][j] == matriz [i][k] ? 1 : 0;
            }

            if (cantOcurrencias > cantOcurrenciasMax)
            {
                vector [i] = matriz [i][j];
                cantOcurrenciasMax = cantOcurrencias;
            }

            if (cantOcurrencias == cantOcurrenciasMax)
            {
                vector [i] = vector [i] < matriz [i][j] ? matriz [i][j] : vector [i];
            }
        }
    }

    for (int i = 0; i < CANTFILAS; i++)
    {
        printf ("%3d ", vector[i]);
    }

    return 0;

}
