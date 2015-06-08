package engine;

import server.Server;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

/**
 * Created by Fl�vio on 07/06/2015.
 */
public class GameScreen implements Screen {
    private Track track;
    private GDXTrackRenderer renderer;
    private TrackController controller;
    private GameEngine game;

    public GameScreen(GameEngine game, Server server) {
        this.game = game;
        TrackConfig cfg = new TrackConfig();
        cfg.width = 10f;
        cfg.length = 30f;
        cfg.margin = 5f;
        track = new Track(cfg);
        renderer = new GDXTrackRenderer(track);

        controller = new RemoteTrackController(track, server);
    }

    @Override
    public void show() {
        track.start();
        controller.connect();
    }

    @Override
    public void render(float delta) {
        if (!track.isFinished()) {
            controller.processInput();
            track.update(delta);
            renderer.render();
        }
        else
            game.nextScreen();
    }

    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        controller.disconnect();
    }

    @Override
    public void dispose() {

    }
}
