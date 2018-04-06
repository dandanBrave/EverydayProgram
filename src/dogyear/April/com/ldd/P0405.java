package dogyear.April.com.ldd;

import java.io.*;

public class P0405 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        while((s = bf.readLine()) != null) {
            out(s);
        }
    }

    static void out(String s) {
        char[] a = s.toCharArray();
        int numZ = 0, numW = 0, numU = 0, numX = 0, numG = 0,numO = 0, numF = 0, numS = 0, numT = 0, numI = 0;
        for(char c : a) {
            switch(c) {
                case 'Z': numZ++; break;
                case 'W': numW++; break;
                case 'U': numU++; break;
                case 'X': numX++; break;
                case 'G': numG++; break;
                case 'O': numO++; break;
                case 'F': numF++; break;
                case 'S': numS++; break;
                case 'T': numT++; break;
                case 'I': numI++; break;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < numG; i++) sb.append('0'); //8
        for(int i = 0; i < numI - numG - numF + numU - numX; i++) sb.append('1'); //9
        for(int i = 0; i < numZ; i++) sb.append('2'); //0
        for(int i = 0; i < numO - numZ - numW - numU; i++) sb.append('3'); //1
        for(int i = 0; i < numW; i++) sb.append('4'); //2
        for(int i = 0; i < numT - numW - numG; i++) sb.append('5'); //3
        for(int i = 0; i < numU; i++) sb.append('6'); //4
        for(int i = 0; i < numF - numU; i++) sb.append('7'); //5
        for(int i = 0; i < numX; i++) sb.append('8'); //6
        for(int i = 0; i < numS - numX; i++) sb.append('9'); //7
        System.out.println(sb);
    }
}