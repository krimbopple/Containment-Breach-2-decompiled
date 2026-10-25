Function ChannelReverb%(arg0%)
    Local local0%
    local0 = BASS_ChannelSetFX(arg0, $08, $00)
    GUESSEDcreatebank_6(local0, -2.5, -19.0, 650.0, 0.1)
    Return $00
End Function
