public class logicalop {
    public static void main(String[] args){
        int x=5;
        int y=3;
        int a=10;
        int b=5;
        boolean res=x>y && a>b;// if both true then only it will give true
        System.out.println(res);

        boolean r=x>y || a>b;// if one is true then  it will give true
        System.out.println(r);

        boolean s=!r;// reverse if its true it will give fasle
        System.out.println(!s);
    }
    
}
