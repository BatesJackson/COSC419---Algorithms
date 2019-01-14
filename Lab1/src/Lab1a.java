import java.io.*;
import java.util.*;

public class Lab1a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dwCount, apartments, width, length, height, area, total;
        int dwHeight, dwWidth, dwArea;
        boolean run = true;
        dwArea = 0;
        while(run){
            apartments = sc.nextInt();
            width = sc.nextInt();
            length = sc.nextInt();
            height = sc.nextInt();
            area = sc.nextInt();
            dwCount = sc.nextInt();
            if(width == 0) run = false;
            for(int j = 0; j < dwCount; j++){
                dwHeight = sc.nextInt();
                dwWidth = sc.nextInt();
                dwArea = dwArea + (dwHeight * dwWidth);
            }
            total = (apartments * (((length * height * 2) + (width * height * 2) + (length * width)) - dwArea)) / area;
        
            System.out.println(total);
        }
    }
}
