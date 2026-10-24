Function stopbreathsound%()
    If (ChannelPlaying(breathchn) <> 0) Then
        StopChannel(breathchn)
        breathchn = $00
    EndIf
    If (ChannelPlaying(breathgasrelaxedchn) <> 0) Then
        StopChannel(breathgasrelaxedchn)
        breathgasrelaxedchn = $00
    EndIf
    Return $00
End Function
