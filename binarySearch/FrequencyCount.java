package binarySearch;

public class FrequencyCount
{
	
	static int first_occurance(int arr[], int key)
	{
		int s = 0 , e = arr.length - 1 , ans = -1;
		while (s <= e)
		{
			int mid = (s+e)/2 ;
			if (arr[mid] == key) ans = mid ;
			
			if (arr[mid] < key) s = mid + 1 ;
			else e = mid - 1 ;
		}
		return ans ;
	}
	
	
	static int last_occurance(int arr[], int key)
	{
		int s = 0 , e = arr.length - 1 , ans = -1;
		while (s <= e)
		{
			int mid = (s+e)/2 ;
			if (arr[mid] == key) ans = mid ;
			
			if (arr[mid] > key) e = mid - 1 ;
			else s = mid + 1 ;
		}
		return ans ;
	}
	
	
	static int freq(int arr[], int key)
	{
		int f = first_occurance(arr, key) ;
		System.out.println(f);
		int l = last_occurance(arr, key) ;
		System.out.println(l);
		if (f >= 0 && l >= 0) return l - f + 1 ;
		return 0 ;
	}
	
	
	public static void main(String[] args) 
	{
		int arr[] = {0,0,0,1,1,1,1,1,1,1,2,2,2,3,4,5,5,10} ;
		System.out.println(freq(arr, -1));
	}
	
}
