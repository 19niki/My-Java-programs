class As10 
{
	public static void main(String[] args) 
	{
	   int n=5,k=1;
	   for(int i=0; i<n; i++)
		{
             
			 for(int j=0; j<n; j++)
			{
				 if (i>=j)
				 {
					 System.out.print(k);
						 k=k+2;
				 }
					 if(k==11)
				{
						 k=1;
				}
			}
				System.out.println();
		}
	}
}
