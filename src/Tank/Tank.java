package Tank;

import Doctrina.Canvas;
import Doctrina.ControllableEntity;
import Doctrina.MovementController;

import java.awt.*;


public class Tank extends ControllableEntity {
    private int cooldown = 0;

    public Tank(MovementController controller) {
        super(controller);
        setDimension(30, 30);
        setSpeed(5);
        teleport(300, 300);
    }

    @Override
    public void update() {
        moveWithController();

        if (!canFire()) {
            cooldown--;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, Color.GREEN);
        int coolDownWidth = (cooldown * width) / 40;
        canvas.drawRectangle(x, y -5, coolDownWidth, 2, Color.RED);
    }

    public Missile fire() {
        cooldown = 40;
        return new Missile(this);
    }

    public boolean canFire() {
        return cooldown == 0;
    }
}
