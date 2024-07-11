public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,3,5,8};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}	
				
			}
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		System.out.println("*");
		int x=a[0];
		for(int i=0;i<=a.length-1;i++){
		if(a[i]-i!=x)
		while(x<a[i]-i){
		System.out.println(x+i);
		x++;
		}
		}
		System.out.println("");
		
		int n=7;
		int sumN=(n*(n+1))/2;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
		}
		int MissNum=sumN-sum;
		System.out.println("MissingNumbers");
		System.out.print(MissNum);
		
	}

}