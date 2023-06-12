public class OOPS{
    public static void main(String args[]){
        //creating an object for the class pen 
            Pen p1=new Pen();
            p1.color="skyblue";
            p1.tip_size=5;
            System.out.println(p1.color);
            System.out.println(p1.tip_size);
            p1.setColor("purple");
            p1.setTipSize(7);
            
            System.out.println(p1.color);
            System.out.println(p1.tip_size);
            System.out.println(p1.getColor());
            System.out.println(p1.getTipSize());

    }
}
class Pen{
    // contains -- properties & functions
    String color;
    int tip_size;
    String  getColor(){
        return this.color;
    }
    int getTipSize(){
        return this.tip_size;
    }
    void setColor(String newcolor){
        color= newcolor;
    }
    void setTipSize(int newtipSize){
        tip_size=newtipSize;
    }
}