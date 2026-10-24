Function X2DZ6X8ZD2%()
    Local local0.TX2BF6X0FF4
    catcherrors("MP_Update()")
    TX8F404DXB4()
    TDF4FFXB8Z()
    CZ4FXX26B()
    F200DBZ86()
    If (X40BZ0ZDD8\Field2 <> $00) Then
        Return D42X0DXX2()
    EndIf
    If (X4BX024DX0() = $00) Then
        Return $00
    EndIf
    A28ZD6DD4()
    If (TXB2BFFFFFX() <> 0) Then
        X28808FDD0()
        ZZ4Z202F()
        X0X22ZB86D()
        XDZFFBF2ZF()
        TX608D002Z6()
        TXZF2680BFB()
        T202088284X()
    Else
        T8X0604024()
        X6Z80600FD()
        ZXZ4264F4()
        T8X2046020\Field11 = (T8X2046020\Field11 + TX8FF82X024())
        If (70.0 <= T8X2046020\Field11) Then
            For local0 = Each TX2BF6X0FF4
                XD0B0DF0BF(local0)
            Next
        EndIf
        If (((T2XZF288FFX() = $01) And (1050.0 < T8X2046020\Field11)) <> 0) Then
            XZ24ZD260F($04, "", $01)
        EndIf
    EndIf
    catcherrors("Uncaught: MP_Update()")
    Return $00
End Function
