Function YX40Z4FDFZ%(arg0.TX2BF6X0FF4, arg1%, arg2%, arg3%)
    Local local0%
    Local local1%
    Local local2.TBBF668XX4
    If ((((arg1 > $40) Lor (arg0\Field55\Field7 = $00)) Lor (0.0 >= arg0\Field55\Field5\Field52[arg1])) <> 0) Then
        Return $00
    EndIf
    If (animating(arg0\Field55\Field7, arg1) = $00) Then
        local0 = (animseq(arg0\Field55\Field7) <> $00)
        FF6XD84B4(arg0, arg3, $01)
        animate(arg0\Field55\Field7, arg2, arg0\Field55\Field5\Field52[arg1], arg1, (10.0 * (Float local0)))
        For local1 = $00 To (eax_0067 - $01) Step $01
            
            If (eax_005E = arg1) Then
                Return $00
            EndIf
        Next
        local2 = (New TBBF668XX4)
        local2\Field1 = arg1
        local2\Field0 = arg3
    EndIf
    Return $00
End Function
