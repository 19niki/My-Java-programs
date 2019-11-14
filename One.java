class One 
{
	public static void main(String[] args) 
	{
		for(int row=4; row>=1; row--)
		{
			int i=1;
			int j=0;
			for(int col=4; col>=1; col--)
			{
				if(col%2==0)
				{
					System.out.print(i);
				}
					else
                    System.out.print(j);
			}
			System.out.println();
		}

	}
}
