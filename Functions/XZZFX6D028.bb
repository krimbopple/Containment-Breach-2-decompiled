Function XZZFX6D028%(arg0.TX2BF6X0FF4, arg1%, arg2%)
    If (arg0\Field55\Field3[arg1]\Field2 = $00) Then
        Return $00
    EndIf
    If (arg2 <> 0) Then
        arg0\Field55\Field3[arg1]\Field5 = Null
    EndIf
    If (arg0\Field55\Field7 = $00) Then
        Return $00
    EndIf
    FF6XD84B4(arg0, $08, $01)
    freeentity(arg0\Field55\Field3[arg1]\Field2)
    arg0\Field55\Field3[arg1]\Field2 = $00
    Return $00
End Function
