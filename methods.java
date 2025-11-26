
class computer{
    public void playmusic()
    {
        System.out.println("playing music.....");
    }
    public String getMeAPen(int cost)
    {
        if(cost>5)
            return "pen";
        return "Nothing";
    }
    
}
public class methods {
    public static void main(String args[]){
       
        computer obj=new computer();
        obj.playmusic();
        String str=obj.getMeAPen(10);
        System.out.println(str);
    }
    
}
