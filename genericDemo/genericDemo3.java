//  package genericDemo;
//
//  public class genericDemo3 {
//      public static void main(String[] args) {
//          myArray<Integer> ma = new myArray<>();
//          ma.append(10);
//          ma.append(20);
//          ma.append(30);
//
//          ma.display();
//      }
//  }
//
//  // creating generic type array
//  class myArray<T>{
//      T arr[] = (T[]) new Object[10];
//      int length = 0;
//
//      public void append(T obj){
//          arr[length] = obj;
//      }
//      public void display(){
//          for(int i=0;i<arr.length;i++){
//              System.out.println(arr[i]);
//          }
//      }
//  }