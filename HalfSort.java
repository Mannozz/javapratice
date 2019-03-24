package HS;//排序算法打包

public class HalfSort{
	public static void main(String args[])
	{
		int a[] = {3,1,5,7,2,4,9,6};//原数组
		new HalfSort().halfsort(a);
	}
	
	public void halfsort(int a[])
	{
		System.out.println("———————————————————折半插入排序算法—————————————————————");

		int n = a.length;
		int i,j;
		
		for(i = 1 ; i < n ; i++)
		{
			int temp = a[i];//存放当前待插入的数
			int low = 0;//存放数组第一个元素的下标
			int high = i - 1;//存放数组最后元素的下标
			int mid = 0;
			
			//寻找temp插入的位置
			while(low <= high)
			{
				//中间下标
				mid = (low + high) / 2;
				//若有序数组的中间元素大于待排序元素，则有序序列向中间元素之前搜索，否则向后搜索
				if(a[mid] > temp)
				{
					high = mid - 1;
				}else{
					low = mid + 1;
				}
			}
			
		
			//low下标后的元素后移，为插入temp做准备
			for(j = i - 1 ; j >= low ; j--)
			{
				a[j+1] = a[j];
			}
			
			//插入temp
			a[low] = temp;
			
			//打印每次排序后的数组
			printa(a,n,i);
			
		}//end of for(i = 1 ; i < n ; i++)
		
	}//end of halfsort
	
		//打印函数
		public void printa(int a[] , int n , int i){
			
      	  	 System.out.print("第"+i+"次：");
     	 	  for(int j=0;j<n;j++)
     	 	 {
       	    	 System.out.print(" "+a[j]);
     	  	 }
     	  	 System.out.println();
  		}
	
}//end of HalfSort


