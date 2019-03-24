#include <stdio.h>
int main() {
	//Type your code
  int num, sum=0, firstDigit, lastDigit;
 
    //printf("Enter any number: ");
    scanf("%d", &num);
 
    lastDigit = num % 10;
 
    firstDigit = num;
 
    while(num >= 10)
    {
        num = num / 10;
    }
    firstDigit = num;
 
     //Finding sum of first and last digit
    sum = firstDigit + lastDigit;
 
    printf("%d", sum);
	return 0;
}