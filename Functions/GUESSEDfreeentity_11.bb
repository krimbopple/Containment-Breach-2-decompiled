Function GUESSEDfreeentity_11%(arg0.TX2BF6X0FF4, arg1%)
    If (arg0\Field43[arg1]\Field6 <> $00) Then
        freeentity(arg0\Field43[arg1]\Field6)
        arg0\Field43[arg1]\Field6 = $00
    EndIf
    Return $01
    Return $00
End Function
