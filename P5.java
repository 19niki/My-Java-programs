class Rev 
{
	public static void main(String[] args) 
	{
          int num=7894;
		  int d;
		  int res=0;
		  do
		  {
			  d=num%10;
			  res=res*10+d;
			  num=num/10;
		  }
		  while (num>0);
		  System.out.println(res);
	}
}
