class Comb 
{
	public static void main(String[] args) 
	{
	     int n=5;
		 for(int i=0; i<n;i++)
		{  //pattern1
			 for(int j=0; j<n;j++)
			{
				 if(i+j>=n-1)
				{
					 System.out.print("*");
				}
				else
					System.out.print(" ");
				}//end of pattern1
                   
		          //pattern2  
				 for(int j=0; j<n;j++)
			   {
				 if(i>=j)
				{
					 System.out.print("*");
				}
				else
					System.out.print(" ");
				}// end of pattern2

				System.out.println();
		}
	}
}
