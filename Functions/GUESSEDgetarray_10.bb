Function GUESSEDgetarray_10%(arg0%)
    Local local0%
    Local local1%
    For local0 = $00 To (maxitemamount - $01) Step $01
        If (((TX60DB8XBBZ(local0) <> Null) And (TX60DB8XBBZ(local0)\Field6\Field9 = arg0)) <> 0) Then
            Return TX60DB8XBBZ(local0)\Field27
        EndIf
    Next
    For local0 = $00 To (maxitemamount - $01) Step $01
        If (TX60DB8XBBZ(local0) <> Null) Then
            For local1 = $00 To (TX60DB8XBBZ(local0)\Field36 - $01) Step $01
                If (((TX60DB8XBBZ(local0)\Field8[local1] <> Null) And (TX60DB8XBBZ(local0)\Field8[local1]\Field6\Field9 = arg0)) <> 0) Then
                    Return TX60DB8XBBZ(local0)\Field8[local1]\Field27
                EndIf
            Next
        EndIf
    Next
    Return $00
    Return $00
End Function
