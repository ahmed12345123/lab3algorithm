package lab3;

import java.util.ArrayList;

public class lab3 {

  public static ArrayList<Integer> linearSearch(int[] arr, int target) {
      ArrayList<Integer> indices = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              indices.add(i);
          }
      }
      return indices;
  }

  public static void main(String[] args) {
      int[] array = {1, 3, 5, 3, 7, 3, 9};
      int target = 3;
      
      ArrayList<Integer> result = linearSearch(array, target);

      if (result.isEmpty()) {
          System.out.println("Target not found.");
      } else {
          System.out.println("Target found at indices: " + result);
      }
  }
}















//public class lab3 {
//
//    public static int binarySearch(int[] arr, int target) {
//        int left = 0, right = arr.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            } else if (arr[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1; 
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1, 3, 5, 7, 9, 11};  
//        int target = 7;  
//        int result = binarySearch(array, target);
//
//        if (result == -1) {
//            System.out.println("BinarySearch: Target not found.");
//        } else {
//            System.out.println("BinarySearch: Target found at index: " + result);
//        }
//    }
//}





























//public class lab3 {
//
//    static class Node {
//        int data;
//        Node prev, next;
//
//        Node(int data) {
//            this.data = data;
//            this.prev = null;
//            this.next = null;
//        }
//    }
//
//    static class DoublyLinkedList {
//        Node head;
//
//        public void append(int data) {
//            Node newNode = new Node(data);
//            if (head == null) {
//                head = newNode;
//                return;
//            }
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//            newNode.prev = temp;
//        }
//
//        public void bubbleSort() {
//            if (head == null) return;
//            boolean swapped;
//            Node current;
//
//            do {
//                swapped = false;
//                current = head;
//
//                while (current.next != null) {
//                    if (current.data > current.next.data) {
//                        int temp = current.data;
//                        current.data = current.next.data;
//                        current.next.data = temp;
//                        swapped = true;
//                    }
//                    current = current.next;
//                }
//            } while (swapped);
//        }
//
//        public void display() {
//            Node temp = head;
//            while (temp != null) {
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        DoublyLinkedList dll = new DoublyLinkedList();
//        dll.append(4);
//        dll.append(3);
//        dll.append(2);
//        dll.append(1);
//
//        System.out.println("Before Sorting:");
//        dll.display();
//
//        dll.bubbleSort();
//
//        System.out.println("After Sorting:");
//        dll.display();
//    }
//}
