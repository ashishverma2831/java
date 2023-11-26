//  package javadocdemo;

//  // import java.lang.annotation.*;

//  //@Retention(RetentionPolicy.Class)
//  //@Documented
//  //@Target(value=ElementType.LOCAL_VARIABLE,ElementType.METHOD)
//  //Repeatable(MyAnnoMA.class)
//  @interface MyAnnoMA
//  {
//      String name();
//      String project();
//      String date() default "today";
//      String version() default "13";
//  }

//  //@MyAnnoMA(name="Ajay",project="Bank")
//  public class annoDemo1
//  {
//      int data;
//      //@MyAnnoMA(name="Ajay",project="Bank")
    
    
//      //@MyAnnoMA(name="Ajay")
//      public static void main(String[] args)
//      {
//          //@MyAnnoMA(name="Ajay")
//          // int x;
//      }
//  }
