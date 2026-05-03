package String;

import javax.swing.plaf.PanelUI;

public class ShortestPath {
    public static float shortestRoute(String name){
        int x = 0, y =0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'W'){
                x--;
            } else if (ch == 'N') {
                y++;
            } else if (ch == 'E') {
                x++;
            }else {
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2+Y2);

    }
    public static void main(String[] args) {
        String name = "NS";
        System.out.println(shortestRoute(name));

    }
}
