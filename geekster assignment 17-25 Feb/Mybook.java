
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
 class MyBook extends Book{
     abstract void setTitle(String s){
         System.out.println("The title is: A tale of two cities")
     }
     public static void main(String[] args){
         MyBook s=new MyBook();
         s.setTitle();
     }
 }
