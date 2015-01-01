package com.rishadafc.youtubeplayer;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class YouTubeActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

	public static final String GOOGLE_API_KEY = "AIzaSyAYbZqH8ljzDNDQ5NDl7fcmj7gmGKtBOrQ";

	public static final String YOUTUBE_VIDEO_ID = "GgCOe4B8rAQ";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.youtube);
		YouTubePlayerView youTubePlayView = (YouTubePlayerView) findViewById(R.id.youtube_player);
		youTubePlayView.initialize(GOOGLE_API_KEY, this);
	}

	public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
		Toast.makeText(this, "Cannot initialize YouTube player", Toast.LENGTH_LONG).show();
	}

	public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
		player.setPlayerStateChangeListener(playerStateChangeListener);
		player.setPlaybackEventListener(playbackEventListener);

		if (!wasRestored) {
			player.cueVideo(YOUTUBE_VIDEO_ID);
		}
	}

	private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
		public void onBuffering(boolean arg0) {

		}

		public void onPaused() {

		}
		
		public void onPlaying() {
			
		}
		
		public void onSeekTo(int arg0) {
			
		}
		
		public void onStopped() {
			
		}
	};
	
	private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
		public void onAdStarted() {
			
		}
		
		public void onError(ErrorReason arg0) {
			
		}
		
		public void onLoading() {
			
		}
		
		public void onLoaded(String arg0) {
			
		}
		
		public void onVideoStarted() {
			
		}
		
		public void onVideoEnded() {
			
		}
	};

}
