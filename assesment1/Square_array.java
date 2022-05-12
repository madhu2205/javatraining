import java.util.*;
class Square_array{
public static void main (String[] args){
int arr[]=new int[4];
Scanner sc= new Scanner(System.in);
for (int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for (int i=0;i<arr.length;i++){
arr[i]=arr[i]*arr[i];
}
for (int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}


