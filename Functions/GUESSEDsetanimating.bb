Function GUESSEDsetanimating%(arg0.TX2BF6X0FF4, arg1%, arg2%)
    Local local0%
    Local local1%
    If (arg0\Field55\Field7 = $00) Then
        Return $00
    EndIf
    If (arg2 <> $FFFFFFFF) Then
        Return (animseq(arg0\Field55\Field7) = arg2)
    EndIf
    local0 = eax_0018
    For local1 = $00 To (local0 - $01) Step $01
        
        
        If ((((eax_002C And arg1) <> $00) And animating(arg0\Field55\Field7, eax_0042)) <> 0) Then
            Return $01
        EndIf
    Next
    Return $00
    Return $00
End Function
