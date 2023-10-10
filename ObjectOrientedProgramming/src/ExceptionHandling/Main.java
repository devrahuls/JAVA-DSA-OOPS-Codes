package ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        try {
//            divide(2, 0);

            String name = "rahul";
            if(name.equals("rahul")){
                throw new MyException("Naam Rahul nahi ho sakta bc");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){              //This is more restrictive, ArithmeticException includes only arithmetic exceptions, and it also a subclass of Exception.
            System.out.println(e.getMessage());
        }catch (Exception e){                    //This is less restrictive, Exception includes all types of exceptions. If we put this catch at first and then it will show error.
            System.out.println("Normal Exception");
        }
        finally {
            System.out.println("It will always run");
        }
    }

    private static int divide (int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please dont divide by 0");
        }
        //throw -> means, you are throwing an exception.
        //throws -> means, you are declaring exception.
        return a / b;
    }


}
