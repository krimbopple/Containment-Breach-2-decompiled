Function updatemusic%()
    If (nowplaying <> shouldplay) Then
        opt\Field48 = max((opt\Field48 - (fps\Field3[$00] / 250.0)), 0.0)
        If (0.0 = opt\Field48) Then
            If (nowplaying < $42) Then
                stopstream_strict(musicchn)
                musicchn = $00
            EndIf
            nowplaying = shouldplay
            currmusic = $00
        EndIf
    Else
        opt\Field48 = (((opt\Field45 - opt\Field48) * (fps\Field3[$00] * 0.1)) + opt\Field48)
    EndIf
    If (nowplaying < $42) Then
        If (currmusic = $00) Then
            musicchn = streamsound_strict((("SFX\Music\" + music[nowplaying]) + ".ogg"), 0.0, $02)
            currmusic = $01
        EndIf
        setstreamvolume_strict(musicchn, (opt\Field48 * opt\Field2))
    EndIf
    Return $00
End Function
