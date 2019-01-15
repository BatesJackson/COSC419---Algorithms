import java.io.*;
import java.util.*;
import java.lang.*;

public class Lab1a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dwCount, apartments, width, length, height, area;
        float dwHeight, dwWidth, dwArea;
        float total;
        boolean run = true;
        
        while(run){
            dwArea = 0;
            apartments = sc.nextInt();
            width = sc.nextInt();
            length = sc.nextInt();
            height = sc.nextInt();
            area = sc.nextInt();
            dwCount = sc.nextInt();
            if(width == 0) break;
            for(int j = 0; j < dwCount; j++){
                dwHeight = sc.nextInt();
                //System.out.println("Height: " + dwHeight);
                dwWidth = sc.nextInt();
                //System.out.println("Width: " + dwWidth);
                dwArea = dwArea + (dwHeight * dwWidth);
                //System.out.println(dwArea);
            }
            total = (apartments * (((length * height * 2) + (width * height * 2) + (length * width)) - dwArea)) / area; 
            System.out.println((int)Math.ceil(total));
        }
    }
}