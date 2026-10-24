Function TX44ZDFDZBB%(arg0%, arg1#)
    Local local0.TX2BF6X0FF4
    For local0 = Each TX2BF6X0FF4
        If (arg1 > entitydistancesquared(local0\Field52, arg0)) Then
            Return $01
        EndIf
    Next
    Return $00
    Return $00
End Function
