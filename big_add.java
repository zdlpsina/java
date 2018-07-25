

import java.util.Scanner;

public class big_add {
public static void main(String[] args) {
	
	 Scanner in =new Scanner(System.in);
	 String f=in.next();
	 String s=in.next();
	 char[] a = new StringBuffer(f).reverse().toString().toCharArray();
	    char[] b = new StringBuffer(s).reverse().toString().toCharArray();
	    int lenA = a.length;
	    int lenB = b.length;
	    //计算两个长字符串中的较长字符串的长度
	    int len = lenA > lenB ? lenA : lenB;
	    int[] result = new int[len + 1];
	    for (int i = 0; i < len + 1; i++) {
	        //如果当前的i超过了其中的一个，就用0代替，和另一个字符数组中的数字相加
	        int aint = i < lenA ? (a[i] - '0') : 0;
	        int bint = i < lenB ? (b[i] - '0') : 0;
	        result[i] = aint + bint;
	    }
	    //处理结果集合，如果大于10的就向前一位进位，本身进行除10取余
	    for (int i = 0; i < result.length; i++) {
	        if (result[i] > 10) {
	            result[i + 1] += result[i] / 10;
	            result[i] %= 10;
	        }
	    }
	    StringBuffer sb = new StringBuffer();
	    //该字段用于标识是否有前置0，如果有就不要存储
	    boolean flag = true;
	    for (int i = len; i >= 0; i--) {
	        if (result[i] == 0 && flag) {
	            continue;
	        } else {
	            flag = false;
	        }
	        sb.append(result[i]);
	    }
	    System.out.println(sb.toString());
	 
	 
	 in.close();

}
}
