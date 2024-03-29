package platform.game.level;

import platform.game.LevelBlock;
import platform.game.World;
import platform.game.Background;
import platform.util.Box;
import platform.util.Vector;

public class Selection extends Level {
	@Override
	public void register(World world) {
	    super.register(world);
	    //mise en place du fond
	    world.register(new Background());
	    //création des 3 boites de selection de niveauy
	    world.register(new LevelBlock(1, new Box(new Vector(-3.0, 0.0), 2, 2), world.getLoader().getSprite("box.empty"), new Level1()));
	    world.register(new LevelBlock(2, new Box(new Vector(0.0, 0.0), 2, 2), world.getLoader().getSprite("box.empty"), new Level2()));
	    world.register(new LevelBlock(3, new Box(new Vector(3.0, 0.0), 2, 2), world.getLoader().getSprite("box.empty"), new Level3()));  
	}
}
