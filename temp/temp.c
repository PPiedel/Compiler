#include <stdio.h>



int main() {
   static int count = 5;
   printf("%d", count);

   int new = count;
   return 0;
}
