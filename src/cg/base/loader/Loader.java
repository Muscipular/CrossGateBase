package cg.base.loader;

import java.net.URI;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cg.base.animation.AnimationReader;
import cg.base.image.ImageManager;
import cg.base.reader.CAnimationReader;
import cg.base.time.CTimer;
import cg.base.time.Time;
import dataplatform.pubsub.ISimplePubsub;
import dataplatform.pubsub.impl.SimplePubsub;
import dataplatform.udsl.UDSL;

public abstract class Loader implements IPlatform {
	
	protected static final Logger log = LoggerFactory.getLogger(Loader.class);
	
	protected ISimplePubsub simplePubsub;
	
	protected Time timer;
	
	protected int version;
	
	protected URI clientFilePath;
	
	protected AnimationReader animationReader;
	
	protected ScheduledExecutorService scheduler;
	
	protected ImageManager imageManager;
	
	protected UDSL udsl;

	public final void load() {
		simplePubsub = createSimplePubsub();
		timer = createTimer();
		try {
			clientFilePath = loadClientFilePath();
		} catch (Exception e) {
			log.error("", e);
		}
		scheduler = createScheduledExecutor();
		imageManager = createImageManager();
		udsl = createUDSL();
		loadMore();
		loadFinish();
		log.info("Load finish.");
	}
	
	protected abstract void loadMore();
	
	protected abstract void loadFinish();
	
	protected abstract UDSL createUDSL();
	
	protected final void loadAnimationReader() {
		animationReader = createAnimationReader();
	}
	
	protected final ScheduledFuture<?> addFixScheduler(Runnable runnable) {
		return scheduler.scheduleAtFixedRate(runnable, 0, timer.getSleepTime(), TimeUnit.MILLISECONDS);
	}
	
	protected abstract ImageManager createImageManager();
	
	protected ISimplePubsub createSimplePubsub() {
		return new SimplePubsub();
	}
	
	protected Time createTimer() {
		return new CTimer();
	}
	
	protected ScheduledExecutorService createScheduledExecutor() {
		return new ScheduledThreadPoolExecutor(3);
	}
	
	protected AnimationReader createAnimationReader() {
		return new CAnimationReader(getClientFilePath(), getImageManager(), getTimer());
	}
	
	protected abstract URI loadClientFilePath() throws Exception;
	
	@Override
	public final String getClientFilePath() {
//		return (clientFilePath.getHost() == null ? clientFilePath.getPath() : clientFilePath.toString());
		return clientFilePath.toString();
	}

	@Override
	public final Time getTimer() {
		return timer;
	}

	@Override
	public final ScheduledExecutorService getScheduler() {
		return scheduler;
	}

	@Override
	public final ImageManager getImageManager() {
		return imageManager;
	}

	@Override
	public final AnimationReader getAnimationReader() {
		return animationReader;
	}

	@Override
	public final ISimplePubsub getSimplePubsub() {
		return simplePubsub;
	}

	@Override
	public final void exit() {
		System.exit(1);
	}

	@Override
	public UDSL getUDSL() {
		return udsl;
	}

}
