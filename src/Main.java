import org.w3c.dom.css.Rect;

import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

int count = 0;
        for (int i = 0; i < 1000000; i++)
        {
            Rectangle rectangle = new Rectangle();
           if (rectangle.getCollision())
           {
               count++;
           }
        }
        System.out.println((double)(count)/1000000);


    }

    public static boolean doesCollide(int l, int w, int x, int y)
    {
        int xbot = x + l;
        int ybot = y - w;
        if (x <= 10 && y >= 5 && xbot >= 10 && ybot <= 5)
        {
            return true;
        }
        if (x <= 10 && y >= 15 && xbot >= 10 && ybot <= 15)
        {
            return true;
        }
        if ( x <= 30 && y >= 5 && xbot >= 30 && ybot<= 5)
        {
            return true;
        }
        if (x <= 30 && y >= 15 && xbot >= 30 && ybot <=15)
        {
            return true;
        }
        if (x >= 10 && xbot <= 30 &&  y >= 5 && ybot <= 5)
        {
            return true;
        }
        if (x >= 10 && xbot <= 30 &&  y >= 15 && ybot <= 15)
        {
            return true;
        }
        if (x <= 30 && xbot >= 30 &&  y <= 15 && ybot >= 5)
        {
            return true;
        }
        if (x <= 10 && xbot >= 10 &&  y <= 15 && ybot >= 5)
        {
            return true;
        }
        return false;

    }

}