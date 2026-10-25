Function ChannelPitch%(arg0%, arg1%)
    BASS_ChannelSetAttribute(arg0, $01, (Float arg1))
    Return $00
End Function
