Function swapinventoryitem%(arg0.items, arg1.items)
    Local local0%
    Local local1%
    Local local2%
    For local2 = $00 To (maxitemamount - $01) Step $01
        If (TX60DB8XBBZ(local2) = arg0) Then
            local0 = local2
        EndIf
        If (TX60DB8XBBZ(local2) = arg1) Then
            local1 = local2
        EndIf
    Next
    TX60DB8XBBZ(local1) = arg0
    TX60DB8XBBZ(local0) = arg1
    Return $00
End Function
