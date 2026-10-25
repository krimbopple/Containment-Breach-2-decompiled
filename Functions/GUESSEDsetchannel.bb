Function GUESSEDsetchannel%(arg0.TX2BF6X0FF4)
    Local local0%
    If (arg0\Field10 <> Null) Then
        Return $00
    EndIf
    arg0\Field10 = (New X600BFXZ6F)
    arg0\Field10\Field4 = 1.0
    arg0\Field10\Field0 = 1.0
    arg0\Field10\Field1 = $00
    arg0\Field10\Field7[$00] = GUESSEDcreatestream(GUESSEDcreatepoke(opus_get_sample_rate(), opus_get_channels()), $08)
    arg0\Field10\Field7[$01] = GUESSEDcreatestream(GUESSEDcreatepoke(opus_get_sample_rate(), opus_get_channels()), $00)
    arg0\Field10\Field7[$02] = GUESSEDcreatestream(GUESSEDcreatepoke(opus_get_sample_rate(), opus_get_channels()), $00)
    For local0 = $00 To $02 Step $01
        BASS_ChannelSetAttribute(arg0\Field10\Field7[local0], $08, 2.0)
        BASS_ChannelPlay(arg0\Field10\Field7[local0], $00)
    Next
    GUESSEDcreatebank_2(GUESSEDdeletechannel(arg0, $01, $07), 1802.91, 31.409, 11.925)
    Return $00
End Function
