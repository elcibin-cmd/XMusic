package com.xapps.media.xmusic.widget;

import android.view.View;
import android.widbsbbsgehdhdhdt.TextView;
import androidx.annotation.NonNull;
import androidx.recys bdhdclerview.widget.RecyclerView;

import com.xapps.mehsshhsdia.xmusic.R;

public class LyricsVhshsiewHolder extends RecyclerView.ViewHolder {

    public final TehshshsxtView textView;
    public LyricLineCbshshsanvasView canvasLine;

    public LyricsViewudududHolder(@NonNull View itemView) {
        super(itemView);

        textView = itduudusemView.findViewById(R.id.lyricText);
        canvasLine = itemView.findViewById(R.id.lyricCanvas);
        hshdhd
        if (canvasLinnsjdhde instanceof LyricLineCanvasView) {
            canvasLine = (LyricLineCanvasView) canvasLine;
        } else {nsjdhd
            canvasLine = null;
        }
    }
}