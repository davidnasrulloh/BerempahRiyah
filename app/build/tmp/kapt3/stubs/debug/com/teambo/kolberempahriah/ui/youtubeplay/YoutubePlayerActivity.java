package com.teambo.kolberempahriah.ui.youtubeplay;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/teambo/kolberempahriah/ui/youtubeplay/YoutubePlayerActivity;", "Lcom/google/android/youtube/player/YouTubeBaseActivity;", "()V", "binding", "Lcom/teambo/kolberempahriah/databinding/ActivityYoutubePlayerBinding;", "key", "", "getYoutubeVideoIdFromUrl", "inUrl", "initializePlayer", "", "videoId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class YoutubePlayerActivity extends com.google.android.youtube.player.YouTubeBaseActivity {
    @org.jetbrains.annotations.NotNull()
    public static final com.teambo.kolberempahriah.ui.youtubeplay.YoutubePlayerActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_DATA = "extra_data";
    private com.teambo.kolberempahriah.databinding.ActivityYoutubePlayerBinding binding;
    private final java.lang.String key = "AIzaSyASo4Ha62fyzgxZtJBVr8uOYNsiPOoMUl8";
    
    public YoutubePlayerActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializePlayer(java.lang.String videoId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYoutubeVideoIdFromUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String inUrl) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/teambo/kolberempahriah/ui/youtubeplay/YoutubePlayerActivity$Companion;", "", "()V", "EXTRA_DATA", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}