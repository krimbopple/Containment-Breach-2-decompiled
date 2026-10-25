Function playannouncement%(arg0$, arg1%)
    If (((GUESSEDupdatexdb() <> $00) And arg1) <> 0) Then
        GUESSEDupdateplayannouncement(arg0, $02, Null, 10.0, 1.0, 0.0, 0.0, 0.0)
    EndIf
    If (playerinreachableroom($01, $01, $01) = $00) Then
        Return $00
    EndIf
    If (intercomstreamchn <> $00) Then
        stopstream_strict(intercomstreamchn)
        intercomstreamchn = $00
    EndIf
    intercomstreamchn = streamsound_strict(arg0, (opt\Field59 * opt\Field2), $00)
    Return $00
End Function
