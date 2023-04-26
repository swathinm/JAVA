class Foreach{
	public static void main(String[] args)
	{
		//int[] x={10,20,30,40};
		/* int[][] x={
			{1,2,3},
			{4,5,6},
			{7}
			}; */
			
		//int[][] Z=
		/* {
			{
				{1,2,3},
				{4,5,6},
				{0},
			},
			{
				{7,8,9},
				{2,3}
			},
			{
				{-1,-2},
				{-3,-4},
				{-5}
			},
			{
				{-1,-2},
				{-3,-4},
				{-5}
			}
						
		};  */int[][][] Z={{{1,2,3},{5,6},{7,9}}};
				
			
		 // for(int i=0;i<x.length;i++)
		// {
			// System.out.println(x[i]);
		// } 
		
		/* for(int x1:x)
		{
			System.out.println(x1);
		} */
		
		 /*   for(int i=0;i<x.length;i++){
		
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println(x[i][j]);
			}
		}   */
/* 		  for(int[] x1:x)
		{
			for(int x2:x1)
			{
				System.out.println(x2);
			}
		}   */
		
		  for(int[][] z1:Z)
		{
			for(int[] z2:z1)
			{
				for(int z3:z2)
				{
					System.out.print(z3+" ");
				}
			}
		}  
	}
}
