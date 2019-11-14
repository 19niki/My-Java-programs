class As5 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i =0; i<n; i++)
		{
			int k=1;
			
			for(int j=0; j<n; j++)
			{
				if(i+j<n-1)
				{
				if(k%2==1)
				{
					System.out.print("0");
				}
				else
					System.out.print("1");
				k++;
				}
			else
			System.out.print(" ");
			}
		System.out.println();
	}
}
}