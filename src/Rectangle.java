public class Rectangle {
    int length = 0;
    int width = 0;
    int topLeftX = 0;
    int topLeftY = 0;
    boolean doesCollide = false;

    public Rectangle(int l, int w, int x, int y)
    {
       length = l;
       width = w;
       topLeftX = x;
       topLeftY = y;
    }

    public Rectangle()
    {
        length = (int)((Math.random() * 41) + 10);
        width = (int)((Math.random() * 6) + 5);
        topLeftX = (int)(Math.random() * 51);
        topLeftY = (int)(Math.random() * 51);
        if (Main.doesCollide(length, width, topLeftX, topLeftY))
        {
            doesCollide = true;
        }
    }

    public boolean getCollision()
    {
        return doesCollide;
    }


}
