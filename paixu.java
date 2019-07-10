import java.util.Arrays;
import java.util.Scanner;

public class paixu {


    public static void main(String[] args) {
        //数组计量
        int count=0;
        int[] arr=new int[5];
        //循环输入5个整数存放到数组
        while(count<5){
            Scanner sc=new Scanner(System.in);
            //try防止输入不是整数的
            try {
                System.out.println("请输入第"+(count+1)+"整数");
                //输入的数存放到数组
                arr[count]=sc.nextInt();
                //计量加一，直到5个
                count++;
            } catch (Exception e) {
                //输入的不是整数，则从新输入
                System.out.println("请输入整数");
            }
        }

        System.out.println("排序前数组："+Arrays.toString(arr));

        //冒泡升序排序
        for(int x=0;x<arr.length;x++){
            //冒泡排序就是后面的和前面的数对比
            for(int y=x+1;y<arr.length;y++){
                //如果是后面的大于前面的，则把前面数往后交换
                if(arr[x]>arr[y]){
                    int temp=arr[y];
                    arr[y]=arr[x];
                    arr[x]=temp;
                }
            }
        }
        System.out.println("排序后数组："+Arrays.toString(arr));
    }



}