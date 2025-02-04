class MyEnum{
enum Food{smosa(15),pizza(150),jalebi(120),Dosa(60);
int price;
Food(int prc){
price =prc;
}
}
public static void main(String args[]){
for(Food f:Food.values()){
System.out.printn(f+":"+f.price);
}
}
}