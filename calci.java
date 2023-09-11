interface calci{
  int getsum(int a, int b);
}
class calciImpl implements calci{
  public int getsum(int a, int b){
  return a+b;
 }
}
class calciDriver{
  public static void main(String[] args){
  calciImpl c= new calciImpl();
  Scanner sc= new Scanner(System.in);
  int a= sc.nextInt();
  int b= sc.nextInt();
  System.out.println(c.getsum());
 }
}
 

  
 