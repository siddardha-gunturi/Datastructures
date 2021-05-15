class Linkedlist {
  Node head;
  //insert at last
  void insert(int val) {
    Node curr = new Node(val);
    if(head==null) {
      head = curr;
    }
    else
    {
      Node temp = head;
      while(temp.next!=null) {
        temp = temp.next;
      }
      temp.next = curr;
    }
  }
//insert elements at first
  void insertFirst(int val) {
    Node curr = new Node(val);
    if(head==null) {
      head = curr;
    }
    else {
      curr.next = head;
      head = curr;
    }
  }
//print linked list items
  void print() {
    if(head==null) {
      return ;
    }
    else {
      Node temp = head;
      while(temp!=null) {
        System.out.println(temp.data);
        temp = temp.next;
      }
    }
  }
//search for an element
  boolean search(int val) {
    Node temp = head;
    while(temp!=null) {
      if(temp.data==val) {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }
  //insert at position start with 0
  void insertAtPosition(int val,int pos) {
    Node curr = new Node(val);
    if(pos==0) {
      curr.next = head;
      head = curr;
    }
    else {
      Node temp = head;
      for(int i=0;i<pos-1;i++) {
        temp = temp.next;
      }
      curr.next = temp.next;
      temp.next = curr;
    }
  }
  //get position of an element
  int getPosition(int val) {
    int pos = 0;
    Node temp = head;
    while(temp!=null) {
      if(temp.data==val) {
        return pos;
      }
      else {
        pos++;
        temp = temp.next;
      }
    }
    return -1;
  }
  //delete element
  //delete at positon is even covered
  void delete(int val) {
    int pos = getPosition(val);
    System.out.println("position"+ pos);
    Node temp = head;
    if(pos==-1) {
      //no such value so no delete operation
    }
    else if(pos==0) {
      head = head.next;
    }
    else {
      for(int i=0;i<pos-1;i++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }
  }
  //implement a sorted list
  void insertSort(int val) {
    Node curr = new Node(val);
    if(head==null) {
      head = curr;
    }
    else {
      int pos = 0;
      Node temp = head;
      while(temp!=null && temp.data < key) {
        temp = temp.next;
        pos++;
      }
      insertAtPosition(val,pos);
    }
  }
  //append list to another Linkedlist
  void appendList(Linkedlist l1) {
    Node temp = this.head;
    while(temp!=null) {
      temp = temp.next;
    }
    temp.next = l1.head;
  }
}
