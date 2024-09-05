// – At least 4 characters
// – At least one numeric digit
// – At Least one Capital Letter
// – Must not have space or slash (/)
// – Starting character must not be a number

public class passwordcheck {
    public static void main(String[] args) {
        boolean digit=false;
        boolean caps=false;
        boolean space=true;
        boolean size=false;
        String pass="oat1fmKss";
       char [] arr= pass.toCharArray();

        if(Character.isDigit(arr[0])){
            System.out.println("bad");
        }
        else{

            for(int i:arr){
                if(arr.length>=4){
                    size=true;
                }
               if(Character.isUpperCase(i)){
                    caps=true;
                }
              if(Character.isDigit(i)){
                    digit=true;
                }
                if(Character.isWhitespace(i)){
                    space=false;
                }
               
               }
              

        }
        if(digit && caps && space && size ){
            System.out.println("good pass");
          }
          
       }
     
    

       
    }
