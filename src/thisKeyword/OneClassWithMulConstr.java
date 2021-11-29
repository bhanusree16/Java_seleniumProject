package thisKeyword;

public class OneClassWithMulConstr {

public OneClassWithMulConstr()
{
this(3);
System.out.println("consrctor with default arguments");
}

public OneClassWithMulConstr(String name)
{
System.out.println("consrctor with default arguments " + name);
}

public OneClassWithMulConstr(int number)
{
this("bhanu sareddy");
System.out.println("consrctor ith default arguments " + number);
}

public static void main(String[] args) {
OneClassWithMulConstr obj1 = new OneClassWithMulConstr();


}
}
