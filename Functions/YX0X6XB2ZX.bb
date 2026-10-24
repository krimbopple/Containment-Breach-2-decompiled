Function YX0X6XB2ZX%(arg0.T484FFBZX, arg1.TX2BF6X0FF4)
    Local local0%
    Local local1.items
    If (arg1 = Null) Then
        Return $00
    EndIf
    TXXF80Z0FD0(arg0, arg1\Field55\Field21)
    TXXF80Z0FD0(arg0, arg1\Field55\Field16)
    XB2Z2BB046(arg0, 0.0)
    XB2Z2BB046(arg0, arg1\Field55\Field18)
    If (arg1\Field46\Field13 <> Null) Then
        T6DZD4FZ60(arg0, arg1\Field46\Field13)
    Else
        TXBFB002B8X(arg0, $00)
    EndIf
    For local0 = $00 To $09 Step $01
        T2DD0DZDD4(arg0, E0B68ZZ2(arg1, local0))
        local1 = A6020Z028(arg1, local0)
        If (local1 <> Null) Then
            T2DD0DZDD4(arg0, local1\Field6\Field11)
        Else
            T2DD0DZDD4(arg0, $00)
        EndIf
    Next
    Return $00
End Function
