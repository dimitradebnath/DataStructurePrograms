import java.util.*;
import java.lang.*;
class D11
{
public static void main(String[] args)
			{

				int i,j,c=0;
				int [][]arr = new int[10][100];
				int[]a =new int[1000];
				int k=0; 
				for(i=0;i<=1000;i++)
				{
					c=1;
					for(j=2;j<=i/2;j++)
						{
							if(i%j==0)
								{
									c=0;
									break;
								}
						}
				
					if(c==1)	
						{
							
							a[k]=i;
							k++;
							
						}
					}
			
				int l=0;	
				for(i=0;i<10;i++)
					{	
					for(j=0;j<100;j++)
						{
						arr[i][j]=a[l];
						l++;
						}
					}

				int m=0,n=100,s=1;
				for(i=0;i<10;i++)
					{
					System.out.println("Dimension "+(i+1)+ " contains:"+ m+ " to"+n);	
					m=m+100;
					n=n+100;
					for(j=0;j<100;j++)
						{
						if(arr[i][j]!='\0')
							{
							if(arr[i][j]<(s*100))
								{
						System.out.println("Array having dimension ["+(i+1)+"] and ["+j+"] has:-  "+ arr[i][j]);
								}
							else{
								s=s+1;
								//incomplete
								}
						
							}
											
						}
						
					}
				
		}
}

