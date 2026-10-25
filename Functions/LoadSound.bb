Function LoadSound%(arg0$)
    Local local0%
    local0 = BASS_SampleLoad($00, arg0, $00, $00, $00, $08, $00)
    If (local0 <> $00) Then
        BASS_SampleGetInfo(local0, GUESSEDloadentry())
        pokefloat(GUESSEDloadentry(), $04, 0.0)
        BASS_SampleSetInfo(local0, GUESSEDloadentry())
    EndIf
    Return local0
    Return $00
End Function
