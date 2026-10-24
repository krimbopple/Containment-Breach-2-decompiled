Function T2XXFF0ZDD2%(arg0%)
    Local local0%
    Local local1.XF808F44XB
    Local local2.levers
    Local local3.X82B82400
    Local local4.TX2BF6X0FF4
    X62DX6Z0FD(TX4BZ4X6D8F())
    If (arg0 = $07) Then
        local0 = $00
        For local1 = Each XF808F44XB
            If (local1\Field7 <> 0) Then
                local0 = local1\Field0\Field27[local1\Field1]
                If (local0 <> $00) Then
                    TXXF80Z0FD0(TX4BZ4X6D8F(), local1\Field0\Field1)
                    TXXF80Z0FD0(TX4BZ4X6D8F(), local1\Field1)
                    TXXF80Z0FD0(TX4BZ4X6D8F(), local1\Field5)
                    If (T20FFXB28X8(local1\Field5, $00) <> 0) Then
                        XB2Z2BB046(TX4BZ4X6D8F(), entityx(local0, $01, 1.0))
                    EndIf
                    If (T20FFXB28X8(local1\Field5, $01) <> 0) Then
                        XB2Z2BB046(TX4BZ4X6D8F(), entityy(local0, $01, 1.0))
                    EndIf
                    If (T20FFXB28X8(local1\Field5, $02) <> 0) Then
                        XB2Z2BB046(TX4BZ4X6D8F(), entityz(local0, $01, 1.0))
                    EndIf
                    If (T20FFXB28X8(local1\Field5, $03) <> 0) Then
                        T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(entitypitch(local0, $01, 1.0), 10.0))
                    EndIf
                    If (T20FFXB28X8(local1\Field5, $04) <> 0) Then
                        T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(entityyaw(local0, $01, 1.0), 10.0))
                    EndIf
                    If (T20FFXB28X8(local1\Field5, $05) <> 0) Then
                        T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(entityroll(local0, $01, 1.0), 10.0))
                    EndIf
                EndIf
            EndIf
        Next
    Else
        For local3 = Each X82B82400
            If (local3\Field11 <> 0) Then
                local2 = local3\Field0\Field9[local3\Field1]
                If (local2 <> Null) Then
                    TXXF80Z0FD0(TX4BZ4X6D8F(), local3\Field0\Field1)
                    TXXF80Z0FD0(TX4BZ4X6D8F(), local3\Field1)
                    TXXF80Z0FD0(TX4BZ4X6D8F(), local3\Field6)
                    If (T20FFXB28X8(local3\Field6, $00) <> 0) Then
                        T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(entitypitch(local2\Field1, $01, 1.0), 10.0))
                    EndIf
                    If (T20FFXB28X8(local3\Field6, $01) <> 0) Then
                        T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(entityyaw(local2\Field1, $01, 1.0), 10.0))
                    EndIf
                    If (T20FFXB28X8(local3\Field6, $02) <> 0) Then
                        T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(entityroll(local2\Field1, $01, 1.0), 10.0))
                    EndIf
                EndIf
            EndIf
        Next
    EndIf
    TXXF80Z0FD0(TX4BZ4X6D8F(), $00)
    For local4 = Each TX2BF6X0FF4
        If (local4\Field13 > $01) Then
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00(arg0)
            TXZXZ4D688(TX4BZ4X6D8F(), $00)
            XFD24F6402(local4\Field7, local4\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function
