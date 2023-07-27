class Abc 
{
	static int show(int x[],int i,int l1,int l2)
	{
	if(i==x.length)return l2;
	if(x[i]>l1)
	{
		l2 = l1;
		l1=x[i];
	}
	else if(x[i]>l2 && l1!=x[i])
	{
		l2=x[i];
	}
	return show(x, i+1, l1, l2);

}
	public static void main(String ar[])
	{
int x[]={5,4,3,2,1};
System.out.println(Abc.show(x,0,x[0],-1));
	}	
}