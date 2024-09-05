//

public class volume {
    int len;
    int breath;
    int width;
    volume(int len,int breath,int width){
        this.len=len;
        this.breath=breath;
        this.width=width;
    }
    int display(){

        int result=len*breath*width;
        System.out.print(result);
        return result;
    }

    public static void main(String[] args) {
        int len=5,breath=5,width=5;
        volume vol= new volume(len, breath, width);
        vol.display();
        
    }
}
