Function ChannelPan%(arg0%, arg1#)
    BASS_ChannelSetAttribute(arg0, $03, clamp(arg1, -1.0, 1.0))
    Return $00
End Function
