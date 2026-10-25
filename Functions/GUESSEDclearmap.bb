Function GUESSEDclearmap%()
    Local local0%
    Local local1%
    For local0 = $00 To $05 Step $01
        _ClearI2IMap(T2X0XXBX084\Field1[local0])
        _ClearIntVector(T2X0XXBX084\Field0[local0])
    Next
    For local0 = $00 To (F2648FXXF\Field3 - $01) Step $01
        For local1 = $00 To (F2648FXXF\Field6 - $01) Step $01
            If (T82D02BF6X(local0, local1) <> $00) Then
                _ClearI2IMap(T82D02BF6X(local0, local1))
            EndIf
        Next
    Next
    Delete Each TF2886ZFB2
    Return $00
End Function
