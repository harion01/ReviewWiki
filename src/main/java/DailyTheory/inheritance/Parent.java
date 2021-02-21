package DailyTheory.inheritance;

public class Parent {
    public Parent(){
        System.out.println("void parent constructor");
    }
    public Parent(String name){
        System.out.println("name : "+name);
    }

    public void print(){
        System.out.println("Printname() - parent");
    }

    private void personalPrint(){
        System.out.println("Parent personal");
    }


}
