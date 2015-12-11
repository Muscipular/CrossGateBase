package cg.base.loader;

import java.util.concurrent.ScheduledExecutorService;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.time.Timer;
import dataplatform.pubsub.ISimplePubsub;

public interface IPlatform {
	
	String getClientFilePath();
	
	Timer getTimer();
	
	ScheduledExecutorService getScheduler();
	
	ImageManager getImageManager();
	
	ISimplePubsub getSimplePubsub();
	
	AnimationReader getAnimationReader();
	
	void exit();

}
