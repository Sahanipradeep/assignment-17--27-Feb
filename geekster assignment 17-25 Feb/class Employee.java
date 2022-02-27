public class Employee{
    String name;
    int employee_id;
    public static void main(String[] args){
        Employee[] s=new Employee[4];
        s[0].name="Ram";
        s[1].name="Shyam";
        s[2].name="Mohan";
        s[3].name="Karan";
        s[0].employee_id=1234;
        s[1].employee_id=4569;
        s[2].employee_id=1642;
        s[3].employee_id=8855;
        for(int i=0;i<4;i++){
            System.out.println("Employee name is:"+s[i].name);
            System.out.println("Employee id is:"+s[i].employee_id);
        }
    }
    
}