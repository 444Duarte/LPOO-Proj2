package element;

import com.badlogic.gdx.physics.box2d.*;
import element.GameElement;

/**
 * Created by Fl�vio on 06/06/2015.
 */
public class River extends GameElement {

    public River(Body body, float width, float length) {
        super(body, GameElement.class.getSimpleName(), width, length);
    }
}