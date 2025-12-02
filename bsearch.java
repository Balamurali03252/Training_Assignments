
package javacodingAssignment;

import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of sorted array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int left = 0, right = n - 1, mid;
        boolean found = false;

        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }

        if (!found) {
            System.out.println("Element not found in array");
        }

        sc.close();
    }
}
