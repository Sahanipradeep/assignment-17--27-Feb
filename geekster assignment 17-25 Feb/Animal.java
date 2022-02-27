public class Animal{
   
    private String dogName;
    private String cowName;
    private String catName;
    private String elephantName;
    
}
public String getDog(){
    return dogName;
}
public String getCow(){
    return cowName;
}
public String getcat(){
    return catName;
}
public String getElephant(){
    return elephantName;
}
public String displayName(){
    return getDog()+" "+getCow()+" "+catName()+" "+getElephant();
    
}
piblic static void main(String[] args){
Animal a=new Animal("Tommy","Pou","cussy","Gianty");
a.displayName();
};