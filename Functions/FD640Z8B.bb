Function FD640Z8B%(arg0.TX2BF6X0FF4, arg1.items)
    Local local0%
    If (arg0\Field5 >= maxitemamount) Then
        Return $00
    EndIf
    arg0\Field5 = (arg0\Field5 + $01)
    arg1\Field29 = arg0\Field13
    arg1\Field17 = $01
    arg1\Field30 = $FFFFFFFF
    hideentity(arg1\Field9)
    XZ8F86B8D6(arg1)
    For local0 = $00 To (arg1\Field36 - $01) Step $01
        If (arg1\Field8[local0] <> Null) Then
            arg1\Field8[local0]\Field29 = arg0\Field13
        EndIf
    Next
    Return $00
End Function
