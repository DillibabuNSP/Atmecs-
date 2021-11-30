package H2Num;

public class Find2Numbers {

public void FindFind2Numbers(int[] nums){
int HighOne = 0;
int HighTwo = 0;
for(int n:nums){
if(HighOne < n){
HighTwo = HighOne;
HighOne =n;
} else if(HighTwo < n){
HighTwo = n;
}
}
System.out.println("First Max Number: "+HighOne);
System.out.println("Second Max Number: "+HighTwo);
}
public static void main(String a[]){
int num[] = {11,22,45,92,21,54,79,11};
Find2Numbers f2n = new Find2Numbers();
f2n.FindFind2Numbers(num);
}
}
