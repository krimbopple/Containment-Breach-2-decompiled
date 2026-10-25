Function GUESSEDsetred%(arg0$)
    If (opt\Field43 = $00) Then
        Return $00
    EndIf
    GUESSEDcallsetglobal(("&red[]" + arg0), $01)
    Return $00
End Function
