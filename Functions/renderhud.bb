Function renderhud%(arg0#)
    Local local0#
    Local local1%
    Local local2%
    Local local3%
    Local local4#
    Local local5#
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15#
    Local local16#
    If ((((Int XZ0260X8X2\Field48) Lor (0.0 > XZ0260X8X2\Field52)) Lor (XZ0260X8X2\Field38 < $02)) <> 0) Then
        Return $00
    EndIf
    local0 = menuscale
    menuscale = (menuscale * arg0)
    For local1 = $00 To $12 Step $01
        XD426XD680[local1] = imagewidth(X2Z260BF0Z\Field3[local1])
        TX2X228ZZ0X[local1] = imageheight(X2Z260BF0Z\Field3[local1])
        scaleimage(X2Z260BF0Z\Field3[local1], arg0, arg0)
    Next
    local2 = (Int ((((Float (-200.0 > XZ0260X8X2\Field42)) * rnd(-2.0, 2.0)) + 70.0) * menuscale))
    local3 = (Int ((Float opt\Field46) - ((((Float (-200.0 > XZ0260X8X2\Field42)) * rnd(-2.0, 2.0)) + 15.0) * menuscale)))
    local4 = (200.0 * menuscale)
    local5 = (11.0 * menuscale)
    local8 = (imagewidth(X2Z260BF0Z\Field3[$00]) + $02)
    local9 = (Int (40.0 * menuscale))
    local10 = (Int (5.0 * menuscale))
    local11 = (local9 + $01)
    local12 = (local8 + $02)
    local13 = (local11 + $01)
    local14 = $01
    local15 = (30.0 * menuscale)
    local16 = 1.0
    If (T8X2046020\Field1 <> 0) Then
        local3 = (Int ((Float local3) - local15))
        local16 = 1.0
        If (25.0 >= XZ0260X8X2\Field56) Then
            local16 = max(0.15, (XZ0260X8X2\Field56 / 25.0))
        EndIf
        renderbar(X2Z260BF0Z\Field4[$02], local2, local3, (Int local4), (Int local5), XZ0260X8X2\Field56, 100.0, $C1, (Int (193.0 * local16)), (Int (193.0 * local16)), $00)
        If (XZ0260X8X2\Field25 <> 0) Then
            local6 = $02
        ElseIf ((((((keydown(key\Field12) And (invopen = $00)) And (otheropen = Null)) And (0.0 < XZ0260X8X2\Field76)) And (chs\Field7 = $00)) And (0.0 < XZ0260X8X2\Field56)) <> 0) Then
            local6 = $01
        Else
            local6 = $00
        EndIf
        If ((((((((((playerroom\Field22\Field21 = $6F) And (pd_event <> Null)) And (5.0 <> pd_event\Field7)) Lor (1.5 <= XZ0260X8X2\Field11)) Lor (1.0 < XZ0260X8X2\Field65)) Lor (100.0 > XZ0260X8X2\Field6)) Lor (0.0 < i_1025\Field0[$00])) Lor (0.0 < i_966\Field1)) Lor (70.0 < XZ0260X8X2\Field70)) <> 0) Then
            color($C8, $00, $00, $FF)
        ElseIf ((((((chs\Field6 Lor (1.0 > XZ0260X8X2\Field65)) Lor (T8660BZ460\Field3 >= $03)) Lor (i_1499\Field8 = $02)) Lor (T8660BZ460\Field10 >= $03)) Lor ((15.0 < i_1025\Field0[$06]) And (75.0 > i_1025\Field0[$06]))) <> 0) Then
            color($00, $C8, $00, $FF)
        Else
            color($FF, $FF, $FF, $FF)
        EndIf
        drawimage((local2 - local9), ((local3 + $01) - local10), $00, $01)
        local3 = (Int ((Float local3) - local15))
        local16 = 1.0
        If (210.0 > XZ0260X8X2\Field53) Then
            local16 = max(0.15, (XZ0260X8X2\Field53 / 210.0))
        EndIf
        renderbar(blinkmeterimg, local2, local3, (Int local4), (Int local5), min(XZ0260X8X2\Field53, XZ0260X8X2\Field12), XZ0260X8X2\Field12, $C1, (Int (193.0 * local16)), (Int (193.0 * local16)), $00)
        If (0.0 > XZ0260X8X2\Field53) Then
            local7 = $04
        Else
            local7 = $03
        EndIf
        If (((((((550.0 < XZ0260X8X2\Field64) Lor (1.0 < XZ0260X8X2\Field7)) Lor (0.0 < XZ0260X8X2\Field78)) Lor (((0.3 >= secondarylighton) And (T8660BZ460\Field8 = $00)) And (T8660BZ460\Field11 = $00))) Lor (((0.0 < XZ0260X8X2\Field70) And (T8660BZ460\Field8 = $00)) And (T8660BZ460\Field11 = $00))) Lor (0.0 < i_966\Field1)) <> 0) Then
            color($C8, $00, $00, $FF)
        ElseIf (((1.0 > XZ0260X8X2\Field7) Lor chs\Field2) <> 0) Then
            color($00, $C8, $00, $FF)
        Else
            color($FF, $FF, $FF, $FF)
        EndIf
        drawimage((local2 - local9), ((local3 + $01) - local10), $00, $01)
        If (GUESSEDrendercolor_4((Float local11), (Float local8), local15, (Float local9), (Float local10), (Float local2), (Float local3), local4, local5) <> 0) Then
            local3 = (Int ((Float local3) - local15))
        EndIf
        If (XF42DX80F4 > (-399.0 * menuscale)) Then
            local3 = (Int ((Float local3) - local15))
            If (T8660BZ460\Field10 > $00) Then
                local16 = 1.0
                If (125.0 > removehazmattimer) Then
                    local16 = max(0.15, (removehazmattimer / 125.0))
                EndIf
                renderbar(blinkmeterimg, (Int XF42DX80F4), local3, (Int local4), (Int local5), removehazmattimer, 500.0, $C1, (Int (193.0 * local16)), (Int (193.0 * local16)), $00)
            Else
                local16 = 1.0
                If (125.0 > remove714timer) Then
                    local16 = max(0.15, (remove714timer / 125.0))
                EndIf
                renderbar(blinkmeterimg, (Int XF42DX80F4), local3, (Int local4), (Int local5), remove714timer, 500.0, $C1, (Int (193.0 * local16)), (Int (193.0 * local16)), $00)
            EndIf
            If (T8660BZ460\Field10 = $04) Then
                color($00, $C8, $00, $FF)
            ElseIf (i_714\Field0 = $01) Then
                color($C8, $00, $00, $FF)
            Else
                color($FF, $FF, $FF, $FF)
            EndIf
            drawimage(X2Z260BF0Z\Field3[$07], ((local3 + $01) - local10), $00, $01)
        EndIf
        If (A8F8B0DF4 > (-399.0 * menuscale)) Then
            local3 = (Int ((Float local3) - local15))
            local16 = 1.0
            If (175.0 > i_268\Field1) Then
                local16 = max(0.15, (i_268\Field1 / 175.0))
            EndIf
            renderbar(blinkmeterimg, (Int A8F8B0DF4), local3, (Int local4), (Int local5), i_268\Field1, 700.0, $C1, (Int (193.0 * local16)), (Int (193.0 * local16)), $00)
            If (((i_714\Field0 > $00) Lor (T8660BZ460\Field3 = $04)) <> 0) Then
                color($C8, $00, $00, $FF)
            ElseIf (i_268\Field2 = $03) Then
                color($00, $C8, $00, $FF)
            Else
                color($FF, $FF, $FF, $FF)
            EndIf
            drawimage(X2Z260BF0Z\Field3[$08], ((local3 + $01) - local10), $00, $01)
        EndIf
    Else
        local3 = (Int ((Float local3) - local15))
        local3 = (Int ((Float local3) - local15))
        If (GUESSEDrendercolor_4((Float local11), (Float local8), local15, (Float local9), (Float local10), (Float local2), (Float local3), local4, local5) <> 0) Then
            local3 = (Int ((Float local3) - local15))
        EndIf
        If (XF42DX80F4 > (-399.0 * menuscale)) Then
            local3 = (Int ((Float local3) - local15))
        EndIf
        If (A8F8B0DF4 > (-399.0 * menuscale)) Then
            local3 = (Int ((Float local3) - local15))
        EndIf
    EndIf
    For local1 = $00 To $12 Step $01
        resizeimage(X2Z260BF0Z\Field3[local1], XD426XD680[local1], TX2X228ZZ0X[local1])
    Next
    local3 = (Int ((Float local3) - (40.0 * local0)))
    GUESSEDrenderrenderhud((30.0 * menuscale), (Float local3))
    menuscale = local0
    color($FF, $FF, $FF, (Int ((1.0 - XZ0260X8X2\Field59) * 64.0)))
    imagewidth(X2Z260BF0Z\Field3[$12])
    drawimage(X2Z260BF0Z\Field3[$12], (Int ((Float TDD0Z6BXB6\Field9) - ((Float imageheight(X2Z260BF0Z\Field3[$12])) * 0.5))), $00, $01)
    Return $00
End Function
