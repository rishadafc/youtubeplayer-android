package com.rishadafc.youtubeplayer;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StandaloneActivity extends Activity implements View.OnClickListener {

	public static final String GOOGLE_API_KEY = "AIzaSyAYbZqH8ljzDNDQ5NDl7fcmj7gmGKtBOrQ";

	public static final String YOUTUBE_VIDEO_ID = "GgCOe4B8rAQ";
	public static final String YOUTUBE_PLAYLIST_ID = "PLtven5AlrFdhGdCnfQ-o6Kwq_N9c9c0zr";
	
	private Button btnPlay;
	private Button btnPlayPlaylist;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.standalone);
		
		btnPlay = (Button) findViewById(R.id.btnStart);
		btnPlayPlaylist = (Button) findViewById(R.id.btnPlaylist);
		
		btnPlay.setOnClickListener(this);
		btnPlayPlaylist.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		Intent intent = null;
		if (v == btnPlay) {
			// Play a single video
			intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
		} else if (v == btnPlayPlaylist) {
			// Play the playlist
			intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_ID);
		}
		
		if (intent != null) {
			startActivityForResult(intent, 0);
		}
		
	}

}
