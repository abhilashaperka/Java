class ThrowKeyword{
    public static void main(String args[]){
        int a=50;
        int b=0;
        try{
            b=15/a;
            if(b==0)
                throw new ArithmeticException("i don't want to print zero");
        }
        catch(ArithmeticException e){
            b=15/1;
            System.out.println("that's the default output "+e);
        }
        catch(Exception e){
            System.out.println("something went wrong..");
        }
        System.out.println(b);

    }
}