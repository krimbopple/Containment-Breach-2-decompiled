Function GUESSEDfreeentity_8%(arg0.TX2BF6X0FF4)
    If (((arg0\Field52 = $00) Lor (arg0\Field13 = GUESSEDupdatedropitem())) <> 0) Then
        Return $00
    EndIf
    freeentity(arg0\Field52)
    arg0\Field52 = $00
    Return $01
    Return $00
End Function
