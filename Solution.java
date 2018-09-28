
 class Solution {
	int a[]= {3,5,8,4};
	int b=13;
public static void main(String[] args) {
	int a[]= {3,5,8,4};
	int b=13;
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]+a[j]==b) {
			System.out.println(i);
			System.out.println(j);	
	}	
	}}
}
}