Function T88XD2ZDD%(arg0.T6068XB4Z2)
    Local local0%
    Local local1%
    Local local2%
    blitz_TXBFB002B8X0(arg0\Field30)
    If (arg0\Field2 = Null) Then
        blitz_TXXF80Z0FD00($02)
        blitz_XB2Z2BB0460(entityx(arg0\Field31, $01, 1.0))
        blitz_XB2Z2BB0460(entityy(arg0\Field31, $01, 1.0))
        blitz_XB2Z2BB0460(entityz(arg0\Field31, $01, 1.0))
        blitz_XB2Z2BB0460(arg0\Field22)
        blitz_XB2Z2BB0460(arg0\Field26)
        blitz_XB2Z2BB0460(arg0\Field5)
    Else
        blitz_TXXF80Z0FD00($04)
        blitz_XB2Z2BB0460(entityx(arg0\Field31, $01, 1.0))
        blitz_XB2Z2BB0460(entityy(arg0\Field31, $01, 1.0))
        blitz_XB2Z2BB0460(entityz(arg0\Field31, $01, 1.0))
        getentitylinearvelocity(arg0\Field31, local0, local1, local2)
        blitz_T2DD0DZDD40(TXFB0BDZ8BF(local0, 50.0))
        blitz_T2DD0DZDD40(TXFB0BDZ8BF(local1, 50.0))
        blitz_T2DD0DZDD40(TXFB0BDZ8BF(local2, 50.0))
        getentityangularvelocity(arg0\Field31, local0, local1, local2)
        blitz_T2DD0DZDD40(TXFB0BDZ8BF(local0, 50.0))
        blitz_T2DD0DZDD40(TXFB0BDZ8BF(local1, 50.0))
        blitz_T2DD0DZDD40(TXFB0BDZ8BF(local2, 50.0))
    EndIf
    Return $00
End Function
