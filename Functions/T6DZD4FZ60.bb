Function T6DZD4FZ60%(arg0.T484FFBZX, arg1.T20BFZFZ62X)
    Local local0%
    TXBFB002B8X(arg0, arg1\Field2)
    TXXF80Z0FD0(arg0, ((arg1\Field18 > $00) + (arg1\Field7 Shl $01)))
    TXXF80Z0FD0(arg0, arg1\Field13)
    TXXF80Z0FD0(arg0, arg1\Field15)
    TXXF80Z0FD0(arg0, arg1\Field16)
    XB2Z2BB046(arg0, entityx(arg1\Field19, $00, 1.0))
    XB2Z2BB046(arg0, entityy(arg1\Field19, $00, 1.0))
    XB2Z2BB046(arg0, entityz(arg1\Field19, $00, 1.0))
    T2DD0DZDD4(arg0, TXFB0BDZ8BF(entityyaw(arg1\Field19, $00, 1.0), 10.0))
    TXBFB002B8X(arg0, arg1\Field0)
    T2DD0DZDD4(arg0, arg1\Field5)
    If (arg1\Field18 > $00) Then
        For local0 = $00 To $09 Step $01
            If (arg1\Field10[local0] <> Null) Then
                TXXF80Z0FD0(arg0, arg1\Field10[local0]\Field5)
            Else
                TXXF80Z0FD0(arg0, $00)
            EndIf
        Next
    EndIf
    Return $00
End Function
