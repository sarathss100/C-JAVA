/*
 ============================================================================
 Name        : For.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i,sum=0,n;
	setbuf(stdout,NULL);
	printf("Enter a limit : ");
	scanf("%d",&n);
	for (i=1;i<=n;i++) {
		sum=sum+i;
	}
	printf("%d\n",sum);
	return EXIT_SUCCESS;
}
