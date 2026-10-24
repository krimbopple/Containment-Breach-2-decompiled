Function XF0F28FBF%()
    Local local0.npcs
    Local local1%
    Local local2%
    Local local3.TX2BF6X0FF4
    X62DX6Z0FD(TX4BZ4X6D8F())
    TXXF80Z0FD0(TX4BZ4X6D8F(), chs\Field8)
    TXXF80Z0FD0(TX4BZ4X6D8F(), XZ0260X8X2\Field72)
    XB2Z2BB046(TX4BZ4X6D8F(), mtftimer)
    If (n_i\Field11 <> Null) Then
        TXXF80Z0FD0(TX4BZ4X6D8F(), n_i\Field11\Field56)
    Else
        TXXF80Z0FD0(TX4BZ4X6D8F(), $00)
    EndIf
    If (n_i\Field13 <> Null) Then
        TXXF80Z0FD0(TX4BZ4X6D8F(), n_i\Field13\Field56)
    Else
        TXXF80Z0FD0(TX4BZ4X6D8F(), $00)
    EndIf
    TXXF80Z0FD0(TX4BZ4X6D8F(), i_035\Field0)
    For local0 = Each npcs
        If (local0\Field50 = $00) Then
            local1 = ((((((((local0\Field1 <> $00) + ((0.0 <> local0\Field66) Shl $01)) + ((0.0 <> local0\Field65) Shl $02)) + ((0.0 <> local0\Field57) Shl $03)) + ((0.0 <> local0\Field62) Shl $04)) + ((local0\Field59 <> Null) Shl $05)) + ((local0\Field75 <> $00) Shl $06)) + ((0.0 <> local0\Field31) Shl $07))
            local2 = (((((((((0.0 <> local0\Field60) Lor (0.0 <> local0\Field61)) Lor (0.0 <> local0\Field74)) + ((local0\Field29 > $00) Shl $01)) + ((local0\Field93 <> $00) Shl $02)) + ((local0\Field4 > $00) Shl $03)) + ((local0\Field78 <> $00) Shl $04)) + ((local0\Field22 <> $00) Shl $05)) + ((local0\Field79 = $01) Shl $06))
            TXXF80Z0FD0(TX4BZ4X6D8F(), local0\Field56)
            TXXF80Z0FD0(TX4BZ4X6D8F(), local0\Field77)
            TXXF80Z0FD0(TX4BZ4X6D8F(), local1)
            TXXF80Z0FD0(TX4BZ4X6D8F(), local2)
            If (0.0 <> local0\Field66) Then
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field66)
            EndIf
            If (0.0 <> local0\Field65) Then
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field65)
            EndIf
            If (0.0 <> local0\Field57) Then
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field57)
            EndIf
            If (0.0 <> local0\Field62) Then
                T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(local0\Field62, 10.0))
            EndIf
            If (local0\Field59 <> Null) Then
                TXXF80Z0FD0(TX4BZ4X6D8F(), local0\Field59\Field56)
            EndIf
            If (local0\Field75 <> $00) Then
                TXXF80Z0FD0(TX4BZ4X6D8F(), local0\Field75)
                TXXF80Z0FD0(TX4BZ4X6D8F(), local0\Field89)
            EndIf
            If (0.0 <> local0\Field31) Then
                T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(local0\Field31, 10.0))
            EndIf
            If (T20FFXB28X8(local2, $00) <> 0) Then
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field60)
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field61)
                XB2Z2BB046(TX4BZ4X6D8F(), local0\Field74)
            EndIf
            XB2Z2BB046(TX4BZ4X6D8F(), entityx(local0\Field82, $01, 1.0))
            XB2Z2BB046(TX4BZ4X6D8F(), entityy(local0\Field82, $01, 1.0))
            XB2Z2BB046(TX4BZ4X6D8F(), entityz(local0\Field82, $01, 1.0))
            T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(entityyaw(local0\Field82, $01, 1.0), 10.0))
            T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(entityyaw(local0\Field98, $01, 1.0), 10.0))
            T2DD0DZDD4(TX4BZ4X6D8F(), ZBBBD20D2(max(animtime(local0\Field98), 0.0), 10.0))
            T2DD0DZDD4(TX4BZ4X6D8F(), ZBBBD20D2(local0\Field54, 10.0))
            T2DD0DZDD4(TX4BZ4X6D8F(), ZBBBD20D2(local0\Field16, 10.0))
            T2DD0DZDD4(TX4BZ4X6D8F(), TXFB0BDZ8BF(local0\Field52, 100.0))
            T2DD0DZDD4(TX4BZ4X6D8F(), (Int local0\Field34))
            If (local0\Field29 > $00) Then
                TXXF80Z0FD0(TX4BZ4X6D8F(), local0\Field29)
            EndIf
            If (local0\Field4 > $00) Then
                T2DD0DZDD4(TX4BZ4X6D8F(), local0\Field4)
            EndIf
        EndIf
    Next
    TXXF80Z0FD0(TX4BZ4X6D8F(), $00)
    For local3 = Each TX2BF6X0FF4
        If (local3\Field13 > $01) Then
            blitz_TXXF80Z0FD00($06)
            blitz_TXXF80Z0FD00($03)
            TXZXZ4D688(TX4BZ4X6D8F(), $00)
            XFD24F6402(local3\Field7, local3\Field25, $00, $01, $00)
        EndIf
    Next
    Return $00
End Function
