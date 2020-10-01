import java.util.*;
class binary
{
	public static boolean binarysrc(int a[],int l,int h,int src)
	{
		while(h>=l){
		int mid =l+((h-l)/2);
		if(a[mid]==src){
			return true;
		}
		else if(a[mid]>=src)
			h=mid-1;
		else
			l=mid+1;
	}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		 	a[i] = sc.nextInt();
		int search = sc.nextInt();
		boolean result=binarysrc(a,0,n,search);
		System.out.println(result);
	}
}
