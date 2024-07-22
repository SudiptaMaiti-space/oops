class triangle
{
public static void main(String args[])
{
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
int z = Integer.parseInt(args[2]); 


double p, s, ar;
p = (x+y+z) ;
s = (p/2);
ar = (Math.sqrt(s*(s-x)*(s-y)*(s-z)));

System.out.println("Peerimeter= "+p);
System.out.println("Area= "+ar);
}
}
