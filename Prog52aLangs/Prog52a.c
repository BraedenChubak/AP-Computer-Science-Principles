#include <stdio.h>

int main()
{
    printf("Enter Length: ");
    int length;
    scanf("%d", &length);
    printf("Enter Width: ");
    int width;
    scanf("%d", &width);
    int area = length * width;
    int perim = length * 2 + width * 2;
    printf("\nThe Area is %d", area);
    printf("\nThe Perimeter is %d", perim);

    return 0;
}