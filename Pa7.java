class Pa7 
{
	public static void main(String[] args) 
	{
		for(int row=0; row<=3; row++)
		{
			int i=1;
			char c='a';
			for( int col=0; row>=col  ; col++)
			{
				if(row%2==0)
				{
					System.out.print(i++);
				}
				else
					System.out.print(c++);
			}
			System.out.println();
		}
	}
}
