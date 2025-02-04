class MyEnum1{
enum Food{
smosa(15),pizza(150),jalebi(120),Dosa(60);
int price;
Food(int p){
price =p;
}
}
public static void main(String args[]){
for(Food f:Food.values()){
System.out.println(f+":"+f.price);
}
}
}