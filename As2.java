class As2 
{
	public static void main(String[] args) 
	{
		int n=5, i;
		for( i=0; i<n; i++)
		{
			int k=5;
			char c='a';
			for(int j=0; j<n; j++)
			{
				if(i<=j)
				{
					if(i%2==0)
					{
						System.out.print(n-j);
					}
					else
						System.out.print(c++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
