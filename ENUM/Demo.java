enum Direction { North,South,East,West;}
class Demo{
public static void main(String args[]){
for(Direction d: Direction.values()){
System.out.println(d);
}
System.out.println("ValueOf:"+Direction.valueOf("East"));
System.out.println("Index of Value:"+Direction.valueOf("East").ordinal());

}
}