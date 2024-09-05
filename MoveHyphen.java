public class MoveHyphen {
    public static void main(String[] args) {
        int count=0;
        String ans="";
        String slash="";
        String str ="String-Compare";
        String[] result=str.split("-");
        for(String i : result){
            count++;
        }
        for(int k=0;k<count-1;k++){
            slash=slash+"-";
        }

        for(int j=0;j<count;j++){
            ans=ans+result[j];
        }
        
        System.out.println(slash+ans);
    }
}
