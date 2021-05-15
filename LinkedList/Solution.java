public class Solution {
  public static void main(String[] args) {
    Linkedlist l = new Linkedlist();
    l.insert(10);
    l.insert(19);
    l.insert(18);
    l.insert(16);
    l.insertFirst(21);
    l.insertAtPosition(23,1);
    l.insertAtPosition(25,0);
    l.delete(10);
    l.print();
    System.out.println(l.search(19));
    System.out.println(l.search(20));
  }
}
