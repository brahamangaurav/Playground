#include <stdio.h>
int main() {
	//Type your code
  int number, i;
    scanf("%d",&number);
    for(i=1; i <= number; ++i)
    {
        if (number%i == 0)
        {
            printf("%d",i);
          printf("\n");
        }
    }

	return 0;
}