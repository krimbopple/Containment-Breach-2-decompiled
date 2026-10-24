Function ChannelVolume%(arg0%, arg1#)
    TXB86X4FDDF(arg0, $02, clamp(arg1, 0.0, 1.0))
    Return $00
End Function
