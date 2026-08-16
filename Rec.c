#include<stdio.h>

void Display(int No)     // callee
{
    int iCut = 0;

    while(iCut < No)
    {
        printf("jay Ganesh....\n");
        iCut++;
    }
}

int main()
{
    Display(4);

    return 0;
}