#include <stdio.h>

int main(int argc, char *argv[])
{
    int i = 0;

    printf("Number of command line argumemts are : %d\n",argc);

    for(i = 0; i < argc; i++)
    {
        printf("%s\n",argv[i]);
    } 
    return 0;
}

// gcc Command.c -o myexe
// Myexe.exe PPA Marvellous 11 LB 21 Pune
