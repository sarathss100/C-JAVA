/*
 ============================================================================
 Name        : Input&Variable.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int number1;
	setbuf (stdout,NULL);
	printf("Please enter a number : ");
	scanf("%d",&number1);
	printf("You've entered %d",number1);
	return EXIT_SUCCESS;
}
