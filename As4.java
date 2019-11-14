class As4 
{
	public static void main(String[] args) 
	{
		int n=4;
		
		for(int i=0; i<n; i++)
		{
			int k=1;
	     	char c='a';
			for(int j=0;j<n;j++)
			{
				if(i+j<=n-1)
				{
					if(k%2)
					{
						System.out.print(k);
					}
					else if(k%2==0)
					System.out.print(c);
					
	}
				else
				{
					System.out.print("");
				}
				k++;
				c++;
					
			}
				System.out.println( );
			}
	}
}
