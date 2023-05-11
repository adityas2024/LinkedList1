import java.util.*;

public class LinkedList1 {

public LinkedList1()   // constructor
 {
    System.out.println("LinkedList1");
    System.out.println("------------");
    linkedList1();
     System.out.println("LinkedList2");
     System.out.println("------------");
     linkedList2();
     System.out.println("LinkedList3");
     System.out.println("------------");
     linkedList3();
}
 public void linkedList1(){
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(20);
    list.add(0,5);
    list.add(2,15);
    System.out.println("first = " + "<" + list.getFirst() + ">");
    System.out.println("last = " + "<" + list.getLast() + ">");
     System.out.println("size = " + list.size());

     for (int a : list) {
         System.out.println(a + " ");
     }

     list.remove(1);

     for (int a : list){
         System.out.println(a + "");
     }

 }
 public void linkedList2(){
     LinkedList<String> list2 = new LinkedList<>();
     list2.addFirst("Elephant");
     list2.addLast("Lion");
     list2.addFirst("Cheetah");
     list2.addLast("Chimpanzee");
     list2.addFirst("Giraffe");
     System.out.println("first = " + "<" + list2.getFirst() + ">");
     System.out.println("last = " + "<" + list2.getLast() + ">");
     System.out.println(list2.toString());

/*
     Iterator iter = list2.iterator();
     while (iter.hasNext())
         System.out.println(iter);
     */
     list2.removeFirst();
     list2.removeLast();





 }
 public void linkedList3(){

}

    public static void main(String[] args) {
  LinkedList1 app = new LinkedList1();
    }




}
