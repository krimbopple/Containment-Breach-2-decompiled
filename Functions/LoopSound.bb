Function LoopSound%(arg0%, arg1%)
    Local local0%
    BASS_SampleGetInfo(arg0, GUESSEDloadentry())
    local0 = peekint(GUESSEDloadentry(), $0C)
    If (arg1 <> 0) Then
        local0 = (local0 Or $04)
    Else
        local0 = (local0 And (local0 Xor $04))
    EndIf
    BASS_SampleSetInfo(arg0, GUESSEDloadentry())
    Return $00
End Function
