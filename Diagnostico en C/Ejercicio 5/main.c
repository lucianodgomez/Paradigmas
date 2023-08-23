#include <stdio.h>
#include <stdlib.h>

#define CANTFILAS 5
#define CANTCOLUM 5

int main()
{
    if (CANTFILAS * CANTCOLUM == 0)
    {
        printf ("Matriz vacia.");
        return 1;
    }

    int matriz [CANTFILAS][CANTCOLUM] =
    {
        {1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20},
        {21, 22, 23, 24, 25}
    };

    int limMax = (2 * CANTFILAS) - 2;

    int limMin = 0;

    int resultado [limMax + 1][CANTCOLUM];

    for (int i = 0; i < CANTFILAS; i++)
    {
        for (int j = limMin; j < CANTFILAS; j++)
        {
            resultado [j][limMin] = matriz [(j-CANTFILAS+1-limMin)*(-1)][limMin];
        }
        limMin++;
    }

    limMin = 0;

    for (int j = limMin + 1; j < CANTFILAS; j++)
    {
        for (int i = CANTFILAS, k = limMin + 1; i < (CANTFILAS*2)-1-limMin; i++, k++)
        {
            resultado [i][limMin] = matriz [limMin][k];
        }
        limMin++;
    }

    limMin = 1;
    limMax = (CANTFILAS * 2) - 1;

    for (int i = 0; i < CANTFILAS; i++)
    {
        for (int j = 0; j < limMin; j++)
        {
            printf ("%3d ", resultado [i][j]);
        }
        printf ("\n");
        limMin++;
    }

    limMin = CANTFILAS-1;

    for (int i = CANTFILAS; i < limMax; i++)
    {
        for (int j = 0; j < limMin; j++)
        {
            printf ("%3d ", resultado [i][j]);
        }
        printf ("\n");
        limMin--;
    }

    return 0;
}
