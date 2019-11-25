/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Apple
 * Author:   pengzijun
 * Date:     2019/11/25 3:57 下午
 * Description: 小明种苹果
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈小明种苹果续〉
 *
 * @author pengzijun
 * @create 2019/11/25
 * @since 1.0.0
 */

public class Apple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.valueOf(scanner.nextLine());
        int[] drop=new int[N];
        for (int i = 0; i <N ; i++) {
            drop[i] = 0;
        }

        int sum = 0;
        int dropNum=0;
        for (int i = 0; i < N; i++) {
            String temp = scanner.nextLine();
            String[] tempSplit = temp.split(" ");
            int sub = 0;
            int M = Integer.valueOf(tempSplit[0]);
            int current= Integer.valueOf(tempSplit[1]);
            for (int j = 2; j < M + 1; j++) {

                int num=Integer.valueOf(tempSplit[j]);
                if (num>0){
                    if(num<current){
                        drop[i]=1;
                        current=num;
                    }
                }
                else{
                    current+=num;

                }
            }

            sum += current;
            if(drop[i]==1){
                dropNum+=1;
            }
        }
        int dropGroup=0;
        for (int i = 0; i <N ; i++) {

            if(drop[(i+N)%N]==1&&drop[(i+1+N)%N]==1&&drop[(i+2+N)%N]==1){

                dropGroup++;
            }

        }
        System.out.println(sum + " " + dropNum + " " + dropGroup);
    }

}