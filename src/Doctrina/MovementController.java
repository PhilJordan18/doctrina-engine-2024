package Doctrina;

import java.awt.event.KeyEvent;

public class MovementController extends Controller {

    private int upKey = KeyEvent.VK_UP;
    private int downKey = KeyEvent.VK_DOWN;
    private int leftKey = KeyEvent.VK_LEFT;
    private int rightKey = KeyEvent.VK_RIGHT;

    public MovementController() {
        bindKey(upKey);
        bindKey(downKey);
        bindKey(leftKey);
        bindKey(rightKey);
    }

    public Direction getDirection() {
        if (isUpPressed()) {
            return Direction.UP;
        }

        if (isLeftPressed()) {
            return Direction.LEFT;
        }

        if (isRightPressed()) {
            return Direction.RIGHT;
        }

        if (isDownPressed()) {
            return Direction.DOWN;
        }

        return null;
    }

    public void useWasdKeys() {
        setUpKey(KeyEvent.VK_W);
        setLeftKey(KeyEvent.VK_A);
        setDownKey(KeyEvent.VK_X);
        setRightKey(KeyEvent.VK_D);
    }

    public boolean isUpPressed() {
        return isKeyPressed(upKey);
    }

    public boolean isLeftPressed() {
        return isKeyPressed(leftKey);
    }

    public boolean isDownPressed() {
        return isKeyPressed(downKey);
    }

    public boolean isRightPressed() {
        return isKeyPressed(rightKey);
    }

    public boolean isMoving() {
        return isDownPressed() || isLeftPressed() || isUpPressed() || isRightPressed();
    }
    
    public void setUpKey(int keyCode) {
        unbindKey(upKey);
        bindKey(keyCode);
        this.upKey = keyCode;
    }

    public void setRightKey(int keyCode) {
        unbindKey(rightKey);
        bindKey(keyCode);
        this.rightKey = keyCode;
    }

    public void setLeftKey(int keyCode) {
        unbindKey(leftKey);
        bindKey(keyCode);
        this.leftKey = keyCode;
    }

    public void setDownKey(int keyCode) {
        unbindKey(downKey);
        bindKey(keyCode);
        this.downKey = keyCode;
    }
}
