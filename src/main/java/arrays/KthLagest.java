package arrays;

public class KthLagest {
   
	public static int large(int []a ) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		if(i==3) {
			System.out.println(a[i]);
			break;
		}
		}
		return 0;
		
	}public static void main(String[] args) {
		
		KthLagest b = new KthLagest();
		int []c = {3,2,3,1,2,4,5,5,6};
		b.large(c);
	}
}
