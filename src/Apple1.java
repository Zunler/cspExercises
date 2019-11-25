/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Apple1
 * Author:   pengzijun
 * Date:     2019/11/25 10:07 下午
 * Description: 小明种苹果续
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
public class Apple1 {
    //小明种苹果
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        int N=Integer.valueOf(line.split(" ")[0]);
        int M=Integer.valueOf(line.split(" ")[1]);
        int max=0;
        int maxIndex=1;
        int sum=0;
        for (int i = 0; i <N ; i++) {
            String temp=scanner.nextLine();
            String[] tempSplit=temp.split(" ");
            int sub=0;
            sum+=Integer.valueOf(tempSplit[0]);
            for (int j = 0; j <M+1 ; j++) {

                if(j>0){
                    sub-=Integer.valueOf(tempSplit[j]);
                }

            }
            if(sub>max){
                max=sub;
                maxIndex=i+1;
            }
            sum=sum-sub;
        }
        System.out.println(sum+" "+maxIndex+" "+max);
    }

}