Function updatecough%(arg0%)
    If (0.0 = XZ0260X8X2\Field48) Then
        If (rand(arg0, $01) = $01) Then
            If (ChannelPlaying(coughchn) = $00) Then
                coughchn = playsound_strict(D8BF2B828((((T8660BZ460\Field3 > $00) Lor (i_1499\Field8 > $00)) Lor (T8660BZ460\Field10 > $00)), rand($00, $02)), $01, $00)
                XZ0260X8X2\Field68 = max(6.0, XZ0260X8X2\Field68)
            EndIf
        EndIf
    EndIf
    If (ChannelPlaying(coughchn) <> 0) Then
        stopbreathsound()
    EndIf
    Return $00
End Function
