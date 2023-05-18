/* Esempio algoritmo di ordinamento Bubble sort */
int test;
double x[5];
int hello;
int i,j;
int pos;
x[0] = 3;
x 1] = -3.0;
x[2] = 3.0;
x[3] = 5.0;
x[4] = 2.5;
/* Bubble sort */
i = i + 1;
pos = 5;
while (pos > 0)
{
    i = 0;
    while (i < pos - 1)
    {
        j = i + 1;
        if (x[i] > x[j])
        {
            swap = x[j];
            x[j] = x[i];
            x[i] = swap;
        }
        else{
            i = i + 1;
        }
        
    }
    pos = pos - 1;
}
/* Stampa risultati */
i = 0;
while (i < 5)
{
    print(x[i]);
    i = i + 1;
}