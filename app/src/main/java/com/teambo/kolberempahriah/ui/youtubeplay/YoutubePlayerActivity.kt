package com.teambo.kolberempahriah.ui.youtubeplay

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.teambo.kolberempahriah.databinding.ActivityYoutubePlayerBinding
import java.util.regex.Pattern

class YoutubePlayerActivity : YouTubeBaseActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ActivityYoutubePlayerBinding
    private val key = "AIzaSyASo4Ha62fyzgxZtJBVr8uOYNsiPOoMUl8"
//    private val videoId = "L0WGZSiOZsM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityYoutubePlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoId = intent.getStringExtra(EXTRA_DATA)
        if (videoId != null) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            initializePlayer(videoId)
        }

    }

    private fun initializePlayer(videoId: String) {
        binding.ytPlayer.initialize(key, object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1!!.loadVideo(videoId)
                p1.play()
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(applicationContext, "error occured", Toast.LENGTH_LONG).show()
            }

        })
    }

    fun getYoutubeVideoIdFromUrl(inUrl: String): String? {
        if (inUrl.lowercase().contains("youtu.be"))
            return inUrl.substring(inUrl.lastIndexOf("/") + 1)
        val pattern = "(?<=watch\\?v=|/videos/|embed\\/)[^#\\&\\?]*"
        val compiledPattern = Pattern.compile(pattern)
        val matcher = compiledPattern.matcher(inUrl)
        return if (matcher.find()) {
            matcher.group()
        } else null
    }
}