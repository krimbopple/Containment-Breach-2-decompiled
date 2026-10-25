Function GUESSEDfreeentity_3%(arg0.TX2BF6X0FF4)
    If (arg0\Field44\Field0 <> $00) Then
        freeentity(arg0\Field44\Field0)
        arg0\Field44\Field0 = $00
    EndIf
    Return $00
End Function
