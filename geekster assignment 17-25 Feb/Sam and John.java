public class Student {
    
    public void Sam(){
        int roll_no=2;
    long phone_number=9753435788l;
    String address="Delhi";
    System.out.println("Sam's roll no:"+roll_no);
    System.out.println("phone_number:"+phone_number);
    System.out.println("address:"+address);
    }
    
    public void John(){
        int roll_no=3;
    long phone_number=6353435788l;
    String address="Mumbai";
    System.out.println("John's roll no:"+roll_no);
    System.out.println("phone_number:"+phone_number);
    System.out.println("address:"+address);
    }
    

    public static void main(String[] args){
        Student s=new Student();
        s.Sam();
        s.John();
    }
}
