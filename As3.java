class As3 
{
	public static void main(String[] args) 
	{
	   
		int n=5, i, k=1;
		for( i=0; i<n; i++)
		{
			
			char c='a';
			for(int j=0; j<n; j++)
			{
				if(i>=j)
				{
					if(i%2==0)
					{
						System.out.print(k);
						
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
