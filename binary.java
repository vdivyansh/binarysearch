import java.util.*;
class binary
{
	public static boolean binarysrc(int a[],int l,int h,int src)
	{
		if(h>=l){
		int mid =l+((h-l)/2);
		if(a[mid]==src){
			return true;
		}
		else if(a[mid]<src)
			return binarysrc(a,l,mid-1,src);
		else
			return binarysrc(a,mid+1,h,src);
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