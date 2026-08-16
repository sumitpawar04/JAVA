#include<stdio.h>

void Display(int No)
{
   static int iCnt = 0;
    
    if(iCnt < No)
    {
        printf("Jay Ganesh....\n");
        iCnt++;
        Display(No);     // Recursive call
    }
}

int main()
{
    Display(4);
    printf("end of main\n");
    return 0;
}  