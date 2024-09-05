public class Student_mark {
    public static void main(String[] args) {
        int [] array={10,10,20,20,20,30,32,33,35,40,41,45,50,55,56,60,60,66,70,72,74,88,85,90,99,100,100,100};
        for(int i=0;i<=100;i++){
            int count=0;
            for(int j:array){
                if(i==j){
                    count=count+1;
                }   
            }
            System.out.println("Student score mark  "+ i + " in the exam: "+ count);
        } 

    }
    
}
