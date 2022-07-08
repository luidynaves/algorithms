#Find Largest Binary Gap

Find how many zeros contains on a largest gap between two ones in a binary number representation. 

For instance: 
10001 binary number has 3 binary gaps. 
1001000010 has a 4 binary gaps.
1001000000 has a 2 binary gaps.
11111 has zero binary gaps.

Receiving a N integer as an argument, return the largest binary gap.

0 < N < Integer.Max()

Solution:

It's a bitwise operation.

1. In a loop find the first bit one number from right to left
2. a second loop start from the first bit one number and move from right to left using (<<)
3. Inside second loop check if number is 1 using & operator
   1. if gap counter is greater than largest gap set as a new largest, otherwise keep it.
   2. start gap counter from -1
4. increment gap counter
5. return to second loop til zero

```java
public static int findLargestBinaryGap(int number) {
        int pointer;
        for(pointer=1; pointer>0; pointer<<=1)
            if((number&pointer) != 0)
                break;

        int gapCount=0;
        int largestBinaryGap=0;

        for(; pointer>0; pointer<<=1) {
            if((number&pointer) != 0) {
                largestBinaryGap = gapCount < largestBinaryGap ? largestBinaryGap : gapCount;
                gapCount=-1;
            }
            gapCount++;
        }
        return largestBinaryGap;
    }
```