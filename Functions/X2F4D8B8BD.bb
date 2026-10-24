Function X2F4D8B8BD%()
    Local local0%
    Local local1%
    Local local2%
    If (T484F2XDF = Null) Then
        Return $00
    EndIf
    XXD4F0FFX()
    local0 = T20DD48F0X6()
    If (local0 = $00) Then
        XF0Z8X44XB()
        Return $00
    EndIf
    local1 = $FFFFFFFF
    If (opt\Field24 <> "") Then
        For local2 = $00 To (local0 - $01) Step $01
            If (T2ZB824444(local2) = opt\Field24) Then
                local1 = TXFZ68B4ZFZ(local2)
                Exit
            EndIf
        Next
    EndIf
    If (TB620ZZ04Z(local1) = $00) Then
        XF0Z8X44XB()
        Return $00
    EndIf
    T484F2XDF\Field8 = XD2ZF6622Z(TX2XZFFZXB4(), D2XFF4X62(), $00, $00, $00)
    TXB86X4FDDF(T484F2XDF\Field8, $08, 2.0)
    Return $00
End Function
