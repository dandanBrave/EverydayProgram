package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/3.
 * 字符串加解密：
 * 当内容是英文字母时用该英文字母的后一个字母替换，同时字母变换大小写；
 * 当内容是数字时则把该数字加1，如0替换为1,1替换为2,9替换为0；
 * 其他字符不做变化；
 * 解密为加密的逆过程。
 */
public class P01032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String string = sc.nextLine();  //要加密的密码
            String reString = sc.nextLine();   //加过密的密码
            char[] cString = string.toCharArray();
            char[] cReString = reString.toCharArray();

            System.out.println(Encrypt(cString));
            System.out.println(unEncrypt(cReString));
        }
    }

    public static String Encrypt (char aucPassword[]){
       int len = aucPassword.length;
       StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len ; i++) {
            if(aucPassword[i]>='A' && aucPassword[i]<='Y'){
                sb.append((char)(aucPassword[i]+1+32));
            }else if(aucPassword[i]=='Z'){
                sb.append('a');
            }else if(aucPassword[i]>='a' && aucPassword[i]<='y'){
                sb.append((char)(aucPassword[i]+1-32));
            }else if(aucPassword[i]=='z') {
                sb.append('A');
            }else if(aucPassword[i]>='0' && aucPassword[i]<='8'){
                int num = Integer.parseInt(aucPassword[i]+"")+1;
                sb.append(num);
            }else if(aucPassword[i]=='9'){
                sb.append(0);
            }else{
                sb.append(aucPassword[i]);
            }
        }
        return sb.toString();
    }

    public static String unEncrypt (char aucPassword[]){
        int len = aucPassword.length;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len ; i++) {
            if(aucPassword[i]>='B' && aucPassword[i]<='Z'){
                sb.append((char)(aucPassword[i]-1+32));
            }else if(aucPassword[i]=='A'){
                sb.append('z');
            }else if(aucPassword[i]>='b' && aucPassword[i]<='z'){
                sb.append((char)(aucPassword[i]-1-32));
            }else if(aucPassword[i]=='a') {
                sb.append('Z');
            }else if(aucPassword[i]>='1' && aucPassword[i]<='9'){
                int num = Integer.parseInt(aucPassword[i]+"")-1;
                sb.append(num);
            }else if(aucPassword[i]=='0'){
                sb.append(9);
            }else{
                sb.append(aucPassword[i]);
            }
        }
        return sb.toString();
    }
}
