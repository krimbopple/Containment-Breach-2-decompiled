Function BDBF6B0XD%()
    Local local0#
    Local local1#
    Local local2#
    Local local3#
    Local local4%
    Local local5#
    Local local6.FF82FZXF4
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    If (T42DZ064FB\Field9 <> 0) Then
        Return $00
    EndIf
    local0 = (300.0 * menuscale)
    local1 = (470.0 * menuscale)
    local2 = (((Float opt\Field21) - local0) - (20.0 * menuscale))
    local3 = (286.0 * menuscale)
    color($00, $00, $00, $60)
    rect((Int local2), (Int local3), (Int local0), (Int local1), $01)
    color($C8, $C8, $C8, $FF)
    rect((Int local2), (Int local3), (Int local0), (Int local1), $00)
    setfontex(XD00026ZX2\Field0[$0A])
    color($FF, $FF, $FF, $FF)
    text((Int ((local0 / 2.0) + local2)), (Int ((12.0 * menuscale) + local3)), "NEWS", $01, $00)
    local4 = $00
    local5 = ((45.0 * menuscale) + local3)
    For local6 = Each FF82FZXF4
        If (((local4 >= (T42DZ064FB\Field5 Shl $02)) And (local4 < ((T42DZ064FB\Field5 Shl $02) + $04))) <> 0) Then
            local7 = ((15.0 * menuscale) + local2)
            local8 = (Float imagewidth(local6\Field2))
            local9 = (Float imageheight(local6\Field2))
            eax_0044 = local6\Field2
            drawimage((Int local7), (Int local5), $00, $00)
            If (((local6\Field0 <> "") And mouseon((Int local7), (Int local5), (Int local8), (Int local9))) <> 0) Then
                If (TDD0Z6BXB6\Field7 <> 0) Then
                    color($2D, $2D, $2D, $80)
                Else
                    color($2D, $2D, $2D, $40)
                EndIf
                rect((Int local7), eax_0044, (Int local8), (Int local9), $01)
            EndIf
            setfontex(XD00026ZX2\Field0[$00])
            color($FF, $FF, $FF, $FF)
            local10 = ((local7 + local8) + (10.0 * menuscale))
            local11 = (((local2 + local0) - local10) - (15.0 * menuscale))
            TXZ864XD40Z(local6\Field1, (Int local10), (Int local5), (Int local11), (Int local9), (Int ((Float fontheight()) * 1.2)), $01, 1.0, 0.0)
            color($C8, $C8, $C8, $80)
            resizeimage(mma\Field1, (Int (local0 - (30.0 * menuscale))), (Int (4.0 * menuscale)))
            drawimage(mma\Field1, (Int ((15.0 * menuscale) + local2)), $00, $01)
            local5 = ((local5 + local9) + (15.0 * menuscale))
        EndIf
        local4 = (local4 + $01)
    Next
    Return $00
End Function
