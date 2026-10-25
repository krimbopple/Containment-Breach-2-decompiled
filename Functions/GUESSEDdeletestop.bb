Function GUESSEDdeletestop%(arg0.TF2ZXX8FZ)
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (arg0\Field6 <> $00) Then
        freeentity(arg0\Field6)
    EndIf
    StopChannel(arg0\Field8)
    arg0\Field8 = $00
    If (arg0\Field3 <> 0) Then
        GUESSEDdeletemap((Object.X2B8DB2B8X arg0\Field0))
    EndIf
    GUESSEDsetmap_6(arg0, $00)
    Delete arg0
    Return $00
End Function
