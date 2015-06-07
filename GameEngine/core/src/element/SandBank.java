package element;

import com.badlogic.gdx.physics.box2d.Body;

/**
 * Created by Fl�vio on 06/06/2015.
 */
public class SandBank extends GameElement{

    public static final float damping = 0.7f;

    public SandBank(Body body, float width, float height) {
        super(body, SandBank.class.getSimpleName(), width, height);
    }
}
