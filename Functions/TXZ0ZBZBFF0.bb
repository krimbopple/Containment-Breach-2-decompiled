Function TXZ0ZBZBFF0%()
    Local local0%
    Local local1%
    local0 = $00
    For local1 = $00 To (maxitemamount - $01) Step $01
        If (TX60DB8XBBZ(local1) <> Null) Then
            local0 = (local0 + $01)
        EndIf
    Next
    Return local0
    Return $00
End Function
