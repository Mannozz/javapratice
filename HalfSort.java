package HS;//�����㷨���

public class HalfSort{
	public static void main(String args[])
	{
		int a[] = {3,1,5,7,2,4,9,6};//ԭ����
		new HalfSort().halfsort(a);
	}
	
	public void halfsort(int a[])
	{
		System.out.println("���������������������������������������۰���������㷨������������������������������������������");

		int n = a.length;
		int i,j;
		
		for(i = 1 ; i < n ; i++)
		{
			int temp = a[i];//��ŵ�ǰ���������
			int low = 0;//��������һ��Ԫ�ص��±�
			int high = i - 1;//����������Ԫ�ص��±�
			int mid = 0;
			
			//Ѱ��temp�����λ��
			while(low <= high)
			{
				//�м��±�
				mid = (low + high) / 2;
				//������������м�Ԫ�ش��ڴ�����Ԫ�أ��������������м�Ԫ��֮ǰ�����������������
				if(a[mid] > temp)
				{
					high = mid - 1;
				}else{
					low = mid + 1;
				}
			}
			
		
			//low�±���Ԫ�غ��ƣ�Ϊ����temp��׼��
			for(j = i - 1 ; j >= low ; j--)
			{
				a[j+1] = a[j];
			}
			
			//����temp
			a[low] = temp;
			
			//��ӡÿ������������
			printa(a,n,i);
			
		}//end of for(i = 1 ; i < n ; i++)
		
	}//end of halfsort
	
		//��ӡ����
		public void printa(int a[] , int n , int i){
			
      	  	 System.out.print("��"+i+"�Σ�");
     	 	  for(int j=0;j<n;j++)
     	 	 {
       	    	 System.out.print(" "+a[j]);
     	  	 }
     	  	 System.out.println();
  		}
	
}//end of HalfSort


