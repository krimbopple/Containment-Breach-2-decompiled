Function ChannelPlaying%(arg0%)
    Local local0%
    local0 = BASS_ChannelIsActive(arg0)
    Return (local0 <> $00)
    Return $00
End Function
