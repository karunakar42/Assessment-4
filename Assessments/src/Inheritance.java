class Cls1{
void add(int p, int q){
System.out.println(p + q);
}
}
class Cls2 extends Cls1{
void mul(int p, int q){
System.out.println(p * q);
}
void task(int a, int b){
int sum = (a * a)+(b * b);
System.out.println(sum);
}
}
public class Inheritance{
public static void main(String[] args){
Cls2 obj = new Cls2();
int T = 1;
int a = 2, b = 4;
for (int i = 0; i<T; i++){
obj.add(a, b);
obj.mul(a, b);
obj.task(a, b);
}
}
}

