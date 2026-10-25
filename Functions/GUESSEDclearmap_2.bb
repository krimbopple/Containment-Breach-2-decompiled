Function GUESSEDclearmap_2%(arg0%)
    Local local0%
    For local0 = $00 To (F2648FXXF\Field6 - $01) Step $01
        _ClearI2IMap(T82D02BF6X(arg0, local0))
    Next
    Return $00
End Function
