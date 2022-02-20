
public class BinarySearchDemo 
{
	
	public static int binarysearch(int[]a1, int key,int first ,int last)
	{
	int mid=(first+last)/2;
		if(first<=last)
		{
		if(key==a1[mid])
		{
			return mid;
		}
			if(key<a1[mid])
				return binarysearch(a1, key, first, mid-1);
			else
				return binarysearch(a1, key, mid+1, last);
		}
		else
		{
			return -1;
		}
	}
	public static void main(String[] args) 
	{
	int[] a1=new int[] {1,5,6,7,8,9,};//values should be in ascending order
	int index=binarysearch(a1, 6, 0, a1.length-1);
	if(index==-1)
		System.out.println("Element not found in the array");
	else
		System.out.println("Element found at index "+index);
	
	}
}
