class TV{
    public void switchOn(){
        System.out.println("Switch on the TV ");
    }
    public void changeChannel(){
        System.out.println("Change the channel: ");
        }
}
class SmartTV extends TV{
    public void switchOn(){
        System.out.println("Switch on the SmartTV ");

    }
    public void changeChannel(){
        System.out.println("Change the Smart tv channel: ");
        }
       public void browse(){
        System.out.println("Browse the smart tv");
       } 
}
public class Television{
    public static void main(String args[]){
        TV obj=new TV();
        obj.switchOn();
        obj.changeChannel();
        SmartTV obj1=new SmartTV();
        obj1.switchOn();
        obj1.changeChannel();
        TV su=new SmartTV();
        su.switchOn();
        su.changeChannel();
        
    }
}

