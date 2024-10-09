package Tank;

import Doctrina.Canvas;
import Doctrina.StaticEntity;

import java.awt.*;

public class Brick extends StaticEntity {
    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.WHITE);
    }

    public Brick(int x, int y) {
        setDimension(16, 16);
        teleport(x, y);
    }
}
