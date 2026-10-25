Function GUESSEDsetlight.TX64X4ZXXX0(arg0%)
    Local local0.TX64X4ZXXX0
    For local0 = Each TX64X4ZXXX0
        If (local0\Field7 = arg0) Then
            Return local0
        EndIf
    Next
    Return Null
End Function
