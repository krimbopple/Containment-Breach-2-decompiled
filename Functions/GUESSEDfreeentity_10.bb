Function GUESSEDfreeentity_10%(arg0.TX2BF6X0FF4)
    If (arg0\Field31 = $00) Then
        Return $00
    EndIf
    freeentity(arg0\Field31)
    arg0\Field31 = $00
    Return $00
End Function
