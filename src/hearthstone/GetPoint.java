package hearthstone;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class GetPoint {

    public int[] getPoint() throws Exception{
        Robot robot = new Robot();
        robot.delay(2500);
        PointerInfo pinfo = MouseInfo.getPointerInfo();
        Point p = pinfo.getLocation();
        int mx = (int) p.getX();
        int my = (int) p.getY();
        Color mouseRGB = robot.getPixelColor(mx,my);
        int R = mouseRGB.getRed();
        int G = mouseRGB.getGreen();
        int B = mouseRGB.getBlue();
        int[] array = new int[] {mx,my,R,G,B};
        return array;
    }

    public void Random_Moveto(int x,int y,int z) throws AWTException {
        //int temp=m+(int)(Math.random()*(n+1-m)); //生成从m到n的随机整数[m,n]
//        int a=-z+(int)(Math.random()*(z+1+z));
//        int b=-z+(int)(Math.random()*(z+1+z));
        Robot robot=new Robot();
//        for (int i = 0; i<10; i++)
//            robot.mouseMove(x+a,y+b);
        robot.mouseMove(200,200);
    }


    public static void main(String[] args) throws AWTException {
//        GetPoint getPoint = new GetPoint();
//        int[] xyrgb = null;
//        try {
//            xyrgb = getPoint.getPoint();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        for (int i = 0;i< xyrgb.length;i++)
//            System.out.print(xyrgb[i] +" ");
        GetPoint getPoint = new GetPoint();
        getPoint.Random_Moveto(100,100,0);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getPoint.Random_Moveto(200,100,0);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getPoint.Random_Moveto(300,100,0);
    }
}
