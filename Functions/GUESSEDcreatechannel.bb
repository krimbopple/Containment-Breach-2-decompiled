Function GUESSEDcreatechannel%(arg0$, arg1%, arg2#)
    Local local0%
    Local local1%
    local0 = $40000
    If ((arg1 And $02) <> 0) Then
        local0 = (local0 Or $04)
    EndIf
    local1 = BASS_StreamCreateURL(arg0, $00, local0, $00, $00)
    If (((local1 <> $00) And (0.0 <= arg2)) <> 0) Then
        ChannelVolume(local1, arg2)
        ResumeChannel(local1)
    EndIf
    Return local1
    Return $00
End Function
