import java.util.Scanner;
class ExceptionHandling{
   
    void except(){
        int[] arr = {1,2,3,4,5};

        try{
            
            System.out.println("element in array " + arr[6]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception caught");
        }
    }
}

class main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int val;
        
        int[] arr = {1,2,3,4,5};

        System.out.println("enter the value: ");
        val = sc.nextInt();

        for(int i = 0; i < 5; i++){

            if(val == arr[i]){
                
                System.out.println("element found " + val);
                break;
            }

        }
        

        ExceptionHandling e = new ExceptionHandling();

        e.except();

        


    }
}