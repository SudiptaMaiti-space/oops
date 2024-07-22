class prime
{
public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
int k=0;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
k++;
}
if(k>0)
System.out.println("Not a Prime No.");
else
System.out.println("Prime No.");
}
}

