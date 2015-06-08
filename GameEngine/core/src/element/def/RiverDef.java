package element.def;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.ChainShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import element.def.GameElementDef;

import java.util.LinkedList;

/**
 * River's body definition.
 */
public class RiverDef extends GameElementDef {
    private static final BodyDef bodyDef = initBodyDef();

    public RiverDef(float width, float height) {
        super(bodyDef, initFixtureDef(width, height), width, height);
    }

    /**
     * Creates the FixtureDef of the game element.
     *
     * @param width     Rivers width.
     * @param height    Rivers height.
     * @return          Result FixtureDef.
     */
    private static FixtureDef initFixtureDef(float width, float height) {
        Vector2[] vertex = new Vector2[4];
        vertex[0] = new Vector2(-width / 2, -height / 2);
        vertex[1] = new Vector2(width / 2, -height / 2);
        vertex[2] = new Vector2(width / 2, height / 2);
        vertex[3] = new Vector2(-width / 2, height / 2);

        ChainShape shape = new ChainShape();
        shape.createLoop(vertex);

        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = shape;

        return fixtureDef;
    }

    /**
     * Creates a body definition.
     *
     * @return Created body definition.
     */
    private static BodyDef initBodyDef() {
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.StaticBody;
        bodyDef.allowSleep = true;

        return bodyDef;
    }
}
