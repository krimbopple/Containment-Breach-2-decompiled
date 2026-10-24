Function swapotheropenitem%(arg0.items, arg1.items)
    Local local0%
    Local local1%
    Local local2%
    For local2 = $00 To (otheropen\Field36 - $01) Step $01
        If (otheropen\Field8[local2] = arg0) Then
            local0 = local2
        EndIf
        If (otheropen\Field8[local2] = arg1) Then
            local1 = local2
        EndIf
    Next
    otheropen\Field8[local1] = arg0
    otheropen\Field8[local0] = arg1
    Return $00
End Function
