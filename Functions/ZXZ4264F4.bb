Function ZXZ4264F4%()
    Local local0.TX2BF6X0FF4
    Local local1%
    Local local2%
    Local local3%
    If (((TXXZZZ42Z68() = $00) Lor (T444ZXX602($00, $3C) = $00)) <> 0) Then
        Return $00
    EndIf
    local0 = TXXF6F02DB2[TXXDZB2ZBXX()]
    If (local0 <> Null) Then
        local1 = $00
        local2 = $00
        If (TXDFXDZXXDD\Field10 <> Null) Then
            local2 = $01
        ElseIf (TXDFXDZXXDD\Field13 <> Null) Then
            local1 = $01
            local2 = $01
        EndIf
        blitz_TXXF80Z0FD00($04)
        blitz_TXXF80Z0FD00(TXXDZB2ZBXX())
        blitz_XB2Z2BB0460(local0\Field19)
        blitz_XB2Z2BB0460(local0\Field49)
        blitz_XB2Z2BB0460(local0\Field26)
        blitz_T2DD0DZDD40(TXFB0BDZ8BF(local0\Field36, 100.0))
        blitz_T2DD0DZDD40(TXFB0BDZ8BF(local0\Field1, 100.0))
        blitz_TXXF80Z0FD00(local0\Field20)
        blitz_TXXF80Z0FD00(local0\Field3)
        blitz_TXXF80Z0FD00((((((((128.0 < DZ64X028\Field22) + ((2.0 <= local0\Field45) Shl $01)) + (T8660BZ460\Field5 Shl $02)) + (local2 Shl $03)) + (local1 Shl $04)) + ((TXDFXDZXXDD\Field2 > $00) Shl $05)) + ((local0\Field53 <> $00) Shl $06)))
        blitz_TXXF80Z0FD00(((((XZ0260X8X2\Field77 + ((-1.0 >= XZ0260X8X2\Field58) Shl $01)) + ((1.0 <= XZ0260X8X2\Field58) Shl $02)) + ((local0\Field37 = $01) Shl $03)) + (T84F6Z402D\Field2 Shl $04)))
        blitz_TXXF80Z0FD00(AFBZBD42F(XZ0260X8X2\Field11, 10.0))
        blitz_T2DD0DZDD40((Int XZ0260X8X2\Field70))
        blitz_TXXF80Z0FD00(Y0B2DBZBX6(i_966\Field1, 10.0))
        blitz_T2DD0DZDD40(local0\Field29)
        blitz_TXXF80Z0FD00(TXDFXDZXXDD\Field3)
        If (local2 <> 0) Then
            If (TXDFXDZXXDD\Field10 <> Null) Then
                blitz_TXXF80Z0FD00(TXDFXDZXXDD\Field10\Field0\Field1)
                blitz_TXXF80Z0FD00(TXDFXDZXXDD\Field10\Field1)
                blitz_T2DD0DZDD40(TXFB0BDZ8BF(entityroll(TXDFXDZXXDD\Field10\Field0\Field27[TXDFXDZXXDD\Field10\Field1], $01, 1.0), 10.0))
            ElseIf (TXDFXDZXXDD\Field13 <> Null) Then
                blitz_TXXF80Z0FD00(TXDFXDZXXDD\Field13\Field0\Field1)
                blitz_TXXF80Z0FD00(TXDFXDZXXDD\Field13\Field1)
                blitz_T2DD0DZDD40(TXFB0BDZ8BF(entitypitch(TXDFXDZXXDD\Field13\Field0\Field9[TXDFXDZXXDD\Field13\Field1]\Field1, $01, 1.0), 10.0))
            EndIf
        EndIf
        If (TXDFXDZXXDD\Field2 > $00) Then
            blitz_TXBFB002B8X0(TXDFXDZXXDD\Field2)
            blitz_TXBFB002B8X0(TXDFXDZXXDD\Field5)
        EndIf
        If (local0\Field53 <> $00) Then
            blitz_TXBFB002B8X0(local0\Field53)
        EndIf
        For local3 = $00 To $05 Step $01
            blitz_TXBFB002B8X0(TXDFXDZXXDD\Field16[local3])
        Next
        If (((menuopen Lor consoleopen) Lor TX6X48DXXDX) <> 0) Then
            blitz_TXBFB002B8X0(TXDFXDZXXDD\Field1)
        Else
            TXDB2BXD060(AXXZXBDZ2(), BZ02XDD02(AXXZXBDZ2()))
            blitz_TXXF80Z0FD00((((((((keydown($16) + (keydown($17) Shl $01)) + (keydown($18) Shl $02)) + (keydown($19) Shl $03)) + (keydown($31) Shl $04)) + (keydown($32) Shl $05)) + (keydown($3C) Shl $06)) + (keydown($3E) Shl $07)))
            blitz_TXXF80Z0FD00((((((((TDD0Z6BXB6\Field1 + (TDD0Z6BXB6\Field8 Shl $01)) + (keydown($38) Shl $02)) + (keydown($21) Shl $03)) + (keydown($22) Shl $04)) + (keydown($23) Shl $05)) + (keydown($24) Shl $06)) + (keydown($25) Shl $07)))
            blitz_TXXF80Z0FD00((((((((keydown($02) + (keydown($03) Shl $01)) + (keydown($04) Shl $02)) + (keydown($05) Shl $03)) + (keydown($06) Shl $04)) + (keydown($07) Shl $05)) + (keydown($08) Shl $06)) + (keydown($09) Shl $07)))
            blitz_TXXF80Z0FD00((((((((keydown($0A) + (keydown($0B) Shl $01)) + (keydown($43) Shl $02)) + (keydown($44) Shl $03)) + (keydown($2C) Shl $04)) + (keydown($2D) Shl $05)) + (keydown(key\Field3) Shl $06)) + (keydown(key\Field12) Shl $07)))
            TXDFXDZXXDD\Field1 = T20024FDF4X(AXXZXBDZ2())
        EndIf
        blitz_TXBFB002B8X0(T2FFB8B2F0())
        E24848B4X($00, $01, $00)
    EndIf
    Return $00
End Function
