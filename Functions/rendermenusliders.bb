Function rendermenusliders%()
    Local local0.menuslider
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    local1 = imageheight(blinkmeterimg)
    resizeimage(blinkmeterimg, imagewidth(blinkmeterimg), (Int ((Float local1) * 1.4)))
    For local0 = Each menuslider
        local2 = local0\Field3
        local3 = (Int ((Float local0\Field0) - (8.0 * menuscale)))
        local4 = local0\Field0
        local5 = (Int ((Float local0\Field7) + (14.0 * menuscale)))
        local6 = (Int (2.0 * menuscale))
        local7 = imageheight(blinkmeterimg)
        local8 = imageheight(blinkmeterimg)
        local9 = $C8
        local10 = $C8
        local11 = $C8
        color(local9, local10, local11, $FF)
        renderframe(local2, local3, local5, local7, $00, $00, $00, $01)
        rect(local2, local3, local6, local7, $01)
        setfontex(XD00026ZX2\Field0[$00])
        If (local0\Field8 = $03) Then
            rect((Int ((Float ((local0\Field7 Sar $01) + local2)) + (5.0 * menuscale))), local3, local6, local7, $01)
            rect((Int ((Float (local0\Field7 + local2)) + (11.0 * menuscale))), local3, local6, local7, $01)
            color($AA, $AA, $AA, $FF)
            If (local0\Field1 = $00) Then
                drawblock(blinkmeterimg, local2, local3, $00)
                textex((Int ((2.0 * menuscale) + (Float local2))), (Int ((12.0 * menuscale) + (Float local4))), local0\Field4, $01, $00)
            ElseIf (local0\Field1 = $01) Then
                eax_005A = (Int ((Float ((local0\Field7 Sar $01) + local2)) + (3.0 * menuscale)))
                drawblock(blinkmeterimg, local3, $00, $00)
                textex((Int ((Float ((local0\Field7 Sar $01) + local2)) + (7.0 * menuscale))), (Int ((12.0 * menuscale) + (Float local4))), local0\Field5, $01, $00)
            Else
                eax_0074 = (Int ((Float (local0\Field7 + local2)) + (6.0 * menuscale)))
                drawblock(blinkmeterimg, local3, $00, $00)
                textex((Int ((Float (local0\Field7 + local2)) + (12.0 * menuscale))), (Int ((12.0 * menuscale) + (Float local4))), local0\Field10, $01, $00)
            EndIf
        ElseIf (local0\Field8 = $05) Then
            rect((Int ((Float ((local0\Field7 Sar $02) + local2)) + (2.5 * menuscale))), local3, eax_0074, eax_005A, $01, 0.0)
            rect((Int ((Float ((local0\Field7 Sar $01) + local2)) + (5.0 * menuscale))), local3, local6, local7, $01)
            rect((Int ((((Float local0\Field7) * 0.75) + (Float local2)) + (7.5 * menuscale))), local3, local6, local7, $01)
            rect((Int ((Float (local0\Field7 + local2)) + (11.0 * menuscale))), local3, local6, local7, $01)
            color($AA, $AA, $AA, $FF)
            If (local0\Field1 = $00) Then
                drawblock(blinkmeterimg, local2, local3, $00)
                textex((Int ((2.0 * menuscale) + (Float local2))), (Int ((12.0 * menuscale) + (Float local4))), local0\Field4, $01, $00)
            ElseIf (local0\Field1 = $01) Then
                eax_00C4 = (Int ((Float ((local0\Field7 Sar $02) + local2)) + (1.5 * menuscale)))
                drawblock(blinkmeterimg, local3, $00, $00)
                textex((Int ((Float ((local0\Field7 Sar $02) + local2)) + (4.5 * menuscale))), (Int ((12.0 * menuscale) + (Float local4))), local0\Field5, $01, $00)
            ElseIf (local0\Field1 = $02) Then
                eax_00E2 = (Int ((Float ((local0\Field7 Sar $01) + local2)) + (3.0 * menuscale)))
                drawblock(blinkmeterimg, local3, $00, $00)
                textex((Int ((Float ((local0\Field7 Sar $01) + local2)) + (7.0 * menuscale))), (Int ((12.0 * menuscale) + (Float local4))), local0\Field10, $01, $00)
            ElseIf (local0\Field1 = $03) Then
                ebx_0060 = (Int ((((Float local0\Field7) * 0.75) + (Float local2)) + (4.5 * menuscale)))
                drawblock(blinkmeterimg, local3, $00, $00)
                textex((Int ((((Float local0\Field7) * 0.75) + (Float local2)) + (9.5 * menuscale))), (Int ((12.0 * menuscale) + (Float local4))), local0\Field2, $01, $00)
            Else
                eax_0112 = (Int ((Float (local0\Field7 + local2)) + (6.0 * menuscale)))
                drawblock(blinkmeterimg, local3, $00, $00)
                textex((Int ((Float (local0\Field7 + local2)) + (12.0 * menuscale))), (Int ((12.0 * menuscale) + (Float local4))), local0\Field9, $01, $00)
            EndIf
        EndIf
        If (((local0\Field6 = onsliderid) Lor mouseon(local2, local3, local5, (local7 + local8))) <> 0) Then
            color($64, $64, $64, $20)
            rect(local2, local3, eax_0112, ebx_0060, eax_00E2, eax_00C4)
        EndIf
    Next
    resizeimage(blinkmeterimg, imagewidth(blinkmeterimg), local1)
    Return $00
End Function
