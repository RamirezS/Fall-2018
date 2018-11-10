1 public class BubbleSort {
2 /** Bubble sort method */
3 public static void bubbleSort(int[] list) {
4 boolean needNextPass = true;
5
6 for (int k = 1; k < list.length && needNextPass; k++) {
7 // Array may be sorted and next pass not needed
8 needNextPass = false;
9 for (int i = 0; i < list.length - k; i++) {
10 if (list[i] > list[i + 1]) {
11 // Swap list[i] with list[i + 1]
12 int temp = list[i];
13 list[i] = list[i + 1];
14 list[i + 1] = temp;
15
16 needNextPass = true; // Next pass still needed
17 }
18 }
19 }
20 }
21
22 /** A test method */
23 public static void main(String[] args) {
24 int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
25 bubbleSort(list);
26 for (int i = 0; i < list.length; i++)
27 System.out.print(list[i] + " ");
28 }
29 }
